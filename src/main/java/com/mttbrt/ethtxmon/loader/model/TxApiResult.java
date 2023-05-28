package com.mttbrt.ethtxmon.loader.model;

import java.io.Serializable;

public record TxApiResult(
    String blockNumber,
    String timeStamp,
    String hash,
    String nonce,
    String blockHash,
    String transactionIndex,
    String from,
    String to,
    String value,
    String gas,
    String gasPrice,
    String isError,
    String txreceipt_status,
    String input,
    String contractAddress,
    String cumulativeGasUsed,
    String gasUsed,
    String confirmations,
    String methodId,
    String functionName)
    implements Serializable {}
