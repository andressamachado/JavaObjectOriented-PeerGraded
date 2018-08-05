
public class EmbaralhadorReverso implements Embaralhador {

	@Override
	public String embaralhar(String c) {  //embaralhar reversamente
		String s = "";
		
		for(int i = c.length() - 1; i >= 0; i--){
			s += c.charAt(i);
		}
		return s;
		
	}

}
