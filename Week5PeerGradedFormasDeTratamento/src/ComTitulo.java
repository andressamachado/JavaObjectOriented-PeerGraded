public class ComTitulo implements FormatadorNome {
    private String titulo;

    public ComTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String formatarNome(String nome, String sobreNome) {
        return String.join(" ",  this.titulo, nome ,sobreNome);
    }
}
