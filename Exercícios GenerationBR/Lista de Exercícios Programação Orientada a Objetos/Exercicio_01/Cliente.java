package POO;

public class Cliente 
{
// 1. Crie uma classe cliente e apresente os atributos e métodos referentes
// 	  esta classe, em seguida crie um objeto cliente, defina as instancias deste
//    objeto e apresente as informações deste objeto no console.
	
// Atributos:	
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private boolean exames;

// Métodos
	
	public void exame() 
	{
		if (this.exames == true)
		{
			System.out.println("Parabéns! você pode começar a academia");
		}
		else
			System.out.println("Desculpe, mas você precisa do exame cardiológico para começar a academia.");
	}
	
	
// Métodos SET / GET
	public String getNome() {
		return nome;
	}
	public boolean getExames() {
		return exames;
	}


	public void setExames(boolean exames) {
		this.exames = exames;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double d) {
		this.altura = d;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}