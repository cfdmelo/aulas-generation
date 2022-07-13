package POO2;

public class Animal {

	private String nome;
	private int idade;

	public void som()
	{
		System.out.println("Emitindo som");
	}
	
	public String getNome() {
		return nome;
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
}
