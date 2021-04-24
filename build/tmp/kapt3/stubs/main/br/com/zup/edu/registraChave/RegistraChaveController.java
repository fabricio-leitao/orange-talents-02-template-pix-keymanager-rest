package br.com.zup.edu.registraChave;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J \u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0012R\u0010\u0010\u0002\u001a\u00020\u00038\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lbr/com/zup/edu/registraChave/RegistraChaveController;", "", "grpcClient", "Lbr/com/zup/edu/KeymanagerGrpcServiceGrpc$KeymanagerGrpcServiceBlockingStub;", "(Lbr/com/zup/edu/KeymanagerGrpcServiceGrpc$KeymanagerGrpcServiceBlockingStub;)V", "cria", "Lio/micronaut/http/HttpResponse;", "clienteId", "Ljava/util/UUID;", "request", "Lbr/com/zup/edu/registraChave/RegistraChaveRequest;", "location", "Ljava/net/URI;", "kotlin.jvm.PlatformType", "pixId", "", "key-manager-rest"})
@io.micronaut.http.annotation.Controller(value = "/api/v1/clientes/{clienteId}")
@io.micronaut.validation.Validated()
public class RegistraChaveController {
    @javax.inject.Inject()
    private final br.com.zup.edu.KeymanagerGrpcServiceGrpc.KeymanagerGrpcServiceBlockingStub grpcClient = null;
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post(value = "/pix")
    public io.micronaut.http.HttpResponse<java.lang.Object> cria(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.util.UUID clienteId, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    @javax.validation.Valid()
    br.com.zup.edu.registraChave.RegistraChaveRequest request) {
        return null;
    }
    
    private java.net.URI location(java.util.UUID clienteId, java.lang.String pixId) {
        return null;
    }
    
    public RegistraChaveController(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.KeymanagerGrpcServiceGrpc.KeymanagerGrpcServiceBlockingStub grpcClient) {
        super();
    }
}