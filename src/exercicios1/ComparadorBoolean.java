package exercicios1;

public class ComparadorBoolean {
    public static void main(String[] args) {
        int primeiroNumero = 1;
        int segundoNumero = 1;
        boolean comparador = primeiroNumero == segundoNumero;

        if (comparador) {
            System.out.println("Os n�meros s�o iguais.");
        } else {
            System.out.println("Os n�meros n�o s�o iguais.");
        }

        int numero1 = 1;
        int numero2 = 2;
        boolean comparador1 = numero1 == numero2;

        if (comparador1) {
            System.out.println("Os n�meros s�o iguais.");
        }
        System.out.println("Os n�meros n�o s�o iguais.");
    }
}
