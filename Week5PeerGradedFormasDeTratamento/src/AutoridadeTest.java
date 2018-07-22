import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


//Assignment #5 para curso de Orientação a Objetos com Java. by: Instituto Tecnológico de Aeronáutica
//Testes com a Classe Autoridade.
//Autor(a): Andressa Machado
//Last update: 21.julho.2018

class AutoridadeTeste {
    @BeforeEach
    public void before(){
        System.out.println("@Before");
    }

    @AfterEach
    public void after(){
        System.out.println("@After");
    }

    @Test
    void testaAutoridadeComFormatadorInformal() {

        Informal informal = new Informal();

        Autoridade autoridade = new Autoridade("John", "Lenon", informal);

        assertEquals(autoridade.getTratamento(), autoridade.getNome());
    }

    @Test
    void testaAutoridadeComFormatadorRespeitosoMasculino() {

        Respeitoso informal = new Respeitoso("masculino");

        Autoridade autoridade = new Autoridade("John", "Lenon", informal);

        assertEquals(autoridade.getTratamento(), String.join(" ", "Sr.", autoridade.getSobreNome()));
    }


    @Test
    void testaAutoridadeComFormatadorRespeitosoFeminino() {

        Respeitoso respeitoso = new Respeitoso("Feminino");

        Autoridade autoridade = new Autoridade("Yoko", "Ono", respeitoso);

        assertEquals(autoridade.getTratamento(), String.join(" ", "Sra.", autoridade.getSobreNome()));
    }


    @Test
    void testaAutoridadeComFormatadorComTitulo() {

        ComTitulo comTitulo = new ComTitulo("Mestre Jedi");

        Autoridade autoridade = new Autoridade("Mace", "Windu", comTitulo);

        assertEquals(autoridade.getTratamento(),String.join(" ", "Mestre Jedi",  autoridade.getNome(), autoridade.getSobreNome()));
    }
}