//Assignment #1 para curso de Orientação a Objetos com Java. by: Instituto Tecnológico de Aeronáutica
//Programa para calculo do IMC.
//Autor(a): Andressa Machado
//Last update: 20.julho.2018

public class Paciente {

    private double peso;
    private double altura;
    private double imc;
    private String finalIMC;

    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
        this.imc = calcularIMC();
    }

    public double calcularIMC() {

        return imc = peso / (altura * altura);
    }

    public String diagnostico() {

        if (calcularIMC() < 16) {
            System.out.println("Indice de Massa Corporal = " + String.format("%.2f", imc));
            finalIMC = "Baixo peso muito grave. \n*****************************************";

        } else if (calcularIMC() >= 16 && calcularIMC() < 17) {
            System.out.println("Indice de Massa Corporal = " + String.format("%.2f", imc));
            finalIMC = "Baixo peso grave.\n*****************************************";

        } else if (calcularIMC() >= 17 && calcularIMC() < 18.5) {
            System.out.println("Indice de Massa Corporal = " + String.format("%.2f", imc));
            finalIMC = "Baixo peso. \n*****************************************";

        } else if (calcularIMC() >= 18.5 && calcularIMC() < 25) {
            System.out.println("Indice de Massa Corporal = " + String.format("%.2f", imc));
            finalIMC = "Peso normal. \n*****************************************";

        } else if (calcularIMC() >= 25 && calcularIMC() < 30) {
            finalIMC = "Sobrepeso. \n*****************************************";
            System.out.println("\nIndice de Massa Corporal = " + String.format("%.2f", imc));

        } else if (calcularIMC() >= 30 && calcularIMC() < 35) {
            System.out.println("Indice de Massa Corporal = " + String.format("%.2f", imc));
            finalIMC = "Obesidade grau I. \n*****************************************";

        } else if (calcularIMC() >= 35 && calcularIMC() < 40) {
            System.out.println("Indice Massa Corporal = " + String.format("%.2f", imc));
            finalIMC = "Obesidade grau II.\n*****************************************";

        } else if (calcularIMC() >= 40) {
            System.out.println("Indice de Massa Corporal = " + String.format("%.2f", imc));
            finalIMC = "Obesidade grau III (obesidade mórbida). \n**********************************************************************";
        }

        return finalIMC;
    }
}

