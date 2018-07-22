public class Autoridade {
    private String nome;
    private String sobreNome;
    private FormatadorNome formatador;

    public Autoridade(String nome, String sobreNome, FormatadorNome formatador){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.formatador = formatador;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getTratamento() {
       return this.formatador.formatarNome(this.nome, this.sobreNome);
    }
}
