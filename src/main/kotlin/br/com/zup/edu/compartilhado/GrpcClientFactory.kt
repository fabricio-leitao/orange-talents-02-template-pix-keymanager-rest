package br.com.zup.edu.compartilhado

import br.com.zup.edu.KeymanagerGrpcServiceGrpc
import br.com.zup.edu.KeymanagerRemoveGrpcServiceGrpc
import io.grpc.ManagedChannel
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import javax.inject.Singleton

@Factory
class GrpcClientFactory(@GrpcChannel("keyManager") val channel: ManagedChannel) {

    @Singleton
    fun registraChave(): KeymanagerGrpcServiceGrpc.KeymanagerGrpcServiceBlockingStub =
        KeymanagerGrpcServiceGrpc.newBlockingStub(channel)

    @Singleton
    fun removeChave() = KeymanagerRemoveGrpcServiceGrpc.newBlockingStub(channel)
}