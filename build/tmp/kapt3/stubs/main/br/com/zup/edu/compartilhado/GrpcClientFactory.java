package br.com.zup.edu.compartilhado;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lbr/com/zup/edu/compartilhado/GrpcClientFactory;", "", "channel", "Lio/grpc/ManagedChannel;", "(Lio/grpc/ManagedChannel;)V", "getChannel", "()Lio/grpc/ManagedChannel;", "registraChave", "Lbr/com/zup/edu/KeymanagerGrpcServiceGrpc$KeymanagerGrpcServiceBlockingStub;", "removeChave", "Lbr/com/zup/edu/KeymanagerRemoveGrpcServiceGrpc$KeymanagerRemoveGrpcServiceBlockingStub;", "kotlin.jvm.PlatformType", "key-manager-rest"})
@io.micronaut.context.annotation.Factory()
public final class GrpcClientFactory {
    @org.jetbrains.annotations.NotNull()
    private final io.grpc.ManagedChannel channel = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    public final br.com.zup.edu.KeymanagerGrpcServiceGrpc.KeymanagerGrpcServiceBlockingStub registraChave() {
        return null;
    }
    
    @javax.inject.Singleton()
    public final br.com.zup.edu.KeymanagerRemoveGrpcServiceGrpc.KeymanagerRemoveGrpcServiceBlockingStub removeChave() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.grpc.ManagedChannel getChannel() {
        return null;
    }
    
    public GrpcClientFactory(@org.jetbrains.annotations.NotNull()
    @io.micronaut.grpc.annotation.GrpcChannel(value = "keyManager")
    io.grpc.ManagedChannel channel) {
        super();
    }
}