package br.com.zup.edu.registraChave

import br.com.zup.edu.*
import br.com.zup.edu.compartilhado.GrpcClientFactory
import io.grpc.Status
import io.grpc.StatusRuntimeException
import io.micronaut.context.annotation.Factory
import io.micronaut.context.annotation.Replaces
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.http.client.exceptions.HttpClientResponseException
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.mockito.BDDMockito.given
import org.mockito.Mockito
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@MicronautTest
internal class RegistraChaveControllerTest{

    @field:Inject
    lateinit var registraStub: KeymanagerGrpcServiceGrpc.KeymanagerGrpcServiceBlockingStub

    @field:Inject
    @field:Client("/")
    lateinit var client: HttpClient

    @Test
    internal fun `deve registrar uma nova chave pix`() {
        val clienteId = UUID.randomUUID().toString()
        val pixId = UUID.randomUUID().toString()

        val grpcResponse = ChavePixResponse.newBuilder()
            .setClienteId(clienteId)
            .setPixId(pixId)
            .build()

        given(registraStub.registra(Mockito.any())).willReturn(grpcResponse)

        val novaChave = RegistraChaveRequest(
            tipoDaConta = TipoDaConta.CONTA_CORRENTE,
            chave = "todoroki@gmail.com",
            tipoDaChave = TipoDaChave.EMAIL
        )

        val request = HttpRequest.POST("/api/v1/clientes/${clienteId}/pix", novaChave)
        val response = client.toBlocking().exchange(request, RegistraChaveRequest::class.java)

        assertEquals(HttpStatus.CREATED, response.status)
        assertTrue(response.headers.contains("Location"))
        assertTrue(response.header("Location")!!.contains(pixId))
    }

    @Test
    internal fun `nao deve registrar uma chave com email invalido`() {
        val clienteId = UUID.randomUUID().toString()

        val novaChave = RegistraChaveRequest(
            tipoDaConta = TipoDaConta.CONTA_CORRENTE,
            chave = "todorokigmail.com",
            tipoDaChave = TipoDaChave.EMAIL
        )

        val request = HttpRequest.POST("/api/v1/clientes/${clienteId}/pix", novaChave)
        val thrown = assertThrows<HttpClientResponseException> {
            client.toBlocking().exchange(request, RegistraChaveRequest::class.java)
        }

        assertEquals(HttpStatus.BAD_REQUEST, thrown.status)
    }

    @Test
    internal fun `nao deve registrar uma chave duplicada`() {
        val clienteId = UUID.randomUUID().toString()

        given(registraStub.registra(
            ChavePixRequest.newBuilder()
            .setClienteId(clienteId)
            .setTipoDeChave(TipoDeChave.EMAIL)
            .setTipoDeConta(TipoDeConta.CONTA_CORRENTE)
            .setChave("todoroki@gmail.com")
            .build()))
            .willThrow(StatusRuntimeException(Status.ALREADY_EXISTS))

        val novaChave = RegistraChaveRequest(
            tipoDaConta = TipoDaConta.CONTA_CORRENTE,
            chave = "todoroki@gmail.com",
            tipoDaChave = TipoDaChave.EMAIL
        )

        val request = HttpRequest.POST("/api/v1/clientes/${clienteId}/pix", novaChave)
        val thrown = assertThrows<HttpClientResponseException> {
            client.toBlocking().exchange(request, RegistraChaveRequest::class.java)
        }

        assertEquals(HttpStatus.UNPROCESSABLE_ENTITY, thrown.status)
    }

    @Factory
    @Replaces(factory = GrpcClientFactory::class)
    internal class RegistraMockitoStubFactory {
        @Singleton
        fun stubMock() = Mockito.mock(KeymanagerGrpcServiceGrpc.KeymanagerGrpcServiceBlockingStub::class.java)
    }
}