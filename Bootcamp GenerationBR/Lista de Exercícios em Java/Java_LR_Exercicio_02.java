package Familia55;

import java.util.Scanner;

public class Java_LR_Exercicio_02 
{
	public static void main(String[] args) 
	{
	// 2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares.

		Scanner ler = new Scanner(System.in);
		int par=0, impar=0, num, resto, x;		
				
		for (num=1; num<6; num++)
		{
			System.out.println("Digite os 10 números: ");
			x = ler.nextInt();
			resto = x % 2;
			
			if (resto == 0)
			{
				par +=1;
			}
			if (resto == 1)
				impar +=1;
		}		
	System.out.println("Quantidade de números Par" + "\n" + par + "\n");
	System.out.println("Quantidade de números Impar" + "\n" + impar + "\n");
	}

}
