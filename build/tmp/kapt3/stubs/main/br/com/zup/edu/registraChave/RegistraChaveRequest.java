package br.com.zup.edu.registraChave;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lbr/com/zup/edu/registraChave/RegistraChaveRequest;", "", "tipoDaConta", "Lbr/com/zup/edu/registraChave/TipoDaConta;", "chave", "", "tipoDaChave", "Lbr/com/zup/edu/registraChave/TipoDaChave;", "(Lbr/com/zup/edu/registraChave/TipoDaConta;Ljava/lang/String;Lbr/com/zup/edu/registraChave/TipoDaChave;)V", "getChave", "()Ljava/lang/String;", "getTipoDaChave", "()Lbr/com/zup/edu/registraChave/TipoDaChave;", "getTipoDaConta", "()Lbr/com/zup/edu/registraChave/TipoDaConta;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toModel", "Lbr/com/zup/edu/ChavePixRequest;", "clienteId", "Ljava/util/UUID;", "toString", "key-manager-rest"})
@io.micronaut.core.annotation.Introspected()
@br.com.zup.edu.registraChave.annotations.ValidPixKey()
public final class RegistraChaveRequest {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotNull()
    private final br.com.zup.edu.registraChave.TipoDaConta tipoDaConta = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(max = 77)
    private final java.lang.String chave = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotNull()
    private final br.com.zup.edu.registraChave.TipoDaChave tipoDaChave = null;
    
    @org.jetbrains.annotations.Nullable()
    public final br.com.zup.edu.ChavePixRequest toModel(@org.jetbrains.annotations.NotNull()
    java.util.UUID clienteId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.registraChave.TipoDaConta getTipoDaConta() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChave() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.registraChave.TipoDaChave getTipoDaChave() {
        return null;
    }
    
    public RegistraChaveRequest(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.registraChave.TipoDaConta tipoDaConta, @org.jetbrains.annotations.NotNull()
    java.lang.String chave, @org.jetbrains.annotations.NotNull()
    br.com.zup.edu.registraChave.TipoDaChave tipoDaChave) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.registraChave.TipoDaConta component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.registraChave.TipoDaChave component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.edu.registraChave.RegistraChaveRequest copy(@org.jetbrains.annotations.NotNull()
    br.com.zup.edu.registraChave.TipoDaConta tipoDaConta, @org.jetbrains.annotations.NotNull()
    java.lang.String chave, @org.jetbrains.annotations.NotNull()
    br.com.zup.edu.registraChave.TipoDaChave tipoDaChave) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}