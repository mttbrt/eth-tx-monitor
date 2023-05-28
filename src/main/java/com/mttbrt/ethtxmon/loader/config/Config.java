package com.mttbrt.ethtxmon.loader.config;

import com.google.gson.Gson;
import com.mttbrt.ethtxmon.loader.model.Pair;
import com.mttbrt.ethtxmon.loader.model.TxApiResult;
import com.mttbrt.ethtxmon.model.Tx;
import java.io.IOException;
import java.util.List;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class Config {

  private final JobBuilderFactory jobBuilderFactory;
  private final StepBuilderFactory stepBuilderFactory;

  public Config(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory) {
    this.jobBuilderFactory = jobBuilderFactory;
    this.stepBuilderFactory = stepBuilderFactory;
  }

  @Bean
  public Gson gson() {
    return new Gson();
  }

  @Bean
  public Job job(Step step) {
    return jobBuilderFactory
        .get("tx-loader")
        .incrementer(new RunIdIncrementer())
        .start(step)
        .build();
  }

  @Bean
  public Step load(
      ItemReader<Pair<String, List<TxApiResult>>> reader,
      ItemProcessor<Pair<String, List<TxApiResult>>, Pair<String, List<Tx>>> processor,
      ItemWriter<Pair<String, List<Tx>>> writer) {
    return stepBuilderFactory
        .get("load")
        .<Pair<String, List<TxApiResult>>, Pair<String, List<Tx>>>chunk(5)
        .reader(reader)
        .processor(processor)
        .writer(writer)
        .faultTolerant()
        .skipLimit(100)
        .skip(IOException.class)
        .build();
  }
}
