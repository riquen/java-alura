package exercicios2;

public class ContagemNumeros {
    public static void main(String[] args) {
        int contador = 0;
        while (contador <= 20) {
            System.out.print(contador++ + " ");
        }

        System.out.println();

        int contador2 = 20;
        while (contador2 >= 0) {
            System.out.print(contador2-- + " ");
        }

        System.out.println();

        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 20; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        int contador3 = 1;
        while (contador3 <= 20) {
            System.out.print(contador3++ + " ");
        }

        System.out.println();

        int contador4 = 20;
        while (contador4 >= 1) {
            System.out.print(contador4-- + " ");
        }

        System.out.println();

        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 20; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
