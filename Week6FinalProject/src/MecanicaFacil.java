public class MecanicaFacil implements MecanicaDoJogo {

    private int tentativas;
    private int erros;
    private String palavraDaVez;
    private int pontuacao;
    private FabricaEmbaralhadores embaralhadores;
    private BancoDePalavras banco;

    public MecanicaFacil() {

        this.tentativas = 3;
        this.erros = 0;
        this.pontuacao = 0;
        this.embaralhadores = new FabricaEmbaralhadores();
        this.banco = new BancoDePalavras();
    }

    public String getPalavraEmbaralhada() {

        this.palavraDaVez = this.banco.getPalavraGerada();
        Embaralhador embaralhadorDaVez = embaralhadores.getEmbaralhador();
        String palavraEmbaralhada = embaralhadorDaVez.embaralhador(palavraDaVez);
        return palavraEmbaralhada;
    }

    public boolean acertou(String respostaDoUsuario) {

        if (palavraDaVez.equals(respostaDoUsuario)) {
            this.tentativas = 3;
            return true;
        } else {
            this.tentativas--;
            if (this.tentativas == 0) {
                this.erros++;
                this.tentativas = 3;
            }
            return false;
        }
    }

    public boolean temTentativas() {
        if (this.tentativas > 0)
            return true;
        return false;
    }

    public boolean terminouJogo() {
        return this.erros >= 3;
    }

    public int pontuacaoFinal() {
        return this.pontuacao;
    }


}
