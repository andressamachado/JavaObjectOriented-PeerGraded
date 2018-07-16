public class Produto {

    protected String nome;
    protected int codigo;
    protected double preco;

    public Produto(String nome, int codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public int hashCode() {
        return codigo;
    }

    public boolean equals(Produto produto){
        return codigo == produto.hashCode();

    }



}
