package Familia55;

public class Classe_Master_Paciente {

/*	7) Crie uma classe paciente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto paciente, defina as 
	instancias deste objeto e apresente as informações deste objeto no console. */
	
	String nomePaciente;
	String sintomas;
	boolean testeCOVID;
	
	public void atendimento()
	{
		System.out.println("Atendimento");
		System.out.println("Nome do Paciente: " + nomePaciente);
		System.out.println("Sintomas: " + sintomas);
	}
	
	public void teste()
	{
		if (testeCOVID == true)
			System.out.println("O paciente testou positivo para COVID");
		else
			System.out.println("O paciente testou negativo para COVID");
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public void setTesteCOVID(boolean testeCOVID) {
		this.testeCOVID = testeCOVID;
	}
	
}
