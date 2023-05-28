package com.mttbrt.ethtxmon.loader;

import com.google.gson.Gson;
import com.mttbrt.ethtxmon.loader.model.TxApiResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Value;

public class TxLoadingReader implements ItemReader<TxApiResponse> {

  private static final Gson gson = new Gson(); // TODO: get this a bean
  @Value("${ethtx.tmp}")
  private String tmpDir;

  @Override
  public TxApiResponse read() throws IOException {
    String readyFolder = tmpDir + File.separator + "ready";
    File readyDir = new File(readyFolder);

    String[] children = readyDir.list();
    if (children == null || children.length < 1) {
      return null;
    } else {
      Path temp =
          Files.move(
              Paths.get(readyDir + File.separator + children[0]),
              Paths.get(tmpDir + File.separator + "processing" + File.separator + children[0]));
      try (FileReader fileReader = new FileReader(temp.toFile());
          BufferedReader reader = new BufferedReader(fileReader)) {
        TxApiResponse res = gson.fromJson(reader, TxApiResponse.class);
        System.out.println("Reading " + res); // TODO: user a proper logger instead
        return res;
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
