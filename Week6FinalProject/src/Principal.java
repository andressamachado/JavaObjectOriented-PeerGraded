public class Principal {
    public static void main(String[] args) {

        //pegando informacao
        System.out.println("nome:");
        System.out.println(mensagem com o nome);
        //ler do scanner nome

        //perguntar tipo de mecanica
        System.out.println("escolha uma mecanica  1/2: ");
        System.out.println(opcao1 informcao );
        System.out.println(opcao 2informacao);
        //ler do scanner mecanica

        //retornar a opcao
        System.out.println(informcar a opcao selecionada );
        FabricaMecanicaDoJogo fabricaMec = new FabricaMecanicaDoJogo();

        MecanicaDoJogo mec = fabricaMec.getMecanica(opcao);

        while (!mec.terminouJogo()) {
            System.out.println("sua palavra para adivinhar:");
            System.out.println(mec.getPalavraEmbaralhada());

            while(mec.temTentativas()) {
                //ler do usuario a tentativa
                boolean acertou = mec.acertou(respostaDoUsuario);

                if (acertou)
                    System.out.println(pontuacao);
                else
                    System.out.println(pontuacao);
            }
        }

        //fim do jogo
        System.out.println("pontuacao final"+ mec.pontuacaoFinal());
    }
}
