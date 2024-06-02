package br.com.jhonnyazevedo.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jhonny = new Pessoa("Jhonny", LocalDateTime.of(1983, 5, 7, 12, 45));

        // Verificar se Jhonny tem 41 anos
        Assertions.assertEquals(41, jhonny.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jhonny = new Pessoa("Jhonny", LocalDateTime.of(1983, 5, 7, 12, 45));
        Pessoa miguel = new Pessoa("Miguel", LocalDateTime.now());

        // Verificar se Jhonny é maior de idade
        Assertions.assertTrue(jhonny.ehMairoDeIdade());

        // Verificar se Miguel é menor de idade
        Assertions.assertFalse(miguel.ehMairoDeIdade());
    }
}
