package inicio;

public class Condicional {
	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade > 17) {
			System.out.println("Voc� � maior de idade.");
		} else if (quantidadePessoas > 1) {
			System.out.println("Voc� est� acompanhado com um maior de idade.");
		} else {
			System.out.println("Voc� � menor de idade.");
		}
	}
}
