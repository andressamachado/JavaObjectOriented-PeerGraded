import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {
	static private ArrayList<String> palavras = new ArrayList<String>();
	
	public BancoDePalavras(){
		try{
			FileReader arq = new FileReader("palavras.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = lerArq.readLine();
			
			while(linha != null){
				palavras.add(linha);
				linha = lerArq.readLine();
			}

			arq.close();
		} catch (IOException e){
			System.err.println("Erro na abertura do arquivo: " + e.getMessage());
		}
	}
	
	public String palavraAleatoria(){	//retorna uma palavra aleatória do arquivo
		Random r = new Random();
		int n = r.nextInt(palavras.size());
		return palavras.get(n);
	}

}
