import org.junit.Test;

public class TesteEmbaralhador {
	
	@Test
	public void testEmbaralhadorAleatorio() {
		EmbaralhadorAleatorio ea = new EmbaralhadorAleatorio();
		System.out.println("Embaralhador aleatório:");
		System.out.println(ea.embaralhar("cavalo"));
		System.out.println(ea.embaralhar("vaca"));
		System.out.println(ea.embaralhar("ovelha"));
	}
	
	@Test
	public void testEmbaralhadorReverso() {
		EmbaralhadorReverso ea = new EmbaralhadorReverso();
		System.out.println("Embaralhador reverso:");
		System.out.println(ea.embaralhar("cavalo"));
		System.out.println(ea.embaralhar("vaca"));
		System.out.println(ea.embaralhar("ovelha"));
	}	
		
}
