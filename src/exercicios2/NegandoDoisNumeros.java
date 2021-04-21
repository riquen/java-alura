package exercicios2;

public class NegandoDoisNumeros {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 0; i <= 18; i++) {
            if (contador == 13 || contador == 17) {
                contador++;
            }
            System.out.print(contador++ + " ");
        }

        System.out.println();

        for (int contador2 = 0; contador2 <= 20; contador2++) {
            if (contador2 == 13 || contador2 == 17) {
                continue;
            }
            System.out.print(contador2 + " ");
        }
    }
}
