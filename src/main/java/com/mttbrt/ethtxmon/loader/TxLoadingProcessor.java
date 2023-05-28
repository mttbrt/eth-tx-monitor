package com.mttbrt.ethtxmon.loader;

import com.mttbrt.ethtxmon.loader.model.TxApiResponse;
import com.mttbrt.ethtxmon.model.Tx;
import org.springframework.batch.item.ItemProcessor;

public class TxLoadingProcessor implements ItemProcessor<TxApiResponse, Tx> {

  @Override
  public Tx process(TxApiResponse response) {
    System.out.println("Processing " + response);
    Tx tx = Tx.newBuilder().setGas(Long.parseLong(response.result()[0].gas())).build();
    return tx;
  }
}
