package exercicios1;

public class RaizQuadrada {
    public static void main(String[] args) {
        int numero = 225;
        int resto = 1;
        int raizQuadrada = 0;

        while (numero >= 1) {
            numero -= resto += 2;
            raizQuadrada++;
        }
        System.out.println(raizQuadrada);
    }
}
