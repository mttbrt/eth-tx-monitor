package com.mttbrt.ethtxmon.loader;

import com.google.gson.Gson;
import com.mttbrt.ethtxmon.loader.model.TxApiResponse;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@EnableScheduling
public class DataRetriever {

  private static final String URL = "https://api.etherscan.io";
  private static final Gson gson = new Gson(); // TODO: get this a bean
  private static final MultiValueMap<String, String> BASE_QUERY_PARAMS = new HttpHeaders();

  static {
    // TODO: read these values from properties
    BASE_QUERY_PARAMS.set("module", "account");
    BASE_QUERY_PARAMS.set("action", "txlist");
    BASE_QUERY_PARAMS.set("startblock", "0");
    BASE_QUERY_PARAMS.set("endblock", "999999999");
    BASE_QUERY_PARAMS.set("page", "1");
    BASE_QUERY_PARAMS.set("offset", "10");
    BASE_QUERY_PARAMS.set("apikey", System.getenv("APIKEY"));
  }

  private final WebClient client = WebClient.create(URL);

  @Value("${ethtx.tmp}")
  private String tmpDir;

  @Scheduled(fixedRate = 5000)
  void execute() {
    TxApiResponse res =
        client
            .get()
            .uri(
                uriBuilder ->
                    uriBuilder
                        .path("/api")
                        .queryParams(BASE_QUERY_PARAMS)
                        .queryParam("address", "0xde0b295669a9fd93d5f28d9ec85e40f4cb697bae")
                        .build())
            .retrieve()
            .bodyToMono(TxApiResponse.class)
            .block();

    String readyFolder = tmpDir + File.separator + "ready";
    File jsonFile = new File(readyFolder + File.separator + System.currentTimeMillis() + ".json");
    try (FileWriter fileWriter = new FileWriter(jsonFile);
        BufferedWriter writer = new BufferedWriter(fileWriter)) {
      writer.write(gson.toJson(res));
      System.out.println(
          "Data saved to " + jsonFile.getAbsolutePath()); // TODO: user a proper logger instead
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
