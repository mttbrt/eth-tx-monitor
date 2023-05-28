package com.mttbrt.ethtxmon.loader;

import com.google.gson.Gson;
import com.mttbrt.ethtxmon.loader.model.Pair;
import com.mttbrt.ethtxmon.loader.model.TxApiResult;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TxLoadingReader implements ItemReader<Pair<String, List<TxApiResult>>> {

  private final Gson gson;

  @Value("${eth-tx.tmpDir}")
  private String tmpDir;

  public TxLoadingReader(Gson gson) {
    this.gson = gson;
  }

  @Override
  public Pair<String, List<TxApiResult>> read() {
    try {
      return IOUtils.readItemsToProcess(tmpDir, gson);
    } catch (IOException e) {
      return new Pair<>(null, Collections.emptyList());
    }
  }
}
