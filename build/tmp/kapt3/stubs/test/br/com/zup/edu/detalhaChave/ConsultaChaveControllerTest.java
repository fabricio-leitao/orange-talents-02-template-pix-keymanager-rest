package br.com.zup.edu.detalhaChave;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010*\u001a\n \u000b*\u0004\u0018\u00010+0+2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004H\u0002J\r\u0010.\u001a\u00020/H\u0001\u00a2\u0006\u0002\b0R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0006R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0006R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)\u00a8\u00062"}, d2 = {"Lbr/com/zup/edu/detalhaChave/ConsultaChaveControllerTest;", "", "()V", "AGENCIA", "", "getAGENCIA", "()Ljava/lang/String;", "CHAVE", "getCHAVE", "CHAVE_CRIADA_EM", "Ljava/time/LocalDateTime;", "kotlin.jvm.PlatformType", "getCHAVE_CRIADA_EM", "()Ljava/time/LocalDateTime;", "DOCUMENTO_DO_TITULAR", "getDOCUMENTO_DO_TITULAR", "INSTITUICAO", "getINSTITUICAO", "NUMERO_DA_CONTA", "getNUMERO_DA_CONTA", "TIPO_DE_CHAVE", "Lbr/com/zup/edu/TipoDeChave;", "getTIPO_DE_CHAVE", "()Lbr/com/zup/edu/TipoDeChave;", "TIPO_DE_CONTA", "Lbr/com/zup/edu/TipoDeConta;", "getTIPO_DE_CONTA", "()Lbr/com/zup/edu/TipoDeConta;", "TITULAR", "getTITULAR", "client", "Lio/micronaut/http/client/HttpClient;", "getClient", "()Lio/micronaut/http/client/HttpClient;", "setClient", "(Lio/micronaut/http/client/HttpClient;)V", "detalhaChaveStub", "Lbr/com/zup/edu/KeymanagerConsultaGrpcServiceGrpc$KeymanagerConsultaGrpcServiceBlockingStub;", "getDetalhaChaveStub", "()Lbr/com/zup/edu/KeymanagerConsultaGrpcServiceGrpc$KeymanagerConsultaGrpcServiceBlockingStub;", "setDetalhaChaveStub", "(Lbr/com/zup/edu/KeymanagerConsultaGrpcServiceGrpc$KeymanagerConsultaGrpcServiceBlockingStub;)V", "carregaChavePixResponse", "Lbr/com/zup/edu/CarregaChavePixResponse;", "clienteId", "pixId", "deve encontrar uma chave pix existente", "", "deve encontrar uma chave pix existente$key_manager_rest", "MockitoStubFactory", "key-manager-rest"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest()
public final class ConsultaChaveControllerTest {
    @javax.inject.Inject()
    public br.com.zup.edu.KeymanagerConsultaGrpcServiceGrpc.KeymanagerConsultaGrpcServiceBlockingStub detalhaChaveStub;
    @io.micronaut.http.client.annotation.Client(value = "/")
    @javax.inject.Inject()
    public io.micronaut.http.client.HttpClient client;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CHAVE = "todoroki@gmail.com";
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.edu.TipoDeConta TIPO_DE_CONTA = br.com.zup.edu.TipoDeConta.CONTA_CORRENTE;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.edu.TipoDeChave TIPO_DE_CHAVE = br.com.zup.edu.TipoDeChave.EMAIL;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String INSTITUICAO = "Itau";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TITULAR = "Todoroki";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String DOCUMENTO_DO_TITULAR = "12345678909";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String AGENCIA = "0001";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String NUMERO_DA_CONTA = "24259-2";
    private final java.time.LocalDateTime CHAVE_CRIADA_EM = null;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.KeymanagerConsultaGrpcServiceGrpc.KeymanagerConsultaGrpcServiceBlockingStub getDetalhaChaveStub() {
        return null;
    }
    
    public final void setDetalhaChaveStub(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.KeymanagerConsultaGrpcServiceGrpc.KeymanagerConsultaGrpcServiceBlockingStub p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.micronaut.http.client.HttpClient getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull()
    io.micronaut.http.client.HttpClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCHAVE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.TipoDeConta getTIPO_DE_CONTA() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.TipoDeChave getTIPO_DE_CHAVE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getINSTITUICAO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTITULAR() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDOCUMENTO_DO_TITULAR() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAGENCIA() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNUMERO_DA_CONTA() {
        return null;
    }
    
    public final java.time.LocalDateTime getCHAVE_CRIADA_EM() {
        return null;
    }
    
    private final br.com.zup.edu.CarregaChavePixResponse carregaChavePixResponse(java.lang.String clienteId, java.lang.String pixId) {
        return null;
    }
    
    public ConsultaChaveControllerTest() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"Lbr/com/zup/edu/detalhaChave/ConsultaChaveControllerTest$MockitoStubFactory;", "", "()V", "stubMock", "Lbr/com/zup/edu/KeymanagerConsultaGrpcServiceGrpc$KeymanagerConsultaGrpcServiceBlockingStub;", "kotlin.jvm.PlatformType", "key-manager-rest"})
    @io.micronaut.context.annotation.Replaces(factory = br.com.zup.edu.compartilhado.GrpcClientFactory.class)
    @io.micronaut.context.annotation.Factory()
    public static final class MockitoStubFactory {
        
        @javax.inject.Singleton()
        public final br.com.zup.edu.KeymanagerConsultaGrpcServiceGrpc.KeymanagerConsultaGrpcServiceBlockingStub stubMock() {
            return null;
        }
        
        public MockitoStubFactory() {
            super();
        }
    }
}