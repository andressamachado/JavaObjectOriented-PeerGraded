import java.util.Random;

public class FabricaEmbaralhadores{
	
	public Embaralhador retornoEmbaralhador(){	
		Random r = new Random();
		if(r.nextInt(2)==0){
			return new EmbaralhadorAleatorio();
		}
		return new EmbaralhadorReverso();
	}
	
	
	
	
	
}
