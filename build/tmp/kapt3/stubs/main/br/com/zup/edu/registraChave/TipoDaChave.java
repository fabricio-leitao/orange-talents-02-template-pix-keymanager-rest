package br.com.zup.edu.registraChave;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lbr/com/zup/edu/registraChave/TipoDaChave;", "", "(Ljava/lang/String;I)V", "validacao", "", "chave", "", "CPF", "CELULAR", "EMAIL", "ALEATORIA", "key-manager-rest"})
public enum TipoDaChave {
    /*public static final*/ CPF /* = new @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lbr/com/zup/edu/registraChave/TipoDaChave$CPF;", "Lbr/com/zup/edu/registraChave/TipoDaChave;", "validacao", "", "chave", "", "key-manager-rest"}) CPF(){
    
    @java.lang.Override()
    public boolean validacao(@org.jetbrains.annotations.Nullable()
    java.lang.String chave) {
        return false;
    }
    
    CPF() {
        super();
    }
} */,
    /*public static final*/ CELULAR /* = new @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lbr/com/zup/edu/registraChave/TipoDaChave$CELULAR;", "Lbr/com/zup/edu/registraChave/TipoDaChave;", "validacao", "", "chave", "", "key-manager-rest"}) CELULAR(){
    
    @java.lang.Override()
    public boolean validacao(@org.jetbrains.annotations.Nullable()
    java.lang.String chave) {
        return false;
    }
    
    CELULAR() {
        super();
    }
} */,
    /*public static final*/ EMAIL /* = new @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lbr/com/zup/edu/registraChave/TipoDaChave$EMAIL;", "Lbr/com/zup/edu/registraChave/TipoDaChave;", "validacao", "", "chave", "", "key-manager-rest"}) EMAIL(){
    
    @java.lang.Override()
    public boolean validacao(@org.jetbrains.annotations.Nullable()
    java.lang.String chave) {
        return false;
    }
    
    EMAIL() {
        super();
    }
} */,
    /*public static final*/ ALEATORIA /* = new @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lbr/com/zup/edu/registraChave/TipoDaChave$ALEATORIA;", "Lbr/com/zup/edu/registraChave/TipoDaChave;", "validacao", "", "chave", "", "key-manager-rest"}) ALEATORIA(){
    
    @java.lang.Override()
    public boolean validacao(@org.jetbrains.annotations.Nullable()
    java.lang.String chave) {
        return false;
    }
    
    ALEATORIA() {
        super();
    }
} */;
    
    public abstract boolean validacao(@org.jetbrains.annotations.Nullable()
    java.lang.String chave);
    
    TipoDaChave() {
    }
}