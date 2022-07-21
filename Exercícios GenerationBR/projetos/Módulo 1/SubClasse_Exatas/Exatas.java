package SubClasse_Exatas;

import java.util.Scanner;

import SuperClasse_FichaInscricao.fichainscricao;
import SuperClasse_Inscricao2.inscricao2;

public class Exatas extends fichainscricao implements inscricao2 {
	Scanner ler = new Scanner(System.in);

	public Exatas(String nomeCompleto, String CPF) {
		super(nomeCompleto, CPF);
	}

	@Override
	public void area() {
		System.out.println("Escolha qual curso da área de exatas deseja concorrer: ");
		System.out.println("[1] Engenharia" + "\t" + "[2] Ciência da Computação " + "\n[3] Arquitetura" + "\t"
				+ "[4] Matemática ");
		int numero = ler.nextInt();
		switch (numero) {
		case 1:
			String curso = "Engenharia";
			this.setCurso(curso);
			break;
		case 2:
			String curso1 = "Ciência da Computação";
			this.setCurso(curso1);
			break;
		case 3:
			String curso2 = "Arquitetura";
			this.setCurso(curso2);
		case 4:
			String curso3 = "Matemática";
			this.setCurso(curso3);
		default:
			System.out.println("Número inválido");

		}
	}
}
