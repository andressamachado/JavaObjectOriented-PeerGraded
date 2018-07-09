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
    public void after() {
        System.out.println("@After");
    }

    @Test
    void testPacienteBaixoPessoMuitoGrave() {
        DecimalFormat df = new DecimalFormat("##.##");

        Paciente paciente1 = new Paciente(30, 1.60);
        assertEquals("11.72", df.format(paciente1.calcularIMC()));
        System.out.println(" Teste | IMC paciente1: " + df.format(paciente1.calcularIMC()) + " | Diagnostico: " + paciente1.diagnostico());
    }

    @Test
    void testPacienteBaixoPessoGrave() {
        DecimalFormat df = new DecimalFormat("##.##");

        Paciente paciente2 = new Paciente(50, 1.72);
        assertEquals("16.9", df.format(paciente2.calcularIMC()));
        System.out.println(" Teste | IMC paciente2: " + df.format(paciente2.calcularIMC()) + " | Diagnostico: " + paciente2.diagnostico());
    }

    @Test
    void testarPacienteBaixoPeso() {
        DecimalFormat df = new DecimalFormat("##.##");

        Paciente paciente3 = new Paciente(42, 1.55);
        assertEquals("17.48", df.format(paciente3.calcularIMC()));
        System.out.println(" Teste | IMC paciente3: " + df.format(paciente3.calcularIMC()) + " | Diagnostico: " + paciente3.diagnostico());
    }

    @Test
    void testarPacientePesoNormal() {
        DecimalFormat df = new DecimalFormat("##.##");

        Paciente paciente4 = new Paciente(45, 1.55);
        assertEquals("18.73", df.format(paciente4.calcularIMC()));
                System.out.println(" Teste | IMC paciente4: " + df.format(paciente4.calcularIMC()) + " | Diagnostico: " + paciente4.diagnostico());
    }

    @Test
    void testarPacienteSobrepeso() {
        DecimalFormat df = new DecimalFormat("##.##");

        Paciente paciente5 = new Paciente(70, 1.63);
        assertEquals("26.35", df.format(paciente5.calcularIMC()));
        System.out.println(" Teste | IMC paciente5: " + df.format(paciente5.calcularIMC()) + " | Diagnostico: " + paciente5.diagnostico());
    }

    @Test
    void testarPacienteObesidadeI() {
        DecimalFormat df = new DecimalFormat("##.##");

        Paciente paciente6 = new Paciente(81, 1.63);
        assertEquals("30.49", df.format(paciente6.calcularIMC()));
        System.out.println(" Teste | IMC paciente6: " + df.format(paciente6.calcularIMC()) + " | Diagnostico: " + paciente6.diagnostico());
    }

    @Test
    void testarPacienteObesidadeII() {
        DecimalFormat df = new DecimalFormat("##.##");

        Paciente paciente7 = new Paciente(98, 1.63);
        assertEquals("36.89", df.format(paciente7.calcularIMC()));
        System.out.println(" Teste | IMC paciente7: " + df.format(paciente7.calcularIMC()) + " | Diagnostico: " + paciente7.diagnostico());
    }

    @Test
    void testarPacienteObesidadeIII() {
        DecimalFormat df = new DecimalFormat("##.##");

        Paciente paciente8 = new Paciente(110, 1.63);
        assertEquals("41.4", df.format(paciente8.calcularIMC()));
        System.out.println(" Teste | IMC paciente8: " + df.format(paciente8.calcularIMC()) + " | Diagnostico: " + paciente8.diagnostico());
    }

}
