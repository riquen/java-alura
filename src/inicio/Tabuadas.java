package inicio;

public class Tabuadas {
	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador < 11; multiplicador++) {
			System.out.print("Tabuada do número " + multiplicador + ": ");
			for(int contador = 1; contador < 11; contador++) {
				System.out.print(contador + " x " + multiplicador + " = " + (multiplicador * contador));
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
