import java.util.HashMap;

//Assignment #2 para curso de Orientação a Objetos com Java. by: Instituto Tecnológico de Aeronáutica
//Programa para simulação de uma pizzaria.
//Autor(a): Andressa Machado
//Last update: 29.junho.2018

public class Pizza {
    private String nomePizza;
    private String tamanhoPizza;

    int quantidade;


    private static HashMap<String, Integer> ingredientes = new HashMap();
    ;


    public Pizza(String nomePizza, String tamanhoPizza) {
        this.nomePizza = nomePizza;
        this.tamanhoPizza = tamanhoPizza;
        this.quantidade = 0;
        System.out.println("******************************");
        System.out.println("Pizza: " + nomePizza);
        System.out.println();
    }


    public void adicionaIngrediente(String ingrediente) {


        Pizza.contabilizaIngrediente(ingrediente);
        this.quantidade++;

        System.out.println(ingrediente + " foi adicionado");

        if (quantidade < 2) {
            System.out.println(quantidade + " ingrediente foi adicionado. ");
            System.out.println();
        } else if (quantidade >= 2) {
            System.out.println(quantidade + " ingredientes  foram  adicionados. ");
            System.out.println();
        }
    }

    public static void contabilizaIngrediente(String ingrediente) {

        ingredientes.merge(ingrediente, 1, Integer::sum);
    }

    public double getPreco() {

        if (quantidade <= 2) {
            return 15;
        }
        if (quantidade <= 5) {
            return 20;
        }

        return 23;

    }

    public static HashMap<String, Integer> getIngredientes() {
        return ingredientes;
    }
}
