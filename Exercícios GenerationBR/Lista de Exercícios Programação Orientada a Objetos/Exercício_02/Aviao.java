package POO;

public class Aviao {

//  2. Crie uma classe avião e apresente os atributos e métodos referentes
//	esta classe, em seguida crie um objeto avião, defina as instancias deste
//	objeto e apresente as informações deste objeto no console.
	
// Atributos:
	String nome;
	double peso;
	int capacidade;
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	int velocidade;
	boolean turbina;
	
// Método
	
	public void decolar()
	{
		if (turbina == true && velocidade > 200)
		{
			System.out.println("Avião pronto para decolar");
		}
		else
			System.out.println("Avião não está pronto para decolar");
	}
			
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public boolean isTurbina() {
		return turbina;
	}
	public void setTurbina(boolean turbina) {
		this.turbina = turbina;
	}	
}
