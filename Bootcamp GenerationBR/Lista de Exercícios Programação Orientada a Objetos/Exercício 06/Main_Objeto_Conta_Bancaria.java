package Familia55;

public class Main_Objeto_Conta_Bancaria {

	public static void main(String[] args) {
	
		Classe_Master_Conta_Bancaria ContaCorrente = new Classe_Master_Conta_Bancaria();
		
		ContaCorrente.setNumeroContaCorrente(true);
		ContaCorrente.setSenha(true);
		ContaCorrente.loginBanco();
		
		ContaCorrente.setSobrarSalario(true);
		ContaCorrente.transacao();

	}

}
