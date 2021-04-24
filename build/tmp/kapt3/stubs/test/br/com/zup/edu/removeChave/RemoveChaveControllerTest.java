package br.com.zup.edu.removeChave;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u000f\u001a\u00020\u0010H\u0001\u00a2\u0006\u0002\b\u0011R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lbr/com/zup/edu/removeChave/RemoveChaveControllerTest;", "", "()V", "client", "Lio/micronaut/http/client/HttpClient;", "getClient", "()Lio/micronaut/http/client/HttpClient;", "setClient", "(Lio/micronaut/http/client/HttpClient;)V", "removeStub", "Lbr/com/zup/edu/KeymanagerRemoveGrpcServiceGrpc$KeymanagerRemoveGrpcServiceBlockingStub;", "getRemoveStub", "()Lbr/com/zup/edu/KeymanagerRemoveGrpcServiceGrpc$KeymanagerRemoveGrpcServiceBlockingStub;", "setRemoveStub", "(Lbr/com/zup/edu/KeymanagerRemoveGrpcServiceGrpc$KeymanagerRemoveGrpcServiceBlockingStub;)V", "deve remover uma chave pix existente", "", "deve remover uma chave pix existente$key_manager_rest", "DeletaMockitoStubFactory", "key-manager-rest"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest()
public final class RemoveChaveControllerTest {
    @javax.inject.Inject()
    public br.com.zup.edu.KeymanagerRemoveGrpcServiceGrpc.KeymanagerRemoveGrpcServiceBlockingStub removeStub;
    @io.micronaut.http.client.annotation.Client(value = "/")
    @javax.inject.Inject()
    public io.micronaut.http.client.HttpClient client;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.KeymanagerRemoveGrpcServiceGrpc.KeymanagerRemoveGrpcServiceBlockingStub getRemoveStub() {
        return null;
    }
    
    public final void setRemoveStub(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.KeymanagerRemoveGrpcServiceGrpc.KeymanagerRemoveGrpcServiceBlockingStub p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.micronaut.http.client.HttpClient getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull()
    io.micronaut.http.client.HttpClient p0) {
    }
    
    public RemoveChaveControllerTest() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"Lbr/com/zup/edu/removeChave/RemoveChaveControllerTest$DeletaMockitoStubFactory;", "", "()V", "stubMock", "Lbr/com/zup/edu/KeymanagerRemoveGrpcServiceGrpc$KeymanagerRemoveGrpcServiceBlockingStub;", "kotlin.jvm.PlatformType", "key-manager-rest"})
    @io.micronaut.context.annotation.Replaces(factory = br.com.zup.edu.compartilhado.GrpcClientFactory.class)
    @io.micronaut.context.annotation.Factory()
    public static final class DeletaMockitoStubFactory {
        
        @javax.inject.Singleton()
        public final br.com.zup.edu.KeymanagerRemoveGrpcServiceGrpc.KeymanagerRemoveGrpcServiceBlockingStub stubMock() {
            return null;
        }
        
        public DeletaMockitoStubFactory() {
            super();
        }
    }
}