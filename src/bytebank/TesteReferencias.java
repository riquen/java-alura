package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Henrique");
		g1.setSalario(6000.0);
		String nome = g1.getNome();
		System.out.println(nome);
		
		EditorVideo ev1 = new EditorVideo();
		ev1.setSalario(2500.0);
		
		Designer d1 = new Designer();
		d1.setSalario(2800.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev1);
		controle.registra(d1);
		
		System.out.println(controle.getSoma());
	}

}
