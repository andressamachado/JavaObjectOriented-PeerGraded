public class Respeitoso implements FormatadorNome {
    private String tratamento;

    public Respeitoso(String genero) {
        if(  genero.equalsIgnoreCase("masculino")) {
            this.tratamento = "Sr.";
        }
        if(  genero.equalsIgnoreCase("feminino")) {
            this.tratamento = "Sra.";
        }
    }

    public String formatarNome(String nome, String sobreNome) {
        return String.join(" ",  this.tratamento, sobreNome);
    }
}
