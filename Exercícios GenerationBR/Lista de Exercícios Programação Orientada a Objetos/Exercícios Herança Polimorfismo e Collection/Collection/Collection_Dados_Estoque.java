package Familia55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Collection_Dados_Estoque {

	public static void main(String[] args) {

		Collection<String> estoque = new ArrayList();
		Scanner ler = new Scanner(System.in);

		estoque.add("Blusa");
		estoque.add("Calça");
		estoque.add("Sandália");
		estoque.add("Casaco");
		estoque.add("Tênis");

		System.out.println("[1] Lista de produtos em estoque" + "\t[2] Armazenar produtos do estoque"
				+ "\n[3] Remover produtos do estoque" + "\t\t[4] Atualizar produtos do estoque"
				+ "\n[5] Sair do sistema");
		int op = ler.nextInt();

		switch (op) {
		case 1:
			System.out.println("Confira nossa lista:" + estoque);
			System.out.println("Qual produto você está procurando? ");
			String produto = ler.next();
			estoque.contains(produto);
			System.out.println(estoque.contains(produto));
			if (estoque.contains(produto) == true)
				System.out.println("Sim, o produto" + produto
						+ "contém na nossa lista. Confira nossa lista de produtos em estoque" + estoque);
			else
				System.out.println("Desculpe, infelizmente este produto não está em estoque.");

		case 2:
			System.out.println("Digite o produto que deseja armazenar:");
			String armazenar = ler.next();
			estoque.add(armazenar);
			System.out.println("Produto armazenado com sucesso! verifique nosso estoque: \n" + estoque);

		case 3:
			System.out.println("Aqui está a lista de estoque: " + estoque);
			System.out.println("Digite: \n[1] Remover um conteúdo \t\t[2] Remover todo estoque");
			int numero = ler.nextInt();
			if (numero == 1) {
				System.out.println("Qual item você deseja remover?");
				String remover = ler.next();
				estoque.remove(remover);

			}
			if (numero == 2)
				estoque.clear();
			System.out.println(estoque);

		case 4:
			System.out.println("Confira os produtos em estoque: " + estoque);
			System.out.println("Qual produto você deseja atualizar a lista: ");
			String atualizar = ler.next();
			estoque.remove(atualizar);
			System.out.println("Você retirou " + atualizar + " deseja acrescentar qual no lugar?");
			String atualizado = ler.next();
			Collection<String> estoque2 = Arrays.asList(atualizado);
			estoque.add(atualizado);
			System.out.println(estoque);

		case 5:
			System.out.println("Saindo do sistema");
		}
	}
}