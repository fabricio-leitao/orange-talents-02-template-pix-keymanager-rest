package br.com.zup.edu.listaChave

import br.com.zup.edu.KeymanagerListaGrpcServiceGrpc
import br.com.zup.edu.ListaChavesPixRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import java.util.*
import javax.inject.Inject

@Controller("/api/v1/clientes/{clienteId}")
class ListaChaveController(
    @Inject val grpcClient: KeymanagerListaGrpcServiceGrpc.KeymanagerListaGrpcServiceBlockingStub
){

    @Get
    fun lista(clienteId: UUID): HttpResponse<Any>{
        val pix = grpcClient.lista(ListaChavesPixRequest.newBuilder()
            .setClienteId(clienteId.toString())
            .build())

        val chaves = pix.chavesList.map { ChavePixResponse(it) }
        return HttpResponse.ok(chaves)
    }
}