package bytebank;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario henrique = new Gerente();
		henrique.setNome("Henrique Arantes");
		henrique.setCpf("01234567899");
		henrique.setSalario(2590.75);
		
		System.out.println(henrique.getNome());
		System.out.println(henrique.getCpf());
		System.out.println(henrique.getBonificacao());
	}
}
