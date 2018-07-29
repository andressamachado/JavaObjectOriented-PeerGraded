public interface MecanicaDoJogo {

    public String getPalavraEmbaralhada();

    public boolean acertou(String respostaDoUsuario);

    public boolean temTentativas();

    public boolean terminouJogo();

    public int pontuacaoFinal();

}
