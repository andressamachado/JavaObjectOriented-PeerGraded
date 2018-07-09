//Assignment #2 para curso de Orientação a Objetos com Java. by: Instituto Tecnológico de Aeronáutica
//Programa para simulação de uma pizzaria.
//Autor(a): Andressa Machado
//Last update: 29.junho.2018

public class Principal {

    public static void main(String[] args) {


        //Criando as 3 pizzas:
        Pizza pizza1 = new Pizza("Pizza #1", "pequena");
        pizza1.adicionaIngrediente("Queijo");
        pizza1.adicionaIngrediente("Tomate");
        pizza1.adicionaIngrediente("Azeitona");


        Pizza pizza2 = new Pizza("Pizza #2", "pequena");
        pizza2.adicionaIngrediente("Queijo");
        pizza2.adicionaIngrediente("Tomate");
        pizza2.adicionaIngrediente("Azeitona");


        Pizza pizza3 = new Pizza("Pizza #3", "pequena");
        pizza3.adicionaIngrediente("Queijo");
        pizza3.adicionaIngrediente("Tomate");
        pizza3.adicionaIngrediente("Azeitona");
        pizza3.adicionaIngrediente("Ovo");
        pizza3.adicionaIngrediente("Cebola");
        pizza3.adicionaIngrediente("Pimentão");

        //Pizza criada sem ingredientes:
        Pizza pizza4 = new Pizza ("chocolate", "pequena");

        //Adicionando as pizzas  ao carrinho:
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarCarrinho(pizza1);
        carrinho.adicionarCarrinho(pizza2);
        carrinho.adicionarCarrinho(pizza3);

        carrinho.adicionarCarrinho(pizza4);



        //Imprimindo o total do valor da compra:
        System.out.println("=======================================");
        System.out.println("Valor total do pedido:  ");
        System.out.println(carrinho.valorTotal());
        System.out.println("=======================================");


        //Imprimindo a quantidade  utilizada de cada Ingrediente:
        System.out.println("Quantidade de Ingredientes utilizados: ");
        System.out.println("---------------------------------------");
        for (String key : Pizza.getIngredientes().keySet()) {

            Integer value = Pizza.getIngredientes().get(key);
            System.out.println(key + " = " + value);
        }

    }
}
