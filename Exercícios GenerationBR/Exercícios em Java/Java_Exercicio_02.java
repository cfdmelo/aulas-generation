package Familia55;

import java.util.Scanner;

public class Java_Exercicio_02 {
			
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);

// 2-	Faça um programa que entre com três números e coloque em ordem crescente. //
		
		int a, b, c;
		
		System.out.println("Digite o primeiro valor inteiro: ");
		a = leia.nextInt();
		System.out.println("Digite o segundo valor inteiro: ");
		b = leia.nextInt();
		System.out.println("Digite o terceiro valor inteiro: ");
		c = leia.nextInt();
		
		if (a < b && a < c && b < c)
		{
			System.out.println("A ordem crescente dos números é:" + a + b + c);
		}
		else if (a < b && a < c && c < b)
		{
			System.out.println("A ordem crescente dos números é:" + a + c + b);
		}
		else if (b < a && b < c && a < c)
		{
			System.out.println("A ordem crescente dos números é:" + b + a + c);
		}
		else if (b < a && b < c && c < a)
		{
			System.out.println("A ordem crescente dos números é:" + b + c + a);
		}
		else if (c < a && c < b && a < b)
		{
			System.out.println("A ordem crescente dos números é:" + c + a + b);
		}
		else
			System.out.println("A ordem crescente dos números é:" + c + b + a);
		}
}