public class ProdutoComTamanho extends Produto {

    private int tamanho;

    public int getTamanho() {
        return tamanho;
    }

    public ProdutoComTamanho(String nome, int codigo, int preco, int tamanho) {
        super(nome, codigo, preco);
        this.tamanho = tamanho;
    }

    public boolean equals (ProdutoComTamanho produtoTamanho) {
        return (produtoTamanho.codigo == this.codigo) && (this.tamanho == produtoTamanho.getTamanho());
    }

}
