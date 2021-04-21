package exercicios2;

public class Paralisacao {
    public static void main(String[] args) {
        for (int contador = 0; contador <= 20; contador++) {
            if (contador == 17) {
                break;
            }
            System.out.print(contador + " ");
        }
    }
}
