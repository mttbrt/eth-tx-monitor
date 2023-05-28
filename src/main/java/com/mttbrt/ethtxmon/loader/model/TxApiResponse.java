package com.mttbrt.ethtxmon.loader.model;

import java.io.Serializable;

public record TxApiResponse(String status, String message, TxApiResult[] result)
    implements Serializable {}
