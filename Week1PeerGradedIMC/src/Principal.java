

import java.text.DecimalFormat;

//Assignment #1 para curso de Orientação a Objetos com Java. by: Instituto Tecnológico de Aeronáutica
//Programa para calculo do IMC.
//Autor(a): Andressa Machado
//Last update: 20.julho.2018
public class Principal {

    public static void main(String[] args) {


        DecimalFormat df = new DecimalFormat("##.##");

        Paciente paciente1 = new Paciente(50, 1.60);
        System.out.println("O paciente1 encontra-se com " + paciente1.diagnostico());

        Paciente paciente2 = new Paciente(83.00, 1.72);
        System.out.println("O paciente2 encontra-se com " + paciente2.diagnostico());

        Paciente paciente3 = new Paciente(62, 1.55);
        System.out.println("O paciente3 encontra-se com " + paciente3.diagnostico());
    }
}