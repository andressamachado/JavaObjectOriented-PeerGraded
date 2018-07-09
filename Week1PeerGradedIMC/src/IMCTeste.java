import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IMCTeste {

    @BeforeEach
    public void before() {
        System.out.println("@Before");
    }

    @AfterEach
    public void after(){
        System.out.println("@After");
    }

    @Test
    void calculadoraIMCTeste (){

        DecimalFormat df = new DecimalFormat("##.##");

        Paciente paciente1 = new Paciente(50,1.60);

        assertEquals("19.53",df.format(paciente1.calcularIMC()));
        System.out.println(" IMC paciente1: " + df.format(paciente1.calcularIMC()) + " | Diagnostico: " + paciente1.diagnostico());


        Paciente paciente2 = new Paciente(50,1.72);
        assertEquals("16.9",df.format(paciente2.calcularIMC()));
        System.out.println(" IMC paciente2: " + df.format(paciente2.calcularIMC()) + " | Diagnostico: " + paciente2.diagnostico());

        Paciente paciente3 = new Paciente(83,1.72);
        assertEquals("28.06",df.format(paciente3.calcularIMC()));
        System.out.println(" IMC paciente3: " + df.format(paciente3.calcularIMC()) + " | Diagnostico: " + paciente3.diagnostico());

    }

}
