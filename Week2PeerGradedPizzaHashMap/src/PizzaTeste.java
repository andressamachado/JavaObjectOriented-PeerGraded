import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Assignment #3 para curso de Orientação a Objetos com Java. by: Instituto Tecnológico de Aeronáutica
//Testes com a Classe Pizza.
//Autor(a): Andressa Machado
//Last update: 04.julho.2018

class PizzaTeste {

    @BeforeEach
    public void before() {
        System.out.println("@Before");
    }

    @AfterEach
    public void after() {
        System.out.println("@After");
    }

    @org.junit.jupiter.api.Test
    void testePizza1Ingrediente() {
        Pizza pizza0 = new Pizza("Pizza #0", "Pequena");
        pizza0.adicionaIngrediente("queijo");

        assertEquals(1, pizza0.quantidade);
        assertEquals(15, pizza0.getPreco());
        System.out.println("Teste #1 - Passou");
    }

    @org.junit.jupiter.api.Test
    void testePizza3Ingredientes() {
        Pizza pizza1 = new Pizza("Pizza #1", "Pequena");
        pizza1.adicionaIngrediente("queijo");
        pizza1.adicionaIngrediente("tomate");
        pizza1.adicionaIngrediente("cebola");

        assertEquals(3, pizza1.quantidade);
        assertEquals(20, pizza1.getPreco());
        System.out.println("Teste #2 - Passou");
    }

    @org.junit.jupiter.api.Test
    void testePizza4Ingredientes() {
        Pizza pizza2 = new Pizza("Pizza #2", "Pequena");
        pizza2.adicionaIngrediente("queijo");
        pizza2.adicionaIngrediente("tomate");
        pizza2.adicionaIngrediente("cebola");
        pizza2.adicionaIngrediente("oregano");

        assertEquals(4, pizza2.quantidade);
        assertEquals(20, pizza2.getPreco());
        System.out.println("Teste #3 - Passou");
    }

    @org.junit.jupiter.api.Test
    void testePizza5Ingredientes() {
        Pizza pizza3 = new Pizza("Pizza #3", "Pequena");
        pizza3.adicionaIngrediente("queijo");
        pizza3.adicionaIngrediente("tomate");
        pizza3.adicionaIngrediente("cebola");
        pizza3.adicionaIngrediente("azeitona");
        pizza3.adicionaIngrediente("oregano");

        assertEquals(5, pizza3.quantidade);
        assertEquals(20, pizza3.getPreco());
        System.out.println("Teste #4 - Passou");
    }

    @org.junit.jupiter.api.Test
    void testePizza6Ingredientes() {
        Pizza pizza4 = new Pizza("Pizza #4", "Pequena");
        pizza4.adicionaIngrediente("queijo");
        pizza4.adicionaIngrediente("tomate");
        pizza4.adicionaIngrediente("cebola");
        pizza4.adicionaIngrediente("azeitona");
        pizza4.adicionaIngrediente("oregano");
        pizza4.adicionaIngrediente("alho");

        assertEquals(6, pizza4.quantidade);
        assertEquals(23, pizza4.getPreco());
        System.out.println("Teste #5 - Passou");
    }

    @org.junit.jupiter.api.Test
    void testePizzaSemIngredientes() {
        Pizza pizza5 = new Pizza("Pizza #5", "Pequena");
//
//        ainda que não tenha ingredientes e por esse motivo não possa ser adicionada ao carrinho (Como era determinado no exercício), o valor de uma pizza
//        sem ingredientes é R$15.

        assertEquals(0, pizza5.quantidade);
        assertEquals(15, pizza5.getPreco());

        System.out.println("Teste #6 - Passou");
    }


}