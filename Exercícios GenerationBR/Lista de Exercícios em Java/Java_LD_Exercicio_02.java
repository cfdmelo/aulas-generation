package Familia55;

import java.util.Scanner;

public class Java_LD_Exercicio_02 
{	
	public static void main(String[] args)
	{
// 2-	Faça um programa que entre com três números e coloque em ordem crescente. //
		
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite três valores - [1º]:");
		a = ler.nextInt();
		System.out.println("Digite três valores - [2º]:");
		b = ler.nextInt();
		System.out.println("Digite três valores - [3º]:");
		c = ler.nextInt();
		
		if (a < b && a < c && b < c)
		{
			System.out.println("A ordem crescente dos números é:" + "\n" + a + "\n" + b + "\n" + c);
		}
			else if (a < b && a < c && c < b)
			{
			System.out.println("A ordem crescente dos números é:" + "\n" + a + "\n" + c + "\n" + b);
			}
				else if (b < a && b < c && a < c)
				{
					System.out.println("A ordem crescente dos números é:" + "\n" + b + "\n" + a + "\n" + c);
				}
					else if (b < a && b < c && c < a)
					{
						System.out.println("A ordem crescente dos números é:" + "\n" + b + "\n" + c + "\n" + a);
					}
						else if (c < a && c < b && a < b)
						{
							System.out.println("A ordem crescente dos números é:" + "\n" + c + "\n" + a + "\n" + b);
						}
							else
								System.out.println("A ordem crescente dos números é:" + "\n" + c + "\n" + b + "\n" + a);
	}
}