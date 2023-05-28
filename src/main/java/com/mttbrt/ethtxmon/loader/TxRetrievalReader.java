package com.mttbrt.ethtxmon.loader;

import org.springframework.batch.item.ItemReader;

public class TxRetrievalReader implements ItemReader<String> {

  private static boolean ok = true;

  @Override
  public String read() {
    if (ok) {
      ok = false;
      return "hello";
    } else {
      return null;
    }
  }
}
