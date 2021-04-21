package inicio;

public class Caracteres {
	public static void main(String args[]) {
		char letra = 'a';
		System.out.println("A letra é " + letra);
		
		char valor = 65;
		System.out.println("A letra é " + valor);
		
		valor = (char) (valor + 1);
		System.out.println("A letra é " + valor);
		
		String palavra = "Henrique ";
		System.out.println(palavra);
		
		palavra = palavra + 2021;
		System.out.println(palavra);
	}
}
