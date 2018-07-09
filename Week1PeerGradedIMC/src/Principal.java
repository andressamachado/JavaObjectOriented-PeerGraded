

import java.text.DecimalFormat;

//Assignment #1 para curso de Orientação a Objetos com Java. by: Instituto Tecnológico de Aeronáutica
//Programa para calculo do IMC.
//Autor(a): Andressa Machado
//Last update: 20.julho.2018
public class Principal {

    public static void main(String[] args) {


        DecimalFormat df = new DecimalFormat("##.##");

        Paciente paciente1 = new Paciente(30, 1.60);
        System.out.println("O paciente1 encontra-se com " + paciente1.diagnostico());

        Paciente paciente2 = new Paciente(50.00, 1.72);
        System.out.println("O paciente2 encontra-se com " + paciente2.diagnostico());

        Paciente paciente3 = new Paciente(42, 1.55);
        System.out.println("O paciente3 encontra-se com " + paciente3.diagnostico());

        Paciente paciente4 = new Paciente(45, 1.55);
        System.out.println("O paciente4 encontra-se com " + paciente4.diagnostico());

        Paciente paciente5 = new Paciente(70, 1.63);
        System.out.println("O paciente5 encontra-se com " + paciente5.diagnostico());

        Paciente paciente6 = new Paciente(81, 1.63);
        System.out.println("O paciente6 encontra-se com " + paciente6.diagnostico());

        Paciente paciente7 = new Paciente(98, 1.63);
        System.out.println("O paciente7 encontra-se com " + paciente7.diagnostico());

        Paciente paciente8 = new Paciente(110, 1.63);
        System.out.println("O paciente8 encontra-se com " + paciente8.diagnostico());

    }
}