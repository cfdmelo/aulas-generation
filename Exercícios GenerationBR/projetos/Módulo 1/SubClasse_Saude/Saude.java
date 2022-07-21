package SubClasse_Saude;

import java.util.Scanner;

import SuperClasse_FichaInscricao.fichainscricao;
import SuperClasse_Inscricao2.inscricao2;

public class Saude extends fichainscricao implements inscricao2{
	Scanner ler = new Scanner(System.in);

	public Saude(String nomeCompleto, String CPF) {
		super(nomeCompleto, CPF);
	}

	@Override
	public void area() {
		System.out.println("Escolha qual curso da área de saúde deseja concorrer: ");
		System.out.println("[1] Biológicas" + "\t" + "[2] Odontologia " + "\n[3] Medicina" + "\t" + "[4] Farmácia ");
		int numero = ler.nextInt();
		switch (numero) {
		case 1:
			String curso = "Ciências Biológicas";
			this.setCurso(curso);
			break;
		case 2:
			String curso1 = "Odontologia";
			this.setCurso(curso1);
			break;
		case 3:
			String curso2 = "Medicina";
			this.setCurso(curso2);
		case 4:
			String curso3 = "Farmacia";
			this.setCurso(curso3);
		default:
			System.out.println("Número inválido");
		}
	}
}
