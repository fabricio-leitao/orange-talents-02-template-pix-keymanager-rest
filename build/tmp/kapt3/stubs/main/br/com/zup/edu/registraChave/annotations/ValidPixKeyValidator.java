package br.com.zup.edu.registraChave.annotations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lbr/com/zup/edu/registraChave/annotations/ValidPixKeyValidator;", "Ljavax/validation/ConstraintValidator;", "Lbr/com/zup/edu/registraChave/annotations/ValidPixKey;", "Lbr/com/zup/edu/registraChave/RegistraChaveRequest;", "()V", "isValid", "", "value", "context", "Ljavax/validation/ConstraintValidatorContext;", "key-manager-rest"})
@javax.inject.Singleton()
public final class ValidPixKeyValidator implements javax.validation.ConstraintValidator<br.com.zup.edu.registraChave.annotations.ValidPixKey, br.com.zup.edu.registraChave.RegistraChaveRequest> {
    
    @java.lang.Override()
    public boolean isValid(@org.jetbrains.annotations.Nullable()
    br.com.zup.edu.registraChave.RegistraChaveRequest value, @org.jetbrains.annotations.NotNull()
    javax.validation.ConstraintValidatorContext context) {
        return false;
    }
    
    public ValidPixKeyValidator() {
        super();
    }
}