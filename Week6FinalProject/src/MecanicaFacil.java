public class MecanicaFacil implements MecanicaDoJogo {

    private int tentativas;
    private int erros;
    private String palavraDaVez;
    private int pontuacao;
    private FabricaEmbaralhadores embaralhadores;
    private BancoDePalavras banco;
    private String nome = "[1] Fácil";

    public String getNome() {
        return nome;
    }

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
            //se o usuario acertou, resetar as tentativas.
            this.tentativas = 3;
            this.pontuacao++;
            return true;
        } else {
            this.tentativas--;
            //se gastou as tentativas, adiciona erro, passa pra proxima palavra
            if (this.tentativas == 0) {
                this.erros++;
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
        if( this.erros >= 3)
            return true;
        else {
            this.tentativas = 3;
        }
        return false;
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

}
