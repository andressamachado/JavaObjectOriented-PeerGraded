import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Assignment #3 para curso de Orientação a Objetos com Java. by: Instituto Tecnológico de Aeronáutica
//Testes com a Classe CarrinhoDeCompras.
//Autor(a): Andressa Machado
//Last update: 04.julho.2018

class CarrinhoDeComprasTeste {

    @BeforeEach
    public void before(){
        System.out.println("@Before");
    }

    @AfterEach
    public void after(){
        System.out.println("@After");
    }

    @Test
    void testeValorTotalUmaPizza() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Pizza pizza1 = new Pizza("Pizza #1", "pequena");
        pizza1.adicionaIngrediente("queijo");
        pizza1.adicionaIngrediente("tomate");

        carrinho.adicionarCarrinho(pizza1);
        carrinho.getValorTotal();
        assertEquals(15, carrinho.valorTotal());
        System.out.println("Teste #1 - Passou | Qtd de Pizzas adicionadas: " + carrinho.getContador() + " | Valor Total do Carrinho: " + carrinho.valorTotal());
    }

    @Test
    void testeValorTotalPizzaVazia() {

        CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();
        Pizza pizza2 = new Pizza("Pizza #2", "pequena");

        carrinho2.adicionarCarrinho(pizza2);
        assertEquals(0, carrinho2.valorTotal());
        System.out.println("Teste #2 - Passou | Qtd de Pizzas adicionadas: " + carrinho2.getContador() + " | Valor Total do Carrinho: " + carrinho2.valorTotal());
    }


    @Test
    void testeValorTotal2Pizzas() {

        CarrinhoDeCompras carrinho3 = new CarrinhoDeCompras();

        Pizza pizza3 = new Pizza("Pizza #3", "pequena");
        pizza3.adicionaIngrediente("queijo");
        pizza3.adicionaIngrediente("tomate");


        Pizza pizza4 = new Pizza("Pizza #4", "pequena");
        pizza4.adicionaIngrediente("chocolate");
        pizza4.adicionaIngrediente("sorvete");
        pizza4.adicionaIngrediente("nozes");

        carrinho3.adicionarCarrinho(pizza3);
        carrinho3.adicionarCarrinho(pizza4);

        assertEquals(35, carrinho3.valorTotal());
        System.out.println("Teste #3 - Passou | Qtd de Pizzas adicionadas: " + carrinho3.getContador() + " | Valor Total do Carrinho: " + carrinho3.valorTotal());
    }
}

