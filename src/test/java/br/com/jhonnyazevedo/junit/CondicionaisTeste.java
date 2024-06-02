package br.com.jhonnyazevedo.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

    @Test
    // verifique se a variável de ambiente USER == jhonny
    //@EnabledIfEnvironmentVariable(named = "USER", matches = "jhonny")
    //@DisabledIfEnvironmentVariable(named = "root", matches = "jhonny")
    //@EnabledOnOs(OS.LINUX)
    //@EnabledOnJre(JRE.JAVA_19)
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_21)
    void validarAlgoSomenteNoUsuarioJhonny() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
