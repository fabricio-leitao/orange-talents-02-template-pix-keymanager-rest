package br.com.zup.edu.registraChave.annotations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B6\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005R\u001b\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\nR\u000f\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u000bR\u001b\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\n\u00a8\u0006\f"}, d2 = {"Lbr/com/zup/edu/registraChave/annotations/ValidPixKey;", "", "message", "", "groups", "", "Lkotlin/reflect/KClass;", "", "payload", "Ljavax/validation/Payload;", "()[Ljava/lang/Class;", "()Ljava/lang/String;", "key-manager-rest"})
@java.lang.annotation.Target(value = {java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.TYPE_USE})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Documented()
@javax.validation.Constraint(validatedBy = {br.com.zup.edu.registraChave.annotations.ValidPixKeyValidator.class})
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.TYPE})
@kotlin.annotation.MustBeDocumented()
public abstract @interface ValidPixKey {
    
    public abstract java.lang.String message() default "O valor da chave \u00e9 inv\u00e1lido!";
    
    public abstract java.lang.Class<java.lang.Object>[] groups() default {};
    
    public abstract java.lang.Class<javax.validation.Payload>[] payload() default {};
}