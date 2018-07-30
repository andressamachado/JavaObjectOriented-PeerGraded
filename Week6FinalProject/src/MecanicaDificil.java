public class MecanicaDificil implements MecanicaDoJogo {

    private int tentativas;
    private int erros;
    private String palavraDaVez;
    private int pontuacao;
    private FabricaEmbaralhadores embaralhadores;
    private BancoDePalavras banco;
    private String nome = "[2] Difícil";

    public String getNome() {
        return nome;
    }

    public MecanicaDificil() {

        this.tentativas = 1;
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
            this.tentativas = 1;
            this.pontuacao += 5;
            return true;
        } else {
            this.tentativas--;
            //se gastou as tentativas, adiciona erro, passa pra proxima palavra
            if (this.tentativas == 0) {
                this.erros++;
                this.tentativas = 1;
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
        return this.erros >= 1;
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

}
