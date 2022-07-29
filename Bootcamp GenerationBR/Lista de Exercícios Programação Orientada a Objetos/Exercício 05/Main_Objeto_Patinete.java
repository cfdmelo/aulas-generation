package Familia55;

public class Main_Objeto_Patinete {

	public static void main(String[] args) {
		
		Classe_Mater_Patinete Patinete = new Classe_Mater_Patinete();
		
		Patinete.setVelocidade(0);
		Patinete.andar();
		Patinete.setVelocidade(1);
		Patinete.andar();
		Patinete.setVelocidade(3);
		Patinete.andar();
	}
}
