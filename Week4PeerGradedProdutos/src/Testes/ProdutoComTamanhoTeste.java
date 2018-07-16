import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Assignment #4 para curso de Orientação a Objetos com Java. by: Instituto Tecnológico de Aeronáutica
//Herança - Diferente tipos de produtos
//Autor(a): Andressa Machado
//Last update: 15.julho.2018

public class ProdutoComTamanhoTeste {
    ProdutoComTamanho produtoComTamanho;

    @BeforeEach
    public void before() {
        System.out.println("@BeforeEach");

        produtoComTamanho = new ProdutoComTamanho("produtoComTamanho1", 102, 8.0, 3);
    }

    @AfterEach
    public void after() {
        System.out.println("@AfterEach");
        System.out.println("***************************************");
    }

    @org.junit.jupiter.api.Test
    void testeIgualdade() {

        ProdutoComTamanho produtoComTamanho2 = new ProdutoComTamanho("produtoComTamanho2", 102, 8.0, 3);
        assertEquals(produtoComTamanho.equals(produtoComTamanho2), true);
        System.out.println("Teste #4 - passou | produtoComTamanho1 = produtoComTamanho2");

        assertEquals(produtoComTamanho2.equals(produtoComTamanho), true);
        System.out.println("Teste #5 - passou | produtoComTamanho2 = produtoComTamanho2");
    }

    @org.junit.jupiter.api.Test
    void testeDiferenca() {

        ProdutoComTamanho produtoComTamanho2 = new ProdutoComTamanho("produtoComTamanho2", 102, 8.0, 3);

        // produtos com codigos iguais e tamanhos diferentes devem ser considerados produtos diferentes:
        produtoComTamanho2 = new ProdutoComTamanho("produtoComTamanho2", 102, 2.5, 1);
        assertEquals(produtoComTamanho2.equals(produtoComTamanho), false);
        System.out.println("Teste #6 - passou | produtoComTamanho1 != produtoComTamanho2");
    }
}