package com.mttbrt.ethtxmon.loader.model;

public class EthTxException extends RuntimeException {

  public EthTxException() {}

  public EthTxException(String message) {
    super(message);
  }

  public EthTxException(String message, Throwable cause) {
    super(message, cause);
  }

  public EthTxException(Throwable cause) {
    super(cause);
  }
}
