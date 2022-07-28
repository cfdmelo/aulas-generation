package Familia55;

public class Main_Objeto_Funcionario {
	public static void main(String[] args) {
	
	Classe_Master_Funcionario Jonathan = new Classe_Master_Funcionario();
	
	Jonathan.setNome("Jonathan Augusto Severiano");
	Jonathan.setCPF("123.123.123-12");
	Jonathan.setIdade(25);
	Jonathan.setCargo("Consutlor de vendas");
	Jonathan.setSalario(2000);
	Jonathan.DadosFuncionario();
	
	Jonathan.setMeta(true);
	Jonathan.AumentoSalario();
	}
}
