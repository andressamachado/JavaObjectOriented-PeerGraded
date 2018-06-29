//Assignment #2 para curso de Orientação a Objetos com Java. by: Instituto Tecnológico de Aeronáutica
//Programa para simulação de uma pizzaria.
//Autor(a): Andressa Machado
//Last update: 29.junho.2018

public class Principal {

    public static void main(String[] args) {


        //Criando as 3 pizzas:
        Pizza pizza1 = new Pizza("Pizza #1", "pequena");
        pizza1.adicionaIngrediente("queijo");
        pizza1.adicionaIngrediente("tomate");
        pizza1.adicionaIngrediente("azeitona");


        Pizza pizza2 = new Pizza("Pizza #2", "pequena");
        pizza2.adicionaIngrediente("queijo");
        pizza2.adicionaIngrediente("tomate");
        pizza2.adicionaIngrediente("azeitona");


        Pizza pizza3 = new Pizza("Pizza #3", "pequena");
        pizza3.adicionaIngrediente("queijo");
        pizza3.adicionaIngrediente("tomate");
        pizza3.adicionaIngrediente("azeitona");
        pizza3.adicionaIngrediente("ovo");
        pizza3.adicionaIngrediente("cebola");
        pizza3.adicionaIngrediente("pimentão");

        //Adicionando as pizzas  ao carrinho:
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarCarrinho(pizza1);
        carrinho.adicionarCarrinho(pizza2);
        carrinho.adicionarCarrinho(pizza3);

        //Imprimindo o total do valor da compra:
        System.out.println("**********");
        System.out.println("Valor total do pedido:  ");
        System.out.println(carrinho.valorTotal());
        System.out.println("**********");


        //Imprimindo a quantidade  utilizada de cada Ingrediente:
        System.out.println("Ingredientes utilizados: ");
        for (String key : Pizza.getIngredientes().keySet()) {

            Integer value = Pizza.getIngredientes().get(key);
            System.out.println(key + " = " + value);
        }

    }
}
