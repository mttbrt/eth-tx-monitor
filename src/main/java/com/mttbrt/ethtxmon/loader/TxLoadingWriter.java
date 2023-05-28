package com.mttbrt.ethtxmon.loader;

import com.mttbrt.ethtxmon.model.Tx;
import java.util.List;
import org.springframework.batch.item.ItemWriter;

public class TxLoadingWriter implements ItemWriter<Tx> {

  @Override
  public void write(List<? extends Tx> list) {
    // TODO: receive the file name too and delete it after saving the values on Kafka
    System.out.println("Writing " + list);
  }
}
