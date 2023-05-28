package com.mttbrt.ethtxmon.loader;

import com.google.gson.Gson;
import com.mttbrt.ethtxmon.loader.model.EthTxException;
import com.mttbrt.ethtxmon.loader.model.TxApiResponse;
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

  private final Gson gson;
  private final String tmpDir;
  private final WebClient client;
  private final MultiValueMap<String, String> baseQueryParams;

  public DataRetriever(
      Gson gson,
      @Value("${eth-tx.tmpDir}") String tmpDir,
      @Value("${eth-tx.api.endpoint}") String apiEndpoint,
      @Value("${eth-tx.api.offset}") String offset,
      @Value("${eth-tx.api.startBlock}") String startBlock,
      @Value("${eth-tx.api.endBlock}") String endBlock) {
    this.gson = gson;
    this.tmpDir = tmpDir;
    this.client = WebClient.create(apiEndpoint);
    this.baseQueryParams = new HttpHeaders();
    this.baseQueryParams.set("module", "account");
    this.baseQueryParams.set("action", "txlist");
    this.baseQueryParams.set("offset", offset);
    this.baseQueryParams.set("startblock", startBlock);
    this.baseQueryParams.set("endblock", endBlock);
    this.baseQueryParams.set("apikey", System.getenv("APIKEY"));
  }

  @Scheduled(fixedRate = 5000)
  public void execute() {
    client
        .get()
        .uri(
            uriBuilder ->
                uriBuilder
                    .queryParams(baseQueryParams)
                    .queryParam("address", "0xde0b295669a9fd93d5f28d9ec85e40f4cb697bae")
                    .queryParam("page", "1")
                    .build())
        .retrieve()
        .bodyToMono(TxApiResponse.class)
        .subscribe(
            res -> {
              try {
                IOUtils.writeToNewFile(tmpDir, gson.toJson(res));
              } catch (IOException e) {
                throw new EthTxException(e);
              }
            });
  }
}
