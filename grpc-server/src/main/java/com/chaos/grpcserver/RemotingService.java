package com.chaos.grpcserver;

import com.chaos.remoting.grpc.Messages;
import com.chaos.remoting.grpc.RemotingServiceGrpc;
import com.chaos.remoting.grpc.Services;
import com.google.protobuf.ByteString;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

/**
 * @program: grpc-demo
 * * @description:
 * * @author: liaopeng
 * * @create: 2020-09-25 10:40
 **/
@Slf4j
@GrpcService(Services.class)
public class RemotingService extends RemotingServiceGrpc.RemotingServiceImplBase {

    /**
     *
     * @param request 请求参数
     * @param responseObserver 应答观察者
     */
    @Override
    public void execute(Messages.RemoteInvocationRequest request, StreamObserver<Messages.RemoteInvocationResponse> responseObserver) {
        String params = request.getData().toStringUtf8();

        log.info("RemotingService.execute:" +params);

        //
        responseObserver.onNext(Messages.RemoteInvocationResponse.newBuilder().setData(ByteString.copyFromUtf8(params)).build());
        responseObserver.onCompleted();
    }

    /**
     *
     * @param request 请求参数
     * @param responseObserver 应答观察者
     */
    @Override
    public void getRemoteInfo(Messages.RemoteInvocationRequest request, StreamObserver<Messages.RemoteInvocationResponse> responseObserver) {
        String params = request.getData().toStringUtf8();

        //responseObserver调用回调方法发送消息通知观察者（GRPC框架）
        log.info("RemotingService.execute:" +params);
        responseObserver.onNext(Messages.RemoteInvocationResponse.newBuilder().setData(ByteString.copyFromUtf8(params)).build());
        responseObserver.onCompleted();
    }
}
