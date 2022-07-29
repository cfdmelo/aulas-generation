package Familia55;

import java.util.Scanner;

public class Java_Vetores_Exercicio_01 
{
	public static void main(String[] args) 
	{
// 		1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma 
//		atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
		
		int pontuacao[] = new int [5];
		
		Scanner ler = new Scanner (System.in);
		
		for (int x = 0; x < 5; x ++)
		{
			System.out.println("Digite os 5 valores de pontuação das atividades:");
			pontuacao[x] = ler.nextInt();
		}
		
		System.out.println("As notas foram as seguintes: ");
		
		for (int x =0; x < 5; x ++)
		{
			System.out.print(pontuacao[x] + "\t");
		}
	}
}
