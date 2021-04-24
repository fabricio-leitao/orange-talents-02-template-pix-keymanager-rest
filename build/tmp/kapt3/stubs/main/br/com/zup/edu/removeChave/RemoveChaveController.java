package br.com.zup.edu.removeChave;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lbr/com/zup/edu/removeChave/RemoveChaveController;", "", "grpcClient", "Lbr/com/zup/edu/KeymanagerRemoveGrpcServiceGrpc$KeymanagerRemoveGrpcServiceBlockingStub;", "(Lbr/com/zup/edu/KeymanagerRemoveGrpcServiceGrpc$KeymanagerRemoveGrpcServiceBlockingStub;)V", "deleta", "Lio/micronaut/http/HttpResponse;", "clienteId", "Ljava/util/UUID;", "pixId", "key-manager-rest"})
@io.micronaut.http.annotation.Controller(value = "/api/v1/clientes/{clienteId}")
public final class RemoveChaveController {
    @javax.inject.Inject()
    private final br.com.zup.edu.KeymanagerRemoveGrpcServiceGrpc.KeymanagerRemoveGrpcServiceBlockingStub grpcClient = null;
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Delete(value = "/pix/{pixId}")
    public final io.micronaut.http.HttpResponse<java.lang.Object> deleta(@org.jetbrains.annotations.NotNull()
    java.util.UUID clienteId, @org.jetbrains.annotations.NotNull()
    java.util.UUID pixId) {
        return null;
    }
    
    public RemoveChaveController(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.KeymanagerRemoveGrpcServiceGrpc.KeymanagerRemoveGrpcServiceBlockingStub grpcClient) {
        super();
    }
}