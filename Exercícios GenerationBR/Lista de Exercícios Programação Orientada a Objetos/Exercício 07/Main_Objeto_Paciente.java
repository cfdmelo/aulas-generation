package Familia55;

public class Main_Objeto_Paciente {

	public static void main(String[] args) {
		
		Classe_Master_Paciente RenatoJose = new Classe_Master_Paciente();
		
		RenatoJose.setNomePaciente("Renato José Bragança Lopes");
		RenatoJose.setSintomas("Dor de cabeça, falta de ar, cansaço e febre");
		RenatoJose.atendimento();
		
		RenatoJose.setTesteCOVID(true);
		RenatoJose.teste();
	}
}
