package br.com.zup.edu.detalhaChave

import br.com.zup.edu.CarregaChavePixResponse
import br.com.zup.edu.TipoDeConta
import io.micronaut.core.annotation.Introspected
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneOffset

@Introspected
class DetalheChavePixResponse(response: CarregaChavePixResponse) {

    val pixId = response.pixId
    val tipo = response.chave.tipo
    val chave = response.chave.chave

    val criadaEm = response.chave.criadaEm.let {
        LocalDateTime.ofInstant(Instant.ofEpochSecond(it.seconds, it.nanos.toLong()), ZoneOffset.UTC)
    }.toString()

    val tipoDeConta = when (response.chave.conta.tipo) {
        TipoDeConta.CONTA_CORRENTE -> "CONTA_CORRENTE"
        TipoDeConta.CONTA_POUPANCA -> "CONTA_POUPANCA"
        else -> "CONTA_DESCONHECIDA"
    }

    val conta = mapOf(
        Pair("tipo", tipoDeConta),
        Pair("instituicao", response.chave.conta.instituicao),
        Pair("nomeDoTitular", response.chave.conta.nomeDoTitular),
        Pair("cpfDoTitular", response.chave.conta.cpfDoTitular),
        Pair("agencia", response.chave.conta.agencia),
        Pair("numeroDaConta", response.chave.conta.numeroDaConta)
    )
}
