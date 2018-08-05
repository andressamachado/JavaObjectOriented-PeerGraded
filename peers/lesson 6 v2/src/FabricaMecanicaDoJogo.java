
public class FabricaMecanicaDoJogo {

	public MecanicaDoJogo retornoMecanica(int n){
		if(n == 1){ //1 representa modo f�cil.
			return new MecanicaVidas();
		}
		//se n�o for modo f�cil, ser� o modo dif�cil
		return new MecanicaUmaChance();
	}

}
