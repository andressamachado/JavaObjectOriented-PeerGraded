
public class MecanicaVidas implements MecanicaDoJogo {

private int vida, pontos;
private String palavra;
private String palavraDepois;

BancoDePalavras bp = new BancoDePalavras();
FabricaEmbaralhadores fe = new FabricaEmbaralhadores();
	
	public MecanicaVidas(){
		this.vida = 3;
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
		this.pontos += n;
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
