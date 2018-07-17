import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Assignment #4 para curso de Orientação a Objetos com Java. by: Instituto Tecnológico de Aeronáutica
//Herança - Diferente tipos de produtos
//Autor(a): Andressa Machado
//Last update: 15.julho.2018


public class CarrinhoTeste {

    private CarrinhoDeCompras carrinho;

    @BeforeEach
    public void before() {
        System.out.println("@BeforeEach");

        carrinho = new CarrinhoDeCompras();
    }

    @AfterEach
    public void after() {
        System.out.println("@AfterEach");
        System.out.println("******************************************************************");
    }


    @org.junit.jupiter.api.Test
    void testeAdicionarProdutoNovo() {
        Produto p = new Produto("produto1", 101, 2.5);

        //adicionar produto novo
        carrinho.adicionaProduto(p, 3);

        assertEquals(carrinho.carrinho.size(), 1);
        assertEquals(carrinho.carrinho.get(p).intValue(), 3);
        System.out.println("Teste #6 - passou | produto adicionado no carrinho, size = 1");

    }

    @org.junit.jupiter.api.Test
    void testeAumentarQuantidadesMesmoProduto() {
        Produto p = new Produto("produto1", 101, 2.5);

        // teste aumentar quantidade| numero de produtos (size) = 1 | quantas unidades de produto (get values) = 6
        carrinho.adicionaProduto(p, 3);
        carrinho.adicionaProduto(p, 3);

        assertEquals(carrinho.carrinho.size(), 1);
        assertEquals(carrinho.carrinho.get(p).intValue(), 6);
        System.out.println("teste #7 - passou | quantidade de unidades do produto1 no carrinho aumentada, size = 1");
    }

    @org.junit.jupiter.api.Test
    void testeAdicionarNovoProduto() {

        Produto p = new Produto("produto1", 101, 2.5);
        Produto p2 = new Produto("produto2", 104, 5.0);

        // teste adicionar outro produto novo | numero de produtos (size) = 2 | quantas unidades de produto (get values ) = 3
        carrinho.adicionaProduto(p, 3);
        carrinho.adicionaProduto(p2, 3);

        assertEquals(carrinho.carrinho.size(), 2);
        assertEquals(carrinho.carrinho.get(p2).intValue(), 3);
        System.out.println("Teste #8 - passou | novo produto sendo adicionado ao carrinho, size = 2");

    }

    @org.junit.jupiter.api.Test
    void testeAdicionandoProdutoComTamanhoAoCarrinho() {

        Produto p = new Produto("produto1", 101, 2.5);
        ProdutoComTamanho p2 = new ProdutoComTamanho("produto3", 105, 7.0, 2);

        // teste adicionar produto com tamanho
        carrinho.adicionaProduto(p,2);
        carrinho.adicionaProduto(p2, 4);

        assertEquals(carrinho.carrinho.size(), 2);
        assertEquals(carrinho.carrinho.get(p2).intValue(), 4);
        System.out.println("Teste #9 - passou | produto com tamanho sendo adicionado ao carrinho, size = 3");
    }

    @org.junit.jupiter.api.Test
    void testeAdicionarProdutoComTamanhoDiferente() {

        ProdutoComTamanho p1 = new ProdutoComTamanho("produto1", 105, 7.0, 2);
        ProdutoComTamanho p2 = new ProdutoComTamanho("produto2", 105, 7.0, 1);

        // teste adicionar produto com tamanho diferente
        carrinho.adicionaProduto(p1, 2);
        carrinho.adicionaProduto(p2, 2);

        assertEquals(carrinho.carrinho.size(), 2);
        assertEquals(carrinho.carrinho.get(p2).intValue(), 2);
        System.out.println("Teste #10 - passou | produto com tamanho diferente adicionado ao carrinho, size = 2");
    }

    @org.junit.jupiter.api.Test
    void testeRemoverMenosQueOTotal() {

        Produto p = new Produto("produto1", 101, 2.5);
        Produto p2 = new Produto("produto2", 104, 5.0);
        ProdutoComTamanho p3 = new ProdutoComTamanho("produto3", 105, 7.0, 2);
        ProdutoComTamanho p4 = new ProdutoComTamanho("produto3", 105, 7.0, 1);

        carrinho.adicionaProduto(p, 1);
        carrinho.adicionaProduto(p2, 2);
        carrinho.adicionaProduto(p3, 3);
        carrinho.adicionaProduto(p4, 4);

        //remover menos do que tem no total | tamanho da lista permanece | quantidade p2 abaixa
        carrinho.removeProduto(p2, 1);

        assertEquals(carrinho.carrinho.size(), 4);
        assertEquals(carrinho.carrinho.get(p2).intValue(), 1);
        System.out.println("Teste #11 - passou | O numero de produtos removidos é menor do que a quantidade existente no carrinho");
    }

    @org.junit.jupiter.api.Test
    void testeRemoverExatamenteOTotal() {

        Produto p = new Produto("produto1", 101, 2.5);
        Produto p2 = new Produto("produto2", 104, 5.0);
        ProdutoComTamanho p3 = new ProdutoComTamanho("produto3", 105, 7.0, 2);
        ProdutoComTamanho p4 = new ProdutoComTamanho("produto3", 105, 7.0, 1);

        carrinho.adicionaProduto(p, 1);
        carrinho.adicionaProduto(p2, 2);
        carrinho.adicionaProduto(p3, 3);
        carrinho.adicionaProduto(p4, 4);

        //remover exatamente o que tem | tamanho da lista diminui pois nao ha mais produto p
        carrinho.removeProduto(p, 1);

        assertEquals(carrinho.carrinho.size(), 3);
        assertEquals(carrinho.carrinho.containsKey(p), false);
        System.out.println("Teste #12 - passou | numero de itens removidos é igual ao numero de itens existentes.");
    }

    @org.junit.jupiter.api.Test
    void testeRemoverMaisQueOTotal() {

        Produto p = new Produto("produto1", 101, 2.5);
        Produto p2 = new Produto("produto2", 104, 5.0);
        ProdutoComTamanho p3 = new ProdutoComTamanho("produto3", 105, 7.0, 2);
        ProdutoComTamanho p4 = new ProdutoComTamanho("produto3", 105, 7.0, 1);

        carrinho.adicionaProduto(p, 1);
        carrinho.adicionaProduto(p2, 2);
        carrinho.adicionaProduto(p3, 3);
        carrinho.adicionaProduto(p4, 4);

        //remover mais do que tem | tamanho da lista diminiu pra 2 pois nao ha mais p1 nem p4
        carrinho.removeProduto(p4, 5);

        assertEquals(carrinho.carrinho.size(), 3);
        assertEquals(carrinho.carrinho.containsKey(p4), false);
        System.out.println("Teste #13 - passou | numero de itens removidos é maior do que o numero de itens existentes.");
    }

    @org.junit.jupiter.api.Test
    void testeSomaVazia() {

        assertEquals(carrinho.valorTotal(), 0.0);
        System.out.println("Teste #14 - passou | Não existe itens no carrinho. Valor total = 0.");
    }

    @org.junit.jupiter.api.Test
    void testeSoma() {

        Produto p = new Produto("produto1", 101, 2.5);
        ProdutoComTamanho p2 = new ProdutoComTamanho("produto3", 105, 7.0, 1);

        carrinho.adicionaProduto(p, 1);
        carrinho.adicionaProduto(p2, 2);
        assertEquals(carrinho.valorTotal(), 16.5);

        System.out.println("Teste #15 - passou | 3 itens no carrinho. Valor total = 16,5.");


    }

}

