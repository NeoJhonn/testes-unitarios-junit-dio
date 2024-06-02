# Testes Unitários Com JUnit

* Chamado de testes de unidades, testa a menor unidade do código possível(função, método, classes), escrito em tempo
  de desenvolvimento.

* Importânciad e fazer testes unitário: compreender o código, corrigin bugs de segurança, refatorar sem introduzir bugs,
  entregar com segurança uma nova feature.

* É um framework open source para criação de testes unitários criados por Erich Gamma(Gang of Four, Design Patterns)
  e Kent Beck(TDD).

* Versão atual do JUnit => 5:
    - JUnit Platform: é o componente que execulta os testes.
    - JUnit Jupiter: concentra todo o arcabouço de anotatios e recursos que usamos.
    - JUnit Vintage: motor para fazer integração com as versões mais atigas do framework.

## Adicionando o JUnit no seu projeto

* Pesquizar no site do maven por "JUnit Jupiter Engine"

* Adicione a dependência no pom:

```
<!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine -->
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.11.0-M2</version>
    <scope>test</scope>
</dependency>
```

* Adicionando a dependência no build.gradle:

```
testImplementation group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.11.0-M2'

``` 
- Adicione o trecho de código no build.gradle para ele usar o JUnit para testes, no caso de um projeto gradle:

```
test {
   useJUnitPlatform()
}
```

* Site documentação JUnit: https://junit.org/junit5/


## Principais recursos do JUnit

* Assertions
```
@Test
void validarLancamentos() {
int[] primeiroLancamento = {10, 20, 30, 40, 50};
int[] segundoLancamento = {10, 20, 30, 40, 50};

        // Verifica se os dois arrays são iguais
        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }
```

* Assumptions
```
  @Test
  void validarAlgoSomenteNoUsuarioJhonny() {
  // Presuma que estou logado como USERNAME NeoJhon
  // que é o nome do meu usuário Windows
  Assumptions.assumeTrue("NeoJhon".equals(System.getenv("USERNAME")));
  Assertions.assertEquals(10, 5 + 5);
  }
```

* Condicionais

```
@Test
// verifique se a variável de ambiente USER == jhonny
//@EnabledIfEnvironmentVariable(named = "USERNAME", matches = "jhonny")
//@DisabledIfEnvironmentVariable(named = "root", matches = "jhonny")
//@EnabledOnOs(OS.LINUX)
//@EnabledOnJre(JRE.JAVA_19)
@EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_21)
void validarAlgoSomenteNoUsuarioJhonny() {
Assertions.assertEquals(10, 5 + 5);
}
```

* BeforeAll, AfterAll, BeforeEach e AfterEach

```
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
```

* Escolher a ordem de chamada dos testes

```
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
```

* Testes de Exceção

```
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
```

## Boas Práticas

* Simplicidade
    - Preocupe-se com os nomes.
    - Preocupe-se com facilidade de leitura.

* Testar cedo
    - Escreva código mais próximo possível do código de execução.
    - Veja um pouco sobre TDD.

* Padronização
    - Nomenclatura.

* Testes determinísticos
    - Escreva testes que sempre dê o mesmo resultado/estado.

* Automatize para ganhar tempo
    - Ferramentas de cobertura de código(Jacoco)
    - Automatize a execução dos seus testes.


