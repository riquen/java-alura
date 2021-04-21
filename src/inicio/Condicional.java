package inicio;

public class Condicional {
	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade > 17) {
			System.out.println("Você é maior de idade.");
		} else if (quantidadePessoas > 1) {
			System.out.println("Você está acompanhado com um maior de idade.");
		} else {
			System.out.println("Você é menor de idade.");
		}
	}
}
