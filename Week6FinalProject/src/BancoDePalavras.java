import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {

    protected int palavraGerada;
    List<String> lista = new ArrayList<String>();
    BufferedReader br = null;

    public BancoDePalavras() {
    }

    {
        try {
            br = new BufferedReader(new FileReader("D:\\Academic\\Orientação a objetos com Java - Coursera\\PeerGraded  -  Assignments\\Week6FinalProject\\src\\BancoDePalavras\\palavras.txt"));
            String palavra;
            while ((palavra = br.readLine()) != null) {
                lista.add(palavra);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        Random palavraGerada = new Random();
        palavraGerada.nextInt();
    }

    public void mostrarPalavra() {
        System.out.println(lista.get(palavraGerada));
    }

    public int getPalavraGerada() {
        return palavraGerada;
    }
}

