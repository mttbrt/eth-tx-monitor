package com.mttbrt.ethtxmon.loader;

import com.google.gson.Gson;
import com.mttbrt.ethtxmon.loader.model.Pair;
import com.mttbrt.ethtxmon.loader.model.TxApiResponse;
import com.mttbrt.ethtxmon.loader.model.TxApiResult;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IOUtils {

  private static final String SEPARATOR = File.separator;
  private static final String READY = "ready";
  private static final String PROCESSING = "processing";
  private static final String DOT_JSON = ".json";
  private static final Logger LOG = LoggerFactory.getLogger(IOUtils.class);

  private IOUtils() {}

  public static void writeToNewFile(String tmpDir, String content) throws IOException {
    File file = getNewJsonFile(tmpDir);

    try (FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
      bufferedWriter.write(content);
      LOG.info("Saved data to {}", file.getAbsolutePath());
    }
  }

  public static Pair<String, List<TxApiResult>> readItemsToProcess(String tmpDir, Gson gson)
      throws IOException {
    File fileToProcess = moveFileToProcess(tmpDir);

    try (FileReader fileReader = new FileReader(fileToProcess);
        BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      List<TxApiResult> res =
          Arrays.asList(gson.fromJson(bufferedReader, TxApiResponse.class).result());
      LOG.info("Read data from {}", fileToProcess.getAbsolutePath());
      return new Pair<>(fileToProcess.getAbsolutePath(), res);
    }
  }

  private static File getNewJsonFile(String tmpDir) {
    String fileName = tmpDir + SEPARATOR + READY + SEPARATOR + System.nanoTime() + DOT_JSON;
    return new File(fileName);
  }

  private static String getFileToProcess(String tmpDir) throws FileNotFoundException {
    File readyDir = new File(tmpDir + SEPARATOR + READY);
    String[] children = readyDir.list();
    if (children != null && children.length > 0) return children[0];
    throw new FileNotFoundException(readyDir + " is empty.");
  }

  private static File moveFileToProcess(String tmpDir) throws IOException {
    String fileToProcess = getFileToProcess(tmpDir);
    File readyDir = new File(tmpDir + SEPARATOR + READY);
    File processingDir = new File(tmpDir + SEPARATOR + PROCESSING);
    return Files.move(
            Paths.get(readyDir + File.separator + fileToProcess),
            Paths.get(processingDir + File.separator + fileToProcess))
        .toFile();
  }
}
