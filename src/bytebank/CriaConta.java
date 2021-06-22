package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new ContaCorrente(013, 123456);
		primeiraConta.deposita(200);
		primeiraConta.deposita(100);
		System.out.println("A primeira conta tem R$" + primeiraConta.getSaldo());
		
		Conta segundaConta = new ContaCorrente(013, 654321);
		segundaConta.deposita(50);
		System.out.println("A segunda conta tem R$" + segundaConta.getSaldo());
	}
}
