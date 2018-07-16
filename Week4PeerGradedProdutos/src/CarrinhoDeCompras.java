import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

    Map<Produto, Integer> carrinho = new HashMap<Produto, Integer>();


    public void adicionaProduto(Produto produto, int quantidade) {

        carrinho.merge(produto, quantidade, Integer::sum);

        //olha cada produto que sao as chaves do map
//        for (Produto p : carrinho.keySet()) {
//            // somar if true
//            if (produto.codigo == p.codigo) {
//             carrinho.merge(produto, 1, Integer :: sum);
//            }
//            carrinho.put(produto, quantidade);
//
//        }
    }

    public void removeProduto(Produto produto, int quantidade) {
        // carrinho.merge(produto, -quantidade, Integer::sum);

        int valor = carrinho.get(produto);
        int total = valor - quantidade;

//        carrinho.remove(produto, quantidade);

        if (total > 0)
            carrinho.merge(produto, -quantidade, Integer::sum);
        else
            carrinho.remove(produto);
    }

    public double valorTotal() {
        double sum = 0;
        for (Produto p : carrinho.keySet()) {
            double preco = p.preco;
            int quantidade = carrinho.get(p);
            sum += preco * quantidade;
        }
        return sum;
    }


}

