public class ProdutoComTamanho extends Produto {

    private int tamanho;

    public int getTamanho() {
        return tamanho;
    }

    public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho) {
        super(nome, codigo, preco);
        this.tamanho = tamanho;
    }

    public boolean equals(ProdutoComTamanho produtoTamanho) {
        return (produtoTamanho.codigo == this.codigo) && (this.tamanho == produtoTamanho.getTamanho());
    }

    public int hashCode() {
        //foi colocado uma string vazia para que o codigo fosse lido como uma string e nao fosse somado com o tamanho, dando um resultado errado.
        // ex: codigo 101 + tamanho  2 = 103  | codigo 100 + tamanho 3 = 103 e sao produtos diferentes.
        // ex: codigo 101 + "" + tamanho 2 = "101"2
        // ex: parseInt = 1012 --> transforma em string
        return Integer.parseInt(codigo + "" + tamanho);
    }
}
