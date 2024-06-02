package br.com.jhonnyazevedo.junit;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

// Aqui fiz a importanção estática, dessa forma não preciso digitar "Assertions" cada vez que for chamr
// método de teste
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {

    @Test
    void validarLancamentos() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        // Verifica se os dois arrays são iguais
        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;
        Pessoa pessoa2 = new Pessoa("Pessoa2", LocalDateTime.of(1989, 2, 6, 15, 45));

        // Verificar se pessoa está null
        assertNull(pessoa);

        // Verifica se pessoa2 não esta null
        assertNotNull(pessoa2);
    }

    @Test
    void validadeNumerosDeTiposDiferentes() {
        double valor1 = 5;
        double valor2 = 5;

        // Verificar se os dois valores são iguais
        assertEquals(valor1, valor2);
    }
}
