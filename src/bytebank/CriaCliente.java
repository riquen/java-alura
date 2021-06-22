package bytebank;

public class CriaCliente {
	public static void main(String[] args) {
		Cliente henrique = new Cliente();
		henrique.setNome("Henrique A Nunes");
		henrique.setCpf("012.345.678-90");
		henrique.setProfissao("Programador");;
		
		Conta contaHenrique = new ContaCorrente(013, 123456);
		contaHenrique.deposita(100);
		contaHenrique.setTitular(henrique);
		System.out.println(contaHenrique.getTitular().getNome());
		System.out.println(contaHenrique.getSaldo());
	}
}
