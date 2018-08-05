
public class FabricaMecanicaDoJogo {

	public MecanicaDoJogo retornoMecanica(int n){
		if(n == 1){ //1 representa modo fácil.
			return new MecanicaVidas();
		}
		//se não for modo fácil, será o modo difícil
		return new MecanicaUmaChance();
	}

}
