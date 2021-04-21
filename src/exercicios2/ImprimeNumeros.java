package exercicios2;

public class ImprimeNumeros {
    public static void main(String[] args) {
        for (int contador = 0; contador <= 100; contador++) {
            if (contador % 2 == 0) {
                continue;
            }
            System.out.print(contador + " ");
        }

        System.out.println();

        for (int contador = 0; contador <= 100; contador++) {
            if (contador % 2 == 0) {
                System.out.print(contador + " ");
            }
        }
    }
}
