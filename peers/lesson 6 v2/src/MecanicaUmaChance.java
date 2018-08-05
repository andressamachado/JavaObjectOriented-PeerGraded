
public class MecanicaUmaChance implements MecanicaDoJogo {

private int vida, pontos;
String palavra;
String palavraDepois;

BancoDePalavras bp = new BancoDePalavras();
FabricaEmbaralhadores fe = new FabricaEmbaralhadores();
	
	public MecanicaUmaChance(){
		this.vida = 1;
		this.pontos = 0;
		novaPalavra();
		setPalavraDepois();
	}
	
	public boolean verificaPalavra(String palavra){
		if(palavra.equals(getPalavra()))
			return true;
		return false;
	}
	
	public int getVida(){
		return this.vida;
	}
	
	public int getPontos(){
		return this.pontos;
	}
	
	public void perdeVida(){
		this.vida--;
	}
	
	public void acerta(int n){
		this.pontos += n*2;
	}
	
	public void setPalavraDepois(){
		Embaralhador e = fe.retornoEmbaralhador();
		this.palavraDepois = e.embaralhar(getPalavra());
	}
	
	public String getPalavra(){
		return this.palavra;
	}
	
	public void novaPalavra(){
		this.palavra = bp.palavraAleatoria();
		setPalavraDepois();
	}
	
	public String getPalavraDepois(){
		return this.palavraDepois;
	}

}
