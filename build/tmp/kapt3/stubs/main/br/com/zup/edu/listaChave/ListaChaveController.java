package br.com.zup.edu.listaChave;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lbr/com/zup/edu/listaChave/ListaChaveController;", "", "grpcClient", "Lbr/com/zup/edu/KeymanagerListaGrpcServiceGrpc$KeymanagerListaGrpcServiceBlockingStub;", "(Lbr/com/zup/edu/KeymanagerListaGrpcServiceGrpc$KeymanagerListaGrpcServiceBlockingStub;)V", "getGrpcClient", "()Lbr/com/zup/edu/KeymanagerListaGrpcServiceGrpc$KeymanagerListaGrpcServiceBlockingStub;", "lista", "Lio/micronaut/http/HttpResponse;", "clienteId", "Ljava/util/UUID;", "key-manager-rest"})
@io.micronaut.http.annotation.Controller(value = "/api/v1/clientes/{clienteId}")
public final class ListaChaveController {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    private final br.com.zup.edu.KeymanagerListaGrpcServiceGrpc.KeymanagerListaGrpcServiceBlockingStub grpcClient = null;
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get()
    public final io.micronaut.http.HttpResponse<java.lang.Object> lista(@org.jetbrains.annotations.NotNull()
    java.util.UUID clienteId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.KeymanagerListaGrpcServiceGrpc.KeymanagerListaGrpcServiceBlockingStub getGrpcClient() {
        return null;
    }
    
    public ListaChaveController(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.KeymanagerListaGrpcServiceGrpc.KeymanagerListaGrpcServiceBlockingStub grpcClient) {
        super();
    }
}