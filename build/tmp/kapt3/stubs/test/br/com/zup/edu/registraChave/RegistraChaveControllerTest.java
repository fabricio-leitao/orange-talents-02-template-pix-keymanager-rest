package br.com.zup.edu.registraChave;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u000f\u001a\u00020\u0010H\u0001\u00a2\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\u0010H\u0001\u00a2\u0006\u0002\b\u0013J\r\u0010\u0014\u001a\u00020\u0010H\u0001\u00a2\u0006\u0002\b\u0015R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lbr/com/zup/edu/registraChave/RegistraChaveControllerTest;", "", "()V", "client", "Lio/micronaut/http/client/HttpClient;", "getClient", "()Lio/micronaut/http/client/HttpClient;", "setClient", "(Lio/micronaut/http/client/HttpClient;)V", "registraStub", "Lbr/com/zup/edu/KeymanagerGrpcServiceGrpc$KeymanagerGrpcServiceBlockingStub;", "getRegistraStub", "()Lbr/com/zup/edu/KeymanagerGrpcServiceGrpc$KeymanagerGrpcServiceBlockingStub;", "setRegistraStub", "(Lbr/com/zup/edu/KeymanagerGrpcServiceGrpc$KeymanagerGrpcServiceBlockingStub;)V", "deve registrar uma nova chave pix", "", "deve registrar uma nova chave pix$key_manager_rest", "nao deve registrar uma chave com email invalido", "nao deve registrar uma chave com email invalido$key_manager_rest", "nao deve registrar uma chave duplicada", "nao deve registrar uma chave duplicada$key_manager_rest", "RegistraMockitoStubFactory", "key-manager-rest"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest()
public final class RegistraChaveControllerTest {
    @javax.inject.Inject()
    public br.com.zup.edu.KeymanagerGrpcServiceGrpc.KeymanagerGrpcServiceBlockingStub registraStub;
    @io.micronaut.http.client.annotation.Client(value = "/")
    @javax.inject.Inject()
    public io.micronaut.http.client.HttpClient client;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.KeymanagerGrpcServiceGrpc.KeymanagerGrpcServiceBlockingStub getRegistraStub() {
        return null;
    }
    
    public final void setRegistraStub(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.KeymanagerGrpcServiceGrpc.KeymanagerGrpcServiceBlockingStub p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.micronaut.http.client.HttpClient getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull()
    io.micronaut.http.client.HttpClient p0) {
    }
    
    public RegistraChaveControllerTest() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"Lbr/com/zup/edu/registraChave/RegistraChaveControllerTest$RegistraMockitoStubFactory;", "", "()V", "stubMock", "Lbr/com/zup/edu/KeymanagerGrpcServiceGrpc$KeymanagerGrpcServiceBlockingStub;", "kotlin.jvm.PlatformType", "key-manager-rest"})
    @io.micronaut.context.annotation.Replaces(factory = br.com.zup.edu.compartilhado.GrpcClientFactory.class)
    @io.micronaut.context.annotation.Factory()
    public static final class RegistraMockitoStubFactory {
        
        @javax.inject.Singleton()
        public final br.com.zup.edu.KeymanagerGrpcServiceGrpc.KeymanagerGrpcServiceBlockingStub stubMock() {
            return null;
        }
        
        public RegistraMockitoStubFactory() {
            super();
        }
    }
}