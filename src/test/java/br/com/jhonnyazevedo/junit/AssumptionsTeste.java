package br.com.jhonnyazevedo.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioJhonny() {
        // Presuma que estou logado como USERNAME NeoJhon
        // que é o nome do meu usuário Windows
        Assumptions.assumeTrue("NeoJhon".equals(System.getenv("USERNAME")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
