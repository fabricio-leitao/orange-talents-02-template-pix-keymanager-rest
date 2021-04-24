package br.com.zup.edu.listaChave;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010$\u001a\u00020%H\u0001\u00a2\u0006\u0002\b&J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0004H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0006R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u0006+"}, d2 = {"Lbr/com/zup/edu/listaChave/ListaChaveControllerTest;", "", "()V", "CHAVE_CELULAR", "", "getCHAVE_CELULAR", "()Ljava/lang/String;", "CHAVE_CRIADA_EM", "Ljava/time/LocalDateTime;", "kotlin.jvm.PlatformType", "getCHAVE_CRIADA_EM", "()Ljava/time/LocalDateTime;", "CHAVE_EMAIL", "getCHAVE_EMAIL", "CONTA_CORRENTE", "Lbr/com/zup/edu/TipoDeConta;", "getCONTA_CORRENTE", "()Lbr/com/zup/edu/TipoDeConta;", "TIPO_DE_CHAVE_CELULAR", "Lbr/com/zup/edu/TipoDeChave;", "getTIPO_DE_CHAVE_CELULAR", "()Lbr/com/zup/edu/TipoDeChave;", "TIPO_DE_CHAVE_EMAIL", "getTIPO_DE_CHAVE_EMAIL", "client", "Lio/micronaut/http/client/HttpClient;", "getClient", "()Lio/micronaut/http/client/HttpClient;", "setClient", "(Lio/micronaut/http/client/HttpClient;)V", "listaChaveStub", "Lbr/com/zup/edu/KeymanagerListaGrpcServiceGrpc$KeymanagerListaGrpcServiceBlockingStub;", "getListaChaveStub", "()Lbr/com/zup/edu/KeymanagerListaGrpcServiceGrpc$KeymanagerListaGrpcServiceBlockingStub;", "setListaChaveStub", "(Lbr/com/zup/edu/KeymanagerListaGrpcServiceGrpc$KeymanagerListaGrpcServiceBlockingStub;)V", "deve listar todas as chaves pix existente", "", "deve listar todas as chaves pix existente$key_manager_rest", "listaChavePixResponse", "Lbr/com/zup/edu/ListaChavesPixResponse;", "clienteId", "ListaStubFactory", "key-manager-rest"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest()
public final class ListaChaveControllerTest {
    @javax.inject.Inject()
    public br.com.zup.edu.KeymanagerListaGrpcServiceGrpc.KeymanagerListaGrpcServiceBlockingStub listaChaveStub;
    @io.micronaut.http.client.annotation.Client(value = "/")
    @javax.inject.Inject()
    public io.micronaut.http.client.HttpClient client;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CHAVE_EMAIL = "todoroki@gmail.com";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CHAVE_CELULAR = "+5521999999999";
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.edu.TipoDeConta CONTA_CORRENTE = br.com.zup.edu.TipoDeConta.CONTA_CORRENTE;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.edu.TipoDeChave TIPO_DE_CHAVE_EMAIL = br.com.zup.edu.TipoDeChave.EMAIL;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.edu.TipoDeChave TIPO_DE_CHAVE_CELULAR = br.com.zup.edu.TipoDeChave.CELULAR;
    private final java.time.LocalDateTime CHAVE_CRIADA_EM = null;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.KeymanagerListaGrpcServiceGrpc.KeymanagerListaGrpcServiceBlockingStub getListaChaveStub() {
        return null;
    }
    
    public final void setListaChaveStub(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.KeymanagerListaGrpcServiceGrpc.KeymanagerListaGrpcServiceBlockingStub p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.micronaut.http.client.HttpClient getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull()
    io.micronaut.http.client.HttpClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCHAVE_EMAIL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCHAVE_CELULAR() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.TipoDeConta getCONTA_CORRENTE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.TipoDeChave getTIPO_DE_CHAVE_EMAIL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.TipoDeChave getTIPO_DE_CHAVE_CELULAR() {
        return null;
    }
    
    public final java.time.LocalDateTime getCHAVE_CRIADA_EM() {
        return null;
    }
    
    private final br.com.zup.edu.ListaChavesPixResponse listaChavePixResponse(java.lang.String clienteId) {
        return null;
    }
    
    public ListaChaveControllerTest() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u0007\u00a8\u0006\u0006"}, d2 = {"Lbr/com/zup/edu/listaChave/ListaChaveControllerTest$ListaStubFactory;", "", "()V", "stubMock", "Lbr/com/zup/edu/KeymanagerListaGrpcServiceGrpc$KeymanagerListaGrpcServiceBlockingStub;", "kotlin.jvm.PlatformType", "key-manager-rest"})
    @io.micronaut.context.annotation.Replaces(factory = br.com.zup.edu.compartilhado.GrpcClientFactory.class)
    @io.micronaut.context.annotation.Factory()
    public static final class ListaStubFactory {
        
        @javax.inject.Singleton()
        public final br.com.zup.edu.KeymanagerListaGrpcServiceGrpc.KeymanagerListaGrpcServiceBlockingStub stubMock() {
            return null;
        }
        
        public ListaStubFactory() {
            super();
        }
    }
}