package bytebank;

public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente(13, 1313);
		cc1.deposita(100.0);
		
		ContaPoupanca cp1 = new ContaPoupanca(10, 1010);
		cp1.deposita(200.0);
		
		cc1.transfere(50.0, cc1, cp1);
		
		System.out.println("Saldo CC: " + cc1.getSaldo());
		System.out.println("Saldo CP: " + cp1.getSaldo());
	}

}
