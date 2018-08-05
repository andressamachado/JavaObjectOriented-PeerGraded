import java.util.Random;

public class EmbaralhadorAleatorio implements Embaralhador{
	public String embaralhar(String c){ //embaralha de maneira aleatória
		Random random = new Random();
		
		char s[] = c.toCharArray();
		
		int n = s.length; 
		  for (int i = 0; i < n; i++) {
		    int t = random.nextInt(n); 
		    if (t == i) {              
		      if (i > 0) {             
		        t = random.nextInt(i); 
		      } else {
		        t = s.length - 1;      
		      }
		    }
		    s[i] ^= s[t];           
		    s[t] ^= s[i];
		    s[i] ^= s[t];
		  }
		  
		  c = String.copyValueOf(s);
		  return c;
	}
	
	
}
