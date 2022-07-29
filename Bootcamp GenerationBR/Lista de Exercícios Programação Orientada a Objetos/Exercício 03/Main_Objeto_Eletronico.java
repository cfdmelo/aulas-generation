package Familia55;

public class Main_Objeto_Eletronico {
	public static void main(String[] args) {

		Classe_Master_Produtos_Eletronicos computador = new Classe_Master_Produtos_Eletronicos();

		computador.setLigar(true);
		computador.setBip("Plimm... Plim...");
		computador.setAceso(true);
		computador.ligarPC();

	}
}
