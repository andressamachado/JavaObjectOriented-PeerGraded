public class Produto {

    protected String nome;
    protected int codigo;
    protected double preco;

    public Produto(String nome, int codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        return codigo;
    }

    @Override
    public boolean equals(Object produto){
        return codigo == produto.hashCode();

    }



}
