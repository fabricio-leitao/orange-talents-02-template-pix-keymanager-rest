package br.com.zup.edu.registraChave.annotations

import br.com.zup.edu.registraChave.RegistraChaveRequest
import javax.inject.Singleton

@Singleton
class ValidPixKeyValidator: javax.validation.ConstraintValidator<ValidPixKey, RegistraChaveRequest> {

    override fun isValid(
        value: RegistraChaveRequest?,
        context: javax.validation.ConstraintValidatorContext
    ): Boolean {

        if (value?.tipoDaChave == null){
            return true
        }

        val valid = value.tipoDaChave.validacao(value.chave)
        if(!valid){
            context.disableDefaultConstraintViolation()
            context.buildConstraintViolationWithTemplate(context.defaultConstraintMessageTemplate)
                .addPropertyNode("chave").addConstraintViolation()
        }

        return valid
    }
}