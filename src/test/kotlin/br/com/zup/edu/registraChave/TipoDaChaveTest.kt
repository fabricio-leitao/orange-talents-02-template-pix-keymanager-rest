package br.com.zup.edu.registraChave

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class TipoDaChaveTest{

    @Nested
    inner class ChaveAleatoriaTest {

        @Test
        internal fun `deve validar quando chave aleatoria for nula ou vazia`() {

            val tipoDeChave = TipoDaChave.ALEATORIA

            assertTrue(tipoDeChave.validacao(null))
            assertTrue(tipoDeChave.validacao(""))
        }

        @Test
        internal fun `nao deve validar quando chave aleatoria tiver um valor`() {

            val tipoDeChave = TipoDaChave.ALEATORIA

            assertFalse(tipoDeChave.validacao("valor"))
        }
    }

    @Nested
    inner class CpfTest {

        @Test
        internal fun `deve validar quando cpf for um numero valido`() {

            val tipoDeChave = TipoDaChave.CPF

            assertTrue(tipoDeChave.validacao("12345678909"))
        }

        @Test
        internal fun `nao deve validar quando cpf for nulo ou vazio`() {

            val tipoDeChave = TipoDaChave.CPF

            assertFalse(tipoDeChave.validacao(null))
            assertFalse(tipoDeChave.validacao(""))
        }

        @Test
        internal fun `nao deve validar quando cpf for invalido`() {

            val tipoDeChave = TipoDaChave.CPF

            assertFalse(tipoDeChave.validacao("123456789000"))
        }
    }

    @Nested
    inner class CelularTest {
        @Test
        internal fun `deve validar quando celular tiver numero valido`() {

            val tipoDeChave = TipoDaChave.CELULAR

            assertTrue(tipoDeChave.validacao("+5521123456789"))
        }


        @Test
        internal fun `nao deve validar quando celular for nulo ou vazio`() {

            val tipoDeChave = TipoDaChave.CELULAR

            assertFalse(tipoDeChave.validacao(null))
            assertFalse(tipoDeChave.validacao(""))
        }

        @Test
        internal fun `nao deve validar quando celular tiver um numero invalido`() {

            val tipoDeChave = TipoDaChave.CELULAR

            assertFalse(tipoDeChave.validacao("5521123456789"))
            assertFalse(tipoDeChave.validacao("521123456789"))
            assertFalse(tipoDeChave.validacao("+5211234567899d999"))

        }
    }

    @Nested
    inner class EmailTest {

        @Test
        internal fun `deve validar quando email for um email valido`() {

            val tipoDeChave = TipoDaChave.EMAIL

            assertTrue(tipoDeChave.validacao("todoroki@gmail.com"))
        }

        @Test
        internal fun `nao deve validar quando email for nulo ou vazio`() {

            val tipoDeChave = TipoDaChave.EMAIL

            assertFalse(tipoDeChave.validacao(null))
            assertFalse(tipoDeChave.validacao(""))
        }

        @Test
        internal fun `nao deve validar quando email for invalido`() {

            val tipoDeChave = TipoDaChave.EMAIL

            assertFalse(tipoDeChave.validacao("todorokigmail.com"))
        }
    }
}