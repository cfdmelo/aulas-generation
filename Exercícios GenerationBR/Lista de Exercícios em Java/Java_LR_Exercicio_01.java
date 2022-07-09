package Familia55;

import java.util.Scanner;

public class Java_LR_Exercicio_01 
{
	public static void main(String[] args)
	{
	// 1- Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5
		
		Scanner ler = new Scanner(System.in);
		int num;
		
		for (num=1000;  num<= 1999; num++)
		{
			if (num % 11 == 5)
			{
			System.out.println(num);
			}
		}
	}
}
