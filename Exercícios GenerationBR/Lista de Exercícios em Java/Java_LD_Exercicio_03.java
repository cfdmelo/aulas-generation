package Familia55;

import java.util.Scanner;

public class Java_LD_Exercicio_03 
{			
	public static void main(String[] args)
	{
// 		3 - Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria 
//		ela se encontra: •	10-14 infantil •	15-17 juvenil •	18-25 adulto
		
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("[1] - Digite a sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <=14)
		{
			System.out.println("Ifantil");
		}
			else if (idade >= 15 && idade <=17)
			{
				System.out.println("Juvenil");
			}
				else if (idade >= 18 && idade <= 25)
				{
					System.out.println("Adulto");
				}
					else
						System.out.println("Não há informações");
	}
}