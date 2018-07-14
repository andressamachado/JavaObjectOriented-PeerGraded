public class Produto {

    protected String nome;
    protected int codigo;
    protected int preco;

    public Produto(String nome, int codigo, int preco) {
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
