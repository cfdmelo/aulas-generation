package Familia55;

public class Classe_Master_Conta_Bancaria {

/*	6) Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto conta bancaria,
	 defina as instancias deste objeto e apresente as informações deste objeto no console. */
	 
	boolean numeroContaCorrente;
	boolean senha;
	boolean sobrarSalario;
	
	public void loginBanco()
	{
		System.out.println("Conta Corrente: " + numeroContaCorrente);
		System.out.println("Senha: " + senha);
	}
	
	public void transacao()
	{
		if (sobrarSalario == true)
			System.out.println("Guardando na poupança...");
		else
			System.out.println("Saldo atual: 0");
	}

	public void setNumeroContaCorrente(boolean numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}

	public void setSenha(boolean senha) {
		this.senha = senha;
	}

	public void setSobrarSalario(boolean sobrarSalario) {
		this.sobrarSalario = sobrarSalario;
	}
	
}
