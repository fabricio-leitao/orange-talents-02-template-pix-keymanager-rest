package br.com.zup.edu.detalhaChave

import br.com.zup.edu.CarregaChavePixRequest
import br.com.zup.edu.KeymanagerConsultaGrpcServiceGrpc
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import org.slf4j.LoggerFactory
import java.util.*
import javax.inject.Inject

@Controller("/api/v1/clientes/{clienteId}")
class ConsultaChaveController(
    @Inject val grpcCliente: KeymanagerConsultaGrpcServiceGrpc.KeymanagerConsultaGrpcServiceBlockingStub
    ) {

    private val LOGGER = LoggerFactory.getLogger(this::class.java)

    @Get("/pix/{pixId}")
    fun consulta(clienteId: UUID, pixId: UUID): HttpResponse<Any> {

        LOGGER.info("[$clienteId] carrega chave pix por id: $pixId")

        val response = grpcCliente.consulta(CarregaChavePixRequest.newBuilder()
            .setChave(pixId.toString())
//            .setPixId(CarregaChavePixRequest.FiltroPorPixId.newBuilder()
//                .setClienteId(clienteId.toString())
//                .setPixId(pixId.toString())
//                .build())
            .build())
        LOGGER.info(response.toString())

        return HttpResponse.ok(DetalheChavePixResponse(response))
    }
}