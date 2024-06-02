package br.com.jhonnyazevedo.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validaCenarioExcecaoTranferencia() {
        Conta contaOrigem = new Conta("12132123", 0);
        Conta contaDestino = new Conta("7897987", 100);

        TranferenciaEntreContas tranferenciaEntreContas = new TranferenciaEntreContas();

        // Verificar se esta dando uma IllegalArgumentException
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                        tranferenciaEntreContas.transfere(contaOrigem,contaDestino, -1)
                );

        // Verificar se não esta dando uma IllegalArgumentException
        Assertions.assertDoesNotThrow(() -> tranferenciaEntreContas.transfere(contaOrigem,contaDestino, 20)
        );
    }
}
