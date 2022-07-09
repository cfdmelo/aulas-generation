package Familia55;

import java.util.Scanner;

public class Java_LR_Exercicio_06 
{
	public static void main(String[] args) 
	{
// 	  	6- Escrever um programa que receba vários números inteiros no teclado. E no final imprimir 
// 	    a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)

		Scanner ler = new Scanner (System.in);
		int num, soma=0, count=0;
				
		do
		{
		System.out.println("Digite os números:");
		num = ler.nextInt();
		
			if (num !=0 & num % 3 == 0)
			{
				count += 1;
				soma += num;
			}
		}
		while (num != 0);
		{
			System.out.println("Digite os números: PARE");
			System.out.println("A media dos multiplos de 3 igual a: " + soma/count);
		}
	}
}

