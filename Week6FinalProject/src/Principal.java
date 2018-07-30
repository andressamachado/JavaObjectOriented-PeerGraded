import java.util.Scanner;

//Assignment #6 para curso de Orientação a Objetos com Java. by: Instituto Tecnológico de Aeronáutica
//Programa final para conclusao do curso.
//Jogo das Palavras Embaralhadas
//Autor(a): Andressa Machado
//Last update: 29.julho.2018

public class Principal {

    public static void main(String[] args) {

        Scanner resposta = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("========= Jogo das Palavras Embaralhadas =========");
        System.out.println("descubra o máximo de palavras que você conseguir!");
        System.out.println("==================================================");
        System.out.println();

        System.out.println("Níveis de dificuldade disponíveis: ");
        System.out.println("*\t[1] Fácil: 3 tentativas por palavra.");
        System.out.println("*\t[2] Difício: errou, perdeu.");

        System.out.println();

        System.out.print("Escolha o nível desejado: ");

        int nivelJogo = 0;

        do {
            nivelJogo = input.nextInt();
            if (!(nivelJogo == 1 || nivelJogo == 2)) {
                System.out.print("Opção Inválida, escolha entre [1] ou [2]: ");
                nivelJogo = input.nextInt();
            }
        } while (!(nivelJogo == 1 || nivelJogo == 2));

        FabricaMecanicaDoJogo.set(nivelJogo);
        MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.getMecanicaDoJogo();


        System.out.println("A nível escolhido foi: " + mecanica.getNome());
        System.out.println("==================================================");

        while (!mecanica.terminouJogo())

        {

            while (mecanica.temTentativas()) {
                System.out.println("sua palavra para adivinhar é: ");
                System.out.println(mecanica.getPalavraEmbaralhada());
                System.out.print("Digite resposta(digite [sair] para finalizar o jogo: ");

                String respostaDoUsuario = resposta.nextLine();
                if (respostaDoUsuario.equalsIgnoreCase("sair"))
                    return;

                boolean acertou = mecanica.acertou(respostaDoUsuario);

                if (acertou) {
                    System.out.println("Parabéns, você acertou! sua pontuação atual é: " + mecanica.getPontuacao());
                    System.out.println();
                } else if (mecanica.temTentativas()) {
                    System.out.println("Você errou! sua pontuação atual é: " + mecanica.getPontuacao());
                    System.out.println();
                }
            }
        }
        System.out.println("Você errou! sua pontuação ficou em: " + mecanica.getPontuacao());
        System.out.println();
    }
}
