package exercicios1;

public class Swap {
    public static void main(String[] args) {
        String valor1 = "Esse é o valor 1.";
        String valor2 = "Esse é o valor 2.";
        String valor3;

        valor3 = valor2;
        valor2 = valor1;
        valor1 = valor3;
        System.out.println(valor1);
        System.out.println(valor2);
    }
}
