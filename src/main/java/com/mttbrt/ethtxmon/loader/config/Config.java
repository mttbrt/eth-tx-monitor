package com.mttbrt.ethtxmon.loader.config;

import com.mttbrt.ethtxmon.loader.TxLoadingProcessor;
import com.mttbrt.ethtxmon.loader.TxLoadingReader;
import com.mttbrt.ethtxmon.loader.TxLoadingWriter;
import com.mttbrt.ethtxmon.loader.model.TxApiResponse;
import com.mttbrt.ethtxmon.model.Tx;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class Config {

  @Autowired public JobBuilderFactory jobBuilderFactory;
  @Autowired public StepBuilderFactory stepBuilderFactory;

  @Bean
  public TxLoadingReader txLoadingReader() {
    return new TxLoadingReader();
  }

  @Bean
  public TxLoadingProcessor txLoadingProcessor() {
    return new TxLoadingProcessor();
  }

  @Bean
  public TxLoadingWriter txLoadingWriter() {
    return new TxLoadingWriter();
  }

  @Bean
  public Job job() {
    return jobBuilderFactory
        .get("tx-loader")
        .incrementer(new RunIdIncrementer())
        .start(load())
        .build();
  }

  @Bean
  public Step load() {
    return stepBuilderFactory
        .get("load")
        .<TxApiResponse, Tx>chunk(5)
        .reader(txLoadingReader())
        .processor(txLoadingProcessor())
        .writer(txLoadingWriter())
        .build();
  }
}
