package br.com.jhonnyazevedo.junit;

public class TranferenciaEntreContas {

    public void transfere(Conta contaOrige, Conta contaDestino, double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }

    }
}
