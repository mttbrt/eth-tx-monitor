package com.mttbrt.ethtxmon.loader;

import com.google.protobuf.ByteString;
import com.mttbrt.ethtxmon.loader.model.Pair;
import com.mttbrt.ethtxmon.loader.model.TxApiResult;
import com.mttbrt.ethtxmon.model.Address;
import com.mttbrt.ethtxmon.model.Tx;
import java.util.LinkedList;
import java.util.List;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class TxLoadingProcessor
    implements ItemProcessor<Pair<String, List<TxApiResult>>, Pair<String, List<Tx>>> {

  @Override
  public Pair<String, List<Tx>> process(Pair<String, List<TxApiResult>> results) {
    if (results == null) return null;

    List<Tx> txs = new LinkedList<>();
    for (TxApiResult result : results.item2()) {
      txs.add(
          Tx.newBuilder()
              .setHash(ByteString.copyFrom(result.hash().getBytes()))
              .setTimestamp(Long.parseLong(result.timeStamp()))
              .setFrom(
                  Address.newBuilder()
                      .setHash(ByteString.copyFrom(result.from().getBytes()))
                      .build())
              .setTo(
                  Address.newBuilder().setHash(ByteString.copyFrom(result.to().getBytes())).build())
              .setValue(ByteString.copyFrom(result.value().getBytes()))
              .setGas(Long.parseLong(result.gas()))
              .setGasPrice(Long.parseLong(result.gasPrice()))
              .setSuccess(!Boolean.parseBoolean(result.isError()))
              .build());
    }
    return new Pair<>(results.item1(), txs);
  }
}
