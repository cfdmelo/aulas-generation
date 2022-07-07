package Familia55;

import java.util.Scanner;

public class Aula {

	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner(System.in);
		
// 1-	Faça um programa que receba três inteiros e diga qual deles é o maior. //
		
		int a, b, c, maiorvalor=0;
		
		System.out.println("Digite o primeiro valor inteiro: ");
		a = leia.nextInt();
		System.out.println("Digite o segundo valor inteiro: ");
		b = leia.nextInt();
		System.out.println("Digite o terceiro valor inteiro: ");
		c = leia.nextInt();
		
		if (a > b && a > c)
		{
			System.out.println("Maior valor é:" + a);
		}
		else if (b > a && b > c)
		{
			System.out.println("Maior valor é:" + b);
		}
		else 
		{
			System.out.println("Maior valor é:" + c);
		}
	}

}
