package Familia55;

import java.util.Scanner;

public class Java_Vetores_Exercicio_02 
{
	public static void main(String[] args) 
	{
// 		2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que 
//		gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e imprima a 
//		média aritmética dos lançamentos, contabilize e apresente também quantas foram as 
//		ocorrências da maior pontuação.
		
		int dado[] = new int [10], soma=0, quantidade=0; 
		int maiorPontuacao = 0;
		double media;
		
		Scanner ler = new Scanner (System.in);
		
		for (int lancamento = 0; lancamento < 10; lancamento++)
		{
			System.out.println("Lance o dado:");
			dado[lancamento] = ler.nextInt();
			
			if (dado[lancamento] < 1 || dado[lancamento] > 6)
			{
				System.out.println("O valor para o dado é inválido!");
			}
			if (dado[lancamento] > 1 && dado[lancamento] < 6)
			{
			soma += dado[lancamento];
			quantidade += 1;
			}
			if (dado[lancamento] == 6)
			{
				maiorPontuacao +=1;
			}
		}
		
		System.out.println("Os números lançados foram:");
		
		for (int lancamento = 0; lancamento < 10; lancamento++)
		{
			if (dado[lancamento] >= 1 && dado[lancamento] <= 6)
			{
			System.out.print(dado[lancamento] + "\t");
			}
		}
		
		System.out.println();
		
		media = soma / quantidade;
		
		System.out.println("A média dos lançamentos é igual a: " + "\n" + media);
		System.out.println("A ocorrência de maior pontuacao [6] foi igual a: " + maiorPontuacao);
	}
}
