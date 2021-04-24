package br.com.zup.edu.listaChave

import br.com.zup.edu.*
import br.com.zup.edu.compartilhado.GrpcClientFactory
import com.google.protobuf.Timestamp
import io.micronaut.context.annotation.Factory
import io.micronaut.context.annotation.Replaces
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@MicronautTest
internal class ListaChaveControllerTest{

    @field:Inject
    lateinit var listaChaveStub: KeymanagerListaGrpcServiceGrpc.KeymanagerListaGrpcServiceBlockingStub

    @field:Inject
    @field:Client("/")
    lateinit var client: HttpClient

    val CHAVE_EMAIL = "todoroki@gmail.com"
    val CHAVE_CELULAR = "+5521999999999"
    val CONTA_CORRENTE = TipoDeConta.CONTA_CORRENTE
    val TIPO_DE_CHAVE_EMAIL = TipoDeChave.EMAIL
    val TIPO_DE_CHAVE_CELULAR = TipoDeChave.CELULAR
    val CHAVE_CRIADA_EM = LocalDateTime.now()

    @Test
    internal fun `deve listar todas as chaves pix existente`() {

        val clienteId = UUID.randomUUID().toString()

        val respostaGrpc = listaChavePixResponse(clienteId)

        given(listaChaveStub.lista(Mockito.any())).willReturn(respostaGrpc)


        val request = HttpRequest.GET<Any>("/api/v1/clientes/$clienteId")
        val response = client.toBlocking().exchange(request, List::class.java)

        assertEquals(HttpStatus.OK, response.status)
        assertNotNull(response.body())
        assertEquals(response.body()!!.size, 2)
    }


    private fun listaChavePixResponse(clienteId: String): ListaChavesPixResponse {
        val chaveEmail = ListaChavesPixResponse.ChavePix.newBuilder()
            .setPixId(UUID.randomUUID().toString())
            .setTipoDeChave(TIPO_DE_CHAVE_EMAIL)
            .setChave(CHAVE_EMAIL)
            .setTipoDeConta(CONTA_CORRENTE)
            .setCriadaEm(CHAVE_CRIADA_EM.let {
                val createdAt = it.atZone(ZoneId.of("UTC")).toInstant()
                Timestamp.newBuilder()
                    .setSeconds(createdAt.epochSecond)
                    .setNanos(createdAt.nano)
                    .build()
            })
            .build()

        val chaveCelular = ListaChavesPixResponse.ChavePix.newBuilder()
            .setPixId(UUID.randomUUID().toString())
            .setTipoDeChave(TIPO_DE_CHAVE_CELULAR)
            .setChave(CHAVE_CELULAR)
            .setTipoDeConta(CONTA_CORRENTE)
            .setCriadaEm(CHAVE_CRIADA_EM.let {
                val createdAt = it.atZone(ZoneId.of("UTC")).toInstant()
                Timestamp.newBuilder()
                    .setSeconds(createdAt.epochSecond)
                    .setNanos(createdAt.nano)
                    .build()
            })
            .build()


        return ListaChavesPixResponse.newBuilder()
            .setClienteId(clienteId)
            .addAllChaves(listOf(chaveEmail, chaveCelular))
            .build()

    }

    @Factory
    @Replaces(factory = GrpcClientFactory::class)
    internal class ListaStubFactory {
        @Singleton
        fun stubMock() = Mockito.mock(KeymanagerListaGrpcServiceGrpc.KeymanagerListaGrpcServiceBlockingStub::class.java)
    }
}