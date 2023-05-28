package com.mttbrt.ethtxmon.api;

import com.mttbrt.ethtxmon.model.Address;
import com.mttbrt.ethtxmon.model.EthTxGrpc.EthTxImplBase;
import com.mttbrt.ethtxmon.model.Response;
import com.mttbrt.ethtxmon.model.Tx;
import com.mttbrt.ethtxmon.model.TxRequest;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class EthTxServer {

  private final Server server;

  public EthTxServer(int port) {
    this(ServerBuilder.forPort(port));
  }

  public EthTxServer(ServerBuilder<?> serverBuilder) {
    server = serverBuilder.addService(new EthTxService()).build();
  }

  public static void main(String[] args) throws Exception {
    EthTxServer server = new EthTxServer(8989);
    server.start();
    server.blockUntilShutdown();
  }

  public void start() throws IOException {
    server.start();

    Runtime.getRuntime()
        .addShutdownHook(
            new Thread(
                () -> {
                  try {
                    EthTxServer.this.stop();
                  } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                  }
                }));
  }

  public void stop() throws InterruptedException {
    if (server != null) {
      server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
    }
  }

  private void blockUntilShutdown() throws InterruptedException {
    if (server != null) {
      server.awaitTermination();
    }
  }

  private static class EthTxService extends EthTxImplBase {

    @Override
    public void subscribeToAddress(Address request, StreamObserver<Response> responseObserver) {
      super.subscribeToAddress(request, responseObserver);
    }

    @Override
    public void unsubscribeToAddress(Address request, StreamObserver<Response> responseObserver) {
      super.unsubscribeToAddress(request, responseObserver);
    }

    @Override
    public void getLatestTx(Address request, StreamObserver<Tx> responseObserver) {
      super.getLatestTx(request, responseObserver);
    }

    @Override
    public StreamObserver<TxRequest> getPreviousTx(StreamObserver<Tx> responseObserver) {
      return super.getPreviousTx(responseObserver);
    }
  }
}
