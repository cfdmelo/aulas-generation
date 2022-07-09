package Familia55;

import java.util.Scanner;

public class Java_LD_Exercicio_01 
{
	public static void main(String[] args)
	{
// 		1- Faça um programa que receba três inteiros e diga qual deles é o maior. //
		
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("[1] Digite o primeiro valor inteiro:");
		a = ler.nextInt();
		System.out.println("[2] Digite o segundo valor inteiro:");
		b = ler.nextInt();
		System.out.println("[3] Digite o terceiro valor inteiro:");
		c = ler.nextInt();
		
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
