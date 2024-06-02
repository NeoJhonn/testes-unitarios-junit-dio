package br.com.jhonnyazevedo.junit;

import org.junit.jupiter.api.*;

// com a notação @Order vc define a ordem de execulção dos métodos
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//Execulta os teste pela ordem alfabética dos nomes dos métodos
//@TestMethodOrder(MethodOrderer.MethodName.class)
//Execulta os teste pela ordem alfabética dos nomes customizado na anotation @DisplayName
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoOrdemTeste {

    //@Order(4)
    @DisplayName("A")
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    //@Order(3)
    @DisplayName("B")
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    //@Order(2)
    @DisplayName("C")
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    //@Order(1)
    @DisplayName("D")
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
