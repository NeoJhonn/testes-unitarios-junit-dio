package br.com.jhonnyazevedo.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosPessoaTeste {

    // Antes de tudo execulta o método abaixo
    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    // vai ser execultado antes de cada teste da sua classe
    @BeforeEach
    void inseriDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("Pessoa1", LocalDateTime.of(1999, 8, 6, 7, 0)));
    }

    // vai ser execultado depois de cada teste da sua classe
    @AfterEach
    void removerDadosDoTeste() {
        BancoDeDados.removeDados(new Pessoa("Pessoa1", LocalDateTime.of(1999, 8, 6, 7, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertTrue(true);
    }

    // Depois de tudo execulta o método abaixo
    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }
}
