import java.util.ArrayList;1
import java.util.Random;

public class FabricaEmbaralhadores {

    protected Embaralhador getEmbaralhador;

    ArrayList<Embaralhador> embaralhadores = new ArrayList<Embaralhador>(2);

    embaralhadores.add(new
    EmbaralhadorRandom());
embaralhadores.add(new

    EmbaralhadorParImpar());

//    public Random EmbaralhadorAleatorio() {
//
//        Random getEmbaralhador = new Random();
//        getEmbaralhador.nextInt();
//
//        return getEmbaralhador;
//    }
}