package br.com.zup.edu.exceptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lbr/com/zup/edu/exceptions/GlobalExceptionHandler;", "Lio/micronaut/http/server/exceptions/ExceptionHandler;", "Lio/grpc/StatusRuntimeException;", "Lio/micronaut/http/HttpResponse;", "", "()V", "LOGGER", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "handle", "request", "Lio/micronaut/http/HttpRequest;", "exception", "key-manager-rest"})
@javax.inject.Singleton()
public final class GlobalExceptionHandler implements io.micronaut.http.server.exceptions.ExceptionHandler<io.grpc.StatusRuntimeException, io.micronaut.http.HttpResponse<java.lang.Object>> {
    private final org.slf4j.Logger LOGGER = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.micronaut.http.HttpResponse<java.lang.Object> handle(@org.jetbrains.annotations.NotNull()
    io.micronaut.http.HttpRequest<?> request, @org.jetbrains.annotations.NotNull()
    io.grpc.StatusRuntimeException exception) {
        return null;
    }
    
    public GlobalExceptionHandler() {
        super();
    }
}