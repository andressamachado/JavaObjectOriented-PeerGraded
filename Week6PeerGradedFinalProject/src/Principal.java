import java.util.Scanner;

//Assignment #6 para curso de Orientação a Objetos com Java. by: Instituto Tecnológico de Aeronáutica
//Programa final para conclusao do curso.
//Jogo das Palavras Embaralhadas
//Autor(a): Andressa Machado
//Last update: 29.julho.2018

public class Principal {

    public static void main(String[] args) {

        int nivelJogo = 0;
        Scanner resposta = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("============= Jogo das Palavras Embaralhadas =============");
        System.out.println("descubra o máximo de palavras que você conseguir!");
        System.out.println("==========================================================");
        System.out.println();

        System.out.println("Níveis de dificuldade disponíveis: ");
        System.out.println("*\t[1] Fácil: 3 tentativas por palavra e 3 chances de erro.");
        System.out.println("*\t[2] Difícil: errou, perdeu.");
        System.out.println("*\t[0] Finalizar jogo.");
        System.out.println();
        System.out.print("Escolha o nível desejado: ");


        do {
            nivelJogo = input.nextInt();
            if (!(nivelJogo == 1 || nivelJogo == 2 || nivelJogo == 0))
                System.out.print("Opção Inválida, escolha entre [1], [2] ou [0] para finalizar: ");
        } while (!(nivelJogo == 1 || nivelJogo == 2 || nivelJogo == 0));

        if (nivelJogo == 0) {
            System.out.println("Jogo finalizado");
            return;
        }

        FabricaMecanicaDoJogo.set(nivelJogo);
        MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.getMecanicaDoJogo();


        System.out.println("A nível escolhido foi: " + mecanica.getNome());
        System.out.println("*Digite [sair] a qualquer momento para finalizar a partida.");
        System.out.println("==========================================================");

        while (!mecanica.terminouJogo())

        {

            while (mecanica.temTentativas()) {
                System.out.println("sua palavra para adivinhar é: " + mecanica.getPalavraEmbaralhada());
                System.out.print("Digite resposta: ");

                String respostaDoUsuario = resposta.nextLine();
                if (respostaDoUsuario.equalsIgnoreCase("sair")) {
                    System.out.println("Jogo finalizado");
                    System.out.println("--------------------");
                    System.out.println("Pontuação final: " + mecanica.getPontuacao());
                    System.out.println("--------------------");
                    return;
                }

                boolean acertou = mecanica.acertou(respostaDoUsuario);

                if (acertou) {
                    System.out.println("Parabéns, você acertou! sua pontuação atual é: " + mecanica.getPontuacao());
                    System.out.println();
                } else if (mecanica.temTentativas()) {
                    System.out.println("Você errou! sua pontuação atual é: " + mecanica.getPontuacao());
                    System.out.println("Restam " + mecanica.getTentativas() + " tentativas");
                    System.out.println();
                }

                if (!(mecanica.temTentativas())) {
                    System.out.println("Você perdeu esta palavra. Restam " + mecanica.getErros() + " erro(s).");
                    System.out.println("Pontuação atual é: " + mecanica.getPontuacao());
                    System.out.println();
                }
            }
        }

        System.out.println("Você usou todas as suas chances de erro e o jogo acabou!");
        System.out.println("Pontuação final: " + mecanica.getPontuacao());
    }
}