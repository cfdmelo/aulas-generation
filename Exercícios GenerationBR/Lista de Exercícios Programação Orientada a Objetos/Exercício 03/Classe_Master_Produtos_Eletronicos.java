package Familia55;

public class Classe_Master_Produtos_Eletronicos {
/* 3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto produto eletrônico,
   defina as instancias deste objeto e apresente as informações deste objeto no console. */

	private boolean ligar;
	private String bip;
	private boolean aceso;

	public void ligarPC() {
		System.out.println("Deseja ligar o computador?");
		System.out.println(ligar);
		if (ligar == true) {
			System.out.println("Ligando..." + bip);
		}
		if (ligar == true && aceso == true) {
			System.out.println("O computador está ligado!");
		} else
			System.out.println("O computador está desligado.");
	}

	public void setLigar(boolean ligar) {
		this.ligar = ligar;
	}

	public void setBip(String bip) {
		this.bip = bip;
	}

	public void setAceso(boolean aceso) {
		this.aceso = aceso;
	}

}
