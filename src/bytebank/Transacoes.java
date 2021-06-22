package bytebank;

public class Transacoes {
	public static void main(String[] args) {
		Conta primeiraConta = new ContaCorrente(013, 123456);
		primeiraConta.deposita(100);
		primeiraConta.deposita(50);
		System.out.println(primeiraConta.getSaldo());
		primeiraConta.saca(20);
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new ContaCorrente(013, 654321);
		segundaConta.deposita(1000);
		System.out.println(segundaConta.getSaldo());
		segundaConta.transfere(300, segundaConta, primeiraConta);
		System.out.println(segundaConta.getSaldo());
		System.out.println(primeiraConta.getSaldo());
	}
}
