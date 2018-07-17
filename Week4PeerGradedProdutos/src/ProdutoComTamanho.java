public class ProdutoComTamanho extends Produto {

    private int tamanho;

    public int getTamanho() {
        return tamanho;
    }

    public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho) {
        super(nome, codigo, preco);
        this.tamanho = tamanho;
    }

    @Override
    public boolean equals(Object produtoTamanho) {
        if(produtoTamanho  ==  null)
            return false;
        //casting (faz o  java ver objeto pelo tipo que ele realmente e).  @Override  pede Object  pq  vem do Java  orignal  Equals .
        if (!(produtoTamanho instanceof ProdutoComTamanho))
            return false;
        return (((ProdutoComTamanho) produtoTamanho).codigo == this.codigo) && (this.tamanho == ((ProdutoComTamanho) produtoTamanho).getTamanho());
        }

    @Override
    public int hashCode() {
        //foi colocado uma string vazia para que o codigo fosse lido como uma string e nao fosse somado com o tamanho, dando um resultado errado.
        // ex: codigo 101 + tamanho  2 = 103  | codigo 100 + tamanho 3 = 103 e sao produtos diferentes.
        // ex: codigo 101 + "" + tamanho 2 = "101"2
        // ex: parseInt = 1012 --> transforma em string
        return Integer.parseInt(codigo + "" + tamanho);
    }
}
