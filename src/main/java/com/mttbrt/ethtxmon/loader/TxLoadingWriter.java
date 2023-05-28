package com.mttbrt.ethtxmon.loader;

import com.mttbrt.ethtxmon.loader.model.Pair;
import com.mttbrt.ethtxmon.model.Tx;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

@Component
public class TxLoadingWriter implements ItemWriter<Pair<String, List<Tx>>> {

  @Override
  public void write(List<? extends Pair<String, List<Tx>>> lists) {
    List<Tx> output = lists.stream().map(Pair::item2).flatMap(Collection::stream).toList();
    if (!output.isEmpty()) {
      System.out.println("Writing " + lists);
      lists.stream().map(Pair::item1).filter(Objects::nonNull).map(File::new).forEach(File::delete);
    }
  }
}
