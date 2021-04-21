package exercicios1;

public class CalculadoraIMC {
    public static void main(String[] args) {
        double altura = 1.68;
        double peso = 63;
        double imc;

        imc = peso / (altura * altura);
        System.out.printf("IMC = %.2f %n", imc);
        if (imc >= 40) {
            System.out.println("Cuide-se, sua classificação é obesidade grave.");
        } else if (imc <= 39.9 && imc >= 30) {
            System.out.println("Cuide-se, sua classificação é obesidade.");
        } else if (imc <= 29.9 && imc >= 25) {
            System.out.println("Cuidado, sua classificação é sobrepeso.");
        } else if (imc <= 24.9 && imc >= 18.5) {
            System.out.println("Parabéns, sua classificação é normal.");
        } else if (imc < 18.5) {
            System.out.println("Cuidado, sua classificação é magreza.");
        }
    }
}
