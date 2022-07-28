package Familia55;

public class Classe_Mater_Patinete {
/*	5) Crie uma classe patinete e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto patinete, defina as 
	instancias deste objeto e apresente as informações deste objeto no console. */
	
	int velocidade;
	
	public void andar()
	{
		if (velocidade <= 0)
		{
			System.out.println("Parado...");
		}
		if (velocidade == 1)
		{
			System.out.println("Andando...");
		}
		if (velocidade > 2)
		{
			System.out.println("Rapido demais! Você caiu...");
		}
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
}
