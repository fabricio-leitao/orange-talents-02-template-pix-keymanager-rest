package br.com.zup.edu.registraChave

import br.com.zup.edu.ChavePixRequest
import br.com.zup.edu.TipoDeChave
import br.com.zup.edu.TipoDeConta
import br.com.zup.edu.registraChave.annotations.ValidPixKey
import io.micronaut.core.annotation.Introspected
import io.micronaut.validation.validator.constraints.EmailValidator
import java.util.*
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@ValidPixKey
@Introspected
data class RegistraChaveRequest(

    @field:NotNull
    val tipoDaConta: TipoDaConta,
    @field:Size(max = 77)
    val chave: String,
    @field:NotNull
    val tipoDaChave: TipoDaChave,

) {
    fun toModel(clienteId: UUID): ChavePixRequest? {
        return ChavePixRequest.newBuilder()
            .setClienteId(clienteId.toString())
            .setTipoDeConta(TipoDeConta.valueOf(this.tipoDaConta.name))
            .setChave(this.chave)
            .setTipoDeChave(TipoDeChave.valueOf(this.tipoDaChave.name))
            .build()
    }
}