package inicio;

public class Condicional2 {
	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 3;

		if (idade > 17 || quantidadePessoas > 1) {
			System.out.println("Pode entrar.");
		} else {
			System.out.println("Não pode entrar.");
		}

		if (idade > 17 && quantidadePessoas > 1) {
			System.out.println("Pode entrar.");
		} else {
			System.out.println("Não pode entrar.");
		}

		boolean acompanhado = quantidadePessoas > 1;

		if (idade > 17 || acompanhado) {
			System.out.println("Pode entrar.");
		} else {
			System.out.println("Não pode entrar.");
		}

		if (idade > 17 && acompanhado) {
			System.out.println("Pode entrar.");
		} else {
			System.out.println("Não pode entrar.");
		}
	}
}
