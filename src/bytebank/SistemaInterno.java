package bytebank;

public class SistemaInterno {
	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Logado.");
		} else {
			System.out.println("N�o logado.");
		}
	}
}