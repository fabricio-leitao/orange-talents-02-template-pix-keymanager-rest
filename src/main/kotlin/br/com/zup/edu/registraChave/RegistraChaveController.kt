package br.com.zup.edu.registraChave

import br.com.zup.edu.KeymanagerGrpcServiceGrpc
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import java.util.*
import javax.inject.Inject
import javax.validation.Valid

@Validated
@Controller("/api/v1/clientes/{clienteId}")
class RegistraChaveController(
    @Inject private val grpcClient: KeymanagerGrpcServiceGrpc.KeymanagerGrpcServiceBlockingStub
) {

    @Post("/pix")
    fun cria(@PathVariable clienteId: UUID, @Valid @Body request: RegistraChaveRequest): HttpResponse<Any> {
        val response = grpcClient.registra(request.toModel(clienteId))

        return  HttpResponse.created(location(clienteId, response.pixId))
    }

    private fun location(clienteId: UUID, pixId: String) = HttpResponse.uri("/api/v1/clientes/$clienteId/pix/$pixId")
}