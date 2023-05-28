package com.mttbrt.ethtxmon.api;

import com.google.protobuf.ByteString;
import com.mttbrt.ethtxmon.model.Address;
import com.mttbrt.ethtxmon.model.EthTxGrpc;
import com.mttbrt.ethtxmon.model.EthTxGrpc.EthTxBlockingStub;
import com.mttbrt.ethtxmon.model.EthTxGrpc.EthTxStub;
import com.mttbrt.ethtxmon.model.Response;
import com.mttbrt.ethtxmon.model.Tx;
import com.mttbrt.ethtxmon.model.TxRequest;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class EthTxClient {

  private final EthTxBlockingStub blockingStub;
  private final EthTxStub asyncStub;

  public EthTxClient(String host, int port) {
    this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
  }

  public EthTxClient(ManagedChannelBuilder<?> channelBuilder) {
    Channel channel = channelBuilder.build();
    blockingStub = EthTxGrpc.newBlockingStub(channel);
    asyncStub = EthTxGrpc.newStub(channel);
  }

  public static void main(String[] args) {
    byte[] hash = "0x123".getBytes();

    EthTxClient client = new EthTxClient("localhost", 8989);
    client.subscribeToAddress(hash);
    client.unsubscribeToAddress(hash);
    client.getLatestTx(hash);
    client.getPreviousTx(hash);
  }

  public void subscribeToAddress(byte[] hash) {
    Address address = Address.newBuilder().setHash(ByteString.copyFrom(hash)).build();
    Response response = blockingStub.subscribeToAddress(address);
    System.out.println(response);
  }

  public void unsubscribeToAddress(byte[] hash) {
    Address address = Address.newBuilder().setHash(ByteString.copyFrom(hash)).build();
    Response response = blockingStub.unsubscribeToAddress(address);
    System.out.println(response);
  }

  public void getLatestTx(byte[] hash) {
    Address address = Address.newBuilder().setHash(ByteString.copyFrom(hash)).build();
    Tx tx = blockingStub.getLatestTx(address);
    System.out.println(tx);
  }

  public void getPreviousTx(byte[] hash) {
    // react on server replies
    StreamObserver<Tx> observer =
        new StreamObserver<>() {
          @Override
          public void onNext(Tx note) {
            System.out.println("onNext");
          }

          @Override
          public void onError(Throwable t) {
            System.out.println("onError");
          }

          @Override
          public void onCompleted() {
            System.out.println("onCompleted");
          }
        };

    // send messages to server
    StreamObserver<TxRequest> requestObserver = asyncStub.getPreviousTx(observer);
    for (int i = 0; i < 10; ++i) {
      Address address = Address.newBuilder().setHash(ByteString.copyFrom(hash)).build();
      TxRequest request =
          TxRequest.newBuilder().setAddress(address).setTxHash(ByteString.copyFrom(hash)).build();
      requestObserver.onNext(request);
    }
    requestObserver.onCompleted();
  }
}
