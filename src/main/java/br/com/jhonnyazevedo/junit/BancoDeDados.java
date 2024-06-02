package br.com.jhonnyazevedo.junit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConexao() {
        LOGGER.info("Finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa) {
        // insere pessoa no banco
        LOGGER.info("inseriu dados");
    }

    public static void removeDados(Pessoa pessoa) {
        // insere pessoa no banco
        LOGGER.info("remove dados");
    }

}
