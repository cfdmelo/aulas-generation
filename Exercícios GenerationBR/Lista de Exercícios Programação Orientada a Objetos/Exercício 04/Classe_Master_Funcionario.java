package Familia55;

public class Classe_Master_Funcionario {

/*	4) Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no console. */

	String nome;
	int idade;
	String cargo;
	String CPF;
	boolean meta;
	int salario;
	
	public void DadosFuncionario()
	{
		System.out.println("\t***** FICHA DO FUNCIONÁRIO *****");
		System.out.println("\tNome: " + nome);
		System.out.println("\tCPF: " + CPF);
		System.out.println("\tIdade: " + idade);
		System.out.println("\tSalário: " + salario + "\n");
	}
	
	
	public void AumentoSalario()
	{
		System.out.println("O funcionário bateu a meta anual?");
		if (meta == true)
		System.out.println("Parabéns! Você recebeu um aumento no salário. Agora seu salário é de:" + (salario + 500));
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public void setMeta(boolean meta) {
		this.meta = meta;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
}
