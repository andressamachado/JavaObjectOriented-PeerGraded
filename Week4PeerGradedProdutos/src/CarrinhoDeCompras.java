import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

    Map<Produto, Integer> carrinho = new HashMap<Produto, Integer>();


    public void adicionaProduto(Produto produto, int quantidade) {
        carrinho.put(produto, quantidade);
    }
}
