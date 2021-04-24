package br.com.zup.edu.removeChave

import br.com.zup.edu.KeymanagerRemoveGrpcServiceGrpc
import br.com.zup.edu.RemoveChavePixRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import java.util.*
import javax.inject.Inject

@Controller("/api/v1/clientes/{clienteId}")
class RemoveChaveController(
    @Inject private val grpcClient: KeymanagerRemoveGrpcServiceGrpc.KeymanagerRemoveGrpcServiceBlockingStub
) {

    @Delete("/pix/{pixId}")
    fun deleta(clienteId: UUID, pixId: UUID): HttpResponse<Any>{

        grpcClient.remove(RemoveChavePixRequest.newBuilder()
            .setClienteId(clienteId.toString())
            .setPixId(pixId.toString())
            .build())

        return HttpResponse.ok()
    }
}