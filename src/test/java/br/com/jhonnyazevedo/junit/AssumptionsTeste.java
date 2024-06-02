package br.com.jhonnyazevedo.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioJhonny() {
        // Presuma que estou logado como USER jhonny
        Assumptions.assumeTrue("jhonny".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
