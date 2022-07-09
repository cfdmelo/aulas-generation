package Familia55;

import java.util.Scanner;

public class Java_LR_Exercicio_03 {

	public static void main(String[] args)
	{
// 		3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
//		Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		
		Scanner ler = new Scanner (System.in);
		int idade=0, count=0, count1=0;
				
		while (idade != -99)
		{
			System.out.println("Digite a sua idade: ");
			idade = ler.nextInt();
			
			if (idade >=0 && idade <= 21)
			{
			count +=1;
			}
			if (idade >= 50)
			{
			count1 +=1;
			}
		}
		System.out.printf("Total de pessoas com idade menor igual a 21 foi de:" + "\n" + count + "\n");
		System.out.printf("Total de pessoas com idade maior igual a 50 foi de:" + "\n" + count1 + "\n");
	}
}
