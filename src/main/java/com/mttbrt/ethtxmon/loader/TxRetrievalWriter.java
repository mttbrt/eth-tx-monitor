package com.mttbrt.ethtxmon.loader;

import java.util.List;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemWriter;

public class TxRetrievalWriter implements ItemWriter<String> {

  private StepExecution stepExecution;

  @BeforeStep
  public void saveStepExecution(StepExecution stepExecution) {
    this.stepExecution = stepExecution;
  }

  @Override
  public void write(List<? extends String> list) throws Exception {
    for (String item : list) {
      System.out.println("item = " + item);
    }
    ExecutionContext stepContext = this.stepExecution.getExecutionContext();
    int count = stepContext.containsKey("count") ? stepContext.getInt("count") : 0;
    stepContext.put("count", count + list.size());
  }
}
