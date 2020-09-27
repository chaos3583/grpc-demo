package com.chaos.grpcclient;

import com.chaos.remoting.grpc.Messages;
import com.chaos.remoting.grpc.RemotingServiceGrpc;
import com.google.protobuf.ByteString;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;


@Service
public class GrpcClientService {

    @GrpcClient("local-grpc-server")
    private Channel serverChannel;

    public String testRemote(String param) {
        RemotingServiceGrpc.RemotingServiceBlockingStub stub = RemotingServiceGrpc.newBlockingStub(serverChannel);
        ByteString data = ByteString.copyFromUtf8(param);
        Messages.RemoteInvocationRequest request = Messages.RemoteInvocationRequest.newBuilder().setData(data).build();
        Messages.RemoteInvocationResponse response = stub.getRemoteInfo(request);
        return response.getData().toStringUtf8();
    }

}
