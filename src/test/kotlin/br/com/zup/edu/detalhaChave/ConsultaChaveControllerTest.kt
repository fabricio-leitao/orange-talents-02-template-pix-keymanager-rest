package br.com.zup.edu.detalhaChave

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
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.BDDMockito.given
import org.mockito.Mockito
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@MicronautTest
internal class ConsultaChaveControllerTest{
    @field:Inject
    lateinit var detalhaChaveStub: KeymanagerConsultaGrpcServiceGrpc.KeymanagerConsultaGrpcServiceBlockingStub

    @field:Inject
    @field:Client("/")
    lateinit var client: HttpClient

    val CHAVE = "todoroki@gmail.com"
    val TIPO_DE_CONTA = TipoDeConta.CONTA_CORRENTE
    val TIPO_DE_CHAVE = TipoDeChave.EMAIL
    val INSTITUICAO = "Itau"
    val TITULAR = "Todoroki"
    val DOCUMENTO_DO_TITULAR = "12345678909"
    val AGENCIA = "0001"
    val NUMERO_DA_CONTA = "24259-2"
    val CHAVE_CRIADA_EM = LocalDateTime.now()

    @Test
    internal fun `deve encontrar uma chave pix existente`() {

        val clienteId = UUID.randomUUID().toString()
        val pixId = UUID.randomUUID().toString()

        given(detalhaChaveStub.consulta(Mockito.any())).willReturn(carregaChavePixResponse(clienteId, pixId))


        val request = HttpRequest.GET<Any>("/api/v1/clientes/$clienteId/pix/$pixId")
        val response = client.toBlocking().exchange(request, Any::class.java)

        assertEquals(HttpStatus.OK, response.status)
        assertNotNull(response.body())
    }

    private fun carregaChavePixResponse(clienteId: String, pixId: String) =
        CarregaChavePixResponse.newBuilder()
            .setClienteId(clienteId)
            .setPixId(pixId)
            .setChave(
                CarregaChavePixResponse.ChavePix
                .newBuilder()
                .setTipo(TIPO_DE_CHAVE)
                .setChave(CHAVE)
                .setConta(
                    CarregaChavePixResponse.ChavePix.ContaInfo.newBuilder()
                    .setTipo(TIPO_DE_CONTA)
                    .setInstituicao(INSTITUICAO)
                    .setNomeDoTitular(TITULAR)
                    .setCpfDoTitular(DOCUMENTO_DO_TITULAR)
                    .setAgencia(AGENCIA)
                    .setNumeroDaConta(NUMERO_DA_CONTA)
                    .build()
                )
                .setCriadaEm(CHAVE_CRIADA_EM.let {
                    val createdAt = it.atZone(ZoneId.of("UTC")).toInstant()
                    Timestamp.newBuilder()
                        .setSeconds(createdAt.epochSecond)
                        .setNanos(createdAt.nano)
                        .build()
                })).build()


    @Factory
    @Replaces(factory = GrpcClientFactory::class)
    internal class MockitoStubFactory {

        @Singleton
        fun stubMock() = Mockito.mock(KeymanagerConsultaGrpcServiceGrpc.KeymanagerConsultaGrpcServiceBlockingStub::class.java)
    }

}