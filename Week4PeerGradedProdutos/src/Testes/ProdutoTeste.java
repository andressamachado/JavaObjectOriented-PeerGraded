import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

//Assignment #4 para curso de Orientação a Objetos com Java. by: Instituto Tecnológico de Aeronáutica
//Herança - Diferente tipos de produtos
//Autor(a): Andressa Machado
//Last update: 17.julho.2018

public class ProdutoTeste {

    Produto p;

    @BeforeEach
    public void before() {
        System.out.println("@BeforeEach");

        p = new Produto("produto1", 101, 2.5);
    }

    @AfterEach
    public void after() {
        System.out.println("@AfterEach");
        System.out.println("***************************************");
    }

    @org.junit.jupiter.api.Test
    void testeIgualdade() {

        Produto p2 = new Produto("produto2", 101, 2.5);
        assertEquals(p.equals(p2), true);
        System.out.println("Teste #1 - passou | produto1 = produto2");


        assertEquals(p2.equals(p), true);
        System.out.println("Teste #2 - passou | produto2 = produto1");

    }

    @org.junit.jupiter.api.Test
    void testeDiferenca() {
        Produto p2 = new Produto("produto2", 101, 2.5);
        p2 = new Produto("produto2", 103, 2.5);
        assertEquals(p2.equals(p), false);

        //assertNotEquals(p2.equals(p), true);
        // assertFalse(p2.equals(p));
        System.out.println("Teste #3 - passou | produto1 != produto2");
    }
}