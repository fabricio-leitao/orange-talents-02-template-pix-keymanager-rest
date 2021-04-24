package br.com.zup.edu.detalhaChave;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0007R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lbr/com/zup/edu/detalhaChave/ConsultaChaveController;", "", "grpcCliente", "Lbr/com/zup/edu/KeymanagerConsultaGrpcServiceGrpc$KeymanagerConsultaGrpcServiceBlockingStub;", "(Lbr/com/zup/edu/KeymanagerConsultaGrpcServiceGrpc$KeymanagerConsultaGrpcServiceBlockingStub;)V", "LOGGER", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getGrpcCliente", "()Lbr/com/zup/edu/KeymanagerConsultaGrpcServiceGrpc$KeymanagerConsultaGrpcServiceBlockingStub;", "consulta", "Lio/micronaut/http/HttpResponse;", "clienteId", "Ljava/util/UUID;", "pixId", "key-manager-rest"})
@io.micronaut.http.annotation.Controller(value = "/api/v1/clientes/{clienteId}")
public final class ConsultaChaveController {
    private final org.slf4j.Logger LOGGER = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    private final br.com.zup.edu.KeymanagerConsultaGrpcServiceGrpc.KeymanagerConsultaGrpcServiceBlockingStub grpcCliente = null;
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/pix/{pixId}")
    public final io.micronaut.http.HttpResponse<java.lang.Object> consulta(@org.jetbrains.annotations.NotNull()
    java.util.UUID clienteId, @org.jetbrains.annotations.NotNull()
    java.util.UUID pixId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.KeymanagerConsultaGrpcServiceGrpc.KeymanagerConsultaGrpcServiceBlockingStub getGrpcCliente() {
        return null;
    }
    
    public ConsultaChaveController(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.KeymanagerConsultaGrpcServiceGrpc.KeymanagerConsultaGrpcServiceBlockingStub grpcCliente) {
        super();
    }
}