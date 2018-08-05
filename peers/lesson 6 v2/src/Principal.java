import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String palavra, nivel, n;
		FabricaMecanicaDoJogo m = new FabricaMecanicaDoJogo();
		MecanicaDoJogo mj;
		
		Scanner sc = new Scanner(System.in);
		do{
			
			System.out.println("Seja bem vindo ao jogo");
			System.out.println("PALAVRAS EMBARALHADAS");
			System.out.println("");
			System.out.println("Seu objetivo é descobrir qual é a palavra que está embaralhada");
			System.out.println("Insira o nível que quer jogar:");
			System.out.println("1 - Nível Fácil (Tem 3 vidas)");
			System.out.println("2 - Nível Difícil (Tem apenas 1 vida)");
			System.out.println("A pontuação vai depender do tamanho da palavra e do nível escolhido:");
			System.out.println("Fácil: cada letra vale 1 ponto. Difícil: cada letra vale 2 pontos");
			
			do{
				nivel = sc.nextLine();
				if(!nivel.equals("1") && !nivel.equals("2"))
					System.out.println("Opção inválida. Digite novamente");
			}while(!nivel.equals("1") && !nivel.equals("2"));
			
			if(nivel.equals("2")){
				mj = m.retornoMecanica(2);
				System.out.println("Você escolheu o nível difícil");
			}else{
				mj = m.retornoMecanica(1);
				System.out.println("Você escolheu o nível fácil");
			}
			
			do{
				System.out.println("Adivinhe a palavra:");	
				System.out.println(mj.getPalavraDepois());
				System.out.println("Digite sua resposta:");
				palavra = sc.nextLine();
				if(mj.verificaPalavra(palavra)){
					System.out.println("Você acertou!! :)");
					mj.acerta(mj.getPalavra().length());
				}
				else{
					System.out.println("Você errou!! :(");
					System.out.println("A palavra correta era " + mj.getPalavra());
					mj.perdeVida();
					if(mj.getVida() != 0)
						System.out.println("Ainda restam: " + mj.getVida() + " vida(s).");
				}
				mj.novaPalavra();
				
			}while(mj.getVida() > 0);
			
			System.out.println("O jogo acabou!");
			System.out.println("Sua pontuação foi de " + mj.getPontos() + " pontos.");
			System.out.println("");
			System.out.println("Gostaria de jogar novamente:");
			System.out.println("1 - Sim; 2 - Não");
			do{
				n = sc.nextLine();
				if(!n.equals("1") && !n.equals("2"))
					System.out.println("Opção inválida, tente novamente.");
			}while(!n.equals("1") && !n.equals("2"));
		}while(n.equals("1"));
		System.out.println("Jogo finalizado!");
		sc.close();
	}

}
