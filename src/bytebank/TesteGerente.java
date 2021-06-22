package bytebank;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Viviane");
		g1.setCpf("98765432100");
		g1.setSalario(4000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getBonificacao());
		
		g1.setSenha(123456);
		boolean autenticou = g1.autentica(123456);
		System.out.println(autenticou);
		
	}

}
