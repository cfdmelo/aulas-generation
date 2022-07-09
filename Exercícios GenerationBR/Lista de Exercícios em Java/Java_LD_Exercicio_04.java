package Familia55;

import java.util.Scanner;

public class Java_LD_Exercicio_04
{
	public static void main(String[] args)
	{
// 		4 - Faça um programa em que permita a entrada de um número qualquer e exiba se este número é 
//		par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o 
//		número elevado ao quadrado;
		
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.println("[1] Entre com um número: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0)
		{
			System.out.println("Par!");
			System.out.println("Raiz quadrada:" + Math.sqrt(numero));
		}
			else
				System.out.println("Impar!");
				System.out.println("Esse número elevado ao quadrado: " + Math.pow(numero,2));
	}

}
