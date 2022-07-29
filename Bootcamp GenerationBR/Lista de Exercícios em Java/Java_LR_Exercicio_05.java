package Familia55;

import java.util.Scanner;

public class Java_LR_Exercicio_05 {

	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		
// 	5 -	Crie um programa que leia um número do teclado até que encontre um número igual a zero.
//		No final, mostre a soma dos números digitados.(DO...WHILE)
		
	int soma=0, num;
	
	do 
		{
		System.out.println("Digite um número");
		num = ler.nextInt();
		soma += num;
		}
		while (num != 0);
		System.out.println("Fim da execução!");
		System.out.println("A soma dos números listados foi de: " + soma);
	}
	
}
