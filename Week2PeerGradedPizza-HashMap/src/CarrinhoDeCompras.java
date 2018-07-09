import java.util.HashMap;

//Assignment #2 para curso de Orientação a Objetos com Java. by: Instituto Tecnológico de Aeronáutica
//Programa para simulação de uma pizzaria.
//Autor(a): Andressa Machado
//Last update: 29.junho.2018

public class CarrinhoDeCompras {

    private double valorTotal = 0.0;
    private int contador = 0;
    private HashMap<Integer, Pizza> listaPizzas = new HashMap();

    public double getValorTotal() {
        return valorTotal;
    }

    public HashMap<Integer, Pizza> getListaPizzas() {
        return listaPizzas;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }


    public void adicionarCarrinho(Pizza pizza) {
        if (pizza.quantidade == 0) {
            System.out.println("* Seu pedido não possui ingredientes. Pizza não adicionada");
            return;
        }
        listaPizzas.put(contador++, pizza);
    }

    public int getContador() {
        return contador;
    }


    public double valorTotal() {
        double sum = 0;
        for (int i = 0; i < listaPizzas.size(); i++) {
            sum += listaPizzas.get(i).getPreco();

        }
        return sum;
    }

}
