package SubClasse_Humanas;

import java.util.Scanner;

import SuperClasse_FichaInscricao.fichainscricao;
import SuperClasse_Inscricao2.inscricao2;

public class Humanas extends fichainscricao implements inscricao2 {
	Scanner ler = new Scanner(System.in);

	public Humanas(String nomeCompleto, String CPF) {
		super(nomeCompleto, CPF);
	}

	@Override
	public void area() {
		System.out.println("Escolha qual curso da área de humanas deseja concorrer: ");
		System.out.println("[1] História" + "\t" + "[2] Artes " + "\n[3] Letras" + "\t" + "[4] Direito ");
		int numero = ler.nextInt();
		switch (numero) {
		case 1:
			String curso = "História";
			this.setCurso(curso);
			break;
		case 2:
			String curso1 = "Artes";
			this.setCurso(curso1);
			break;
		case 3:
			String curso2 = "Letras";
			this.setCurso(curso2);
		case 4:
			String curso3 = "Direito";
			this.setCurso(curso3);
		default:
			System.out.println("Número inválido");
		}
	}
}
