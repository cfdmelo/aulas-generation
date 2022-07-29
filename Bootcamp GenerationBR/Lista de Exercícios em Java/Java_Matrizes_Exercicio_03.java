package Familia55;

import java.util.Scanner;

public class Java_Matrizes_Exercicio_03 
{
	public static void main(String[] args)
	{
	
// 	3.	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	
//	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das 
//	matrizes N1 e N2;	
	
//	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição
//	das matrizes N1 e N2.
	
	Scanner ler = new Scanner (System.in);
	
	int N1[][] = new int [4][6];
	int N2[][] = new int [4][6];
	int M1[][] = new int [4][6];
	int M2[][] = new int [4][6];
	int soma = 0;
	
	for (int x = 0; x<4; x++)
	{
		for (int y= 0; y<6; y++)
		{
			System.out.print("Digite os números da matriz N1 ");
			N1[x][y] = ler.nextInt();
			System.out.print("Digite os números da matriz N2 ");
			N2[x][y] = ler.nextInt();
			M1[x][y] = N1[x][y] + N2[x][y];
			M2[x][y] = N1[x][y] + N2[x][y];
		}
	}
	System.out.println();
	
	System.out.print("Primeira matriz [N1]: \n");
	
	for (int x = 0; x<4; x++)
	{
		for (int y= 0; y<6; y++)
		{
		System.out.print(N1[x][y] + "\t");
		}
		System.out.println();
	}	
	System.out.println();
	
	System.out.print("Segunda matriz [N2]: \n");
	
	for (int x = 0; x<4; x++)
	{		
		for (int y= 0; y<6; y++)
		{
		System.out.print(N2[x][y] + "\t");
		}
		System.out.println();
	}
	
	System.out.println();
	
	System.out.print("A soma das matrizes é igual a M1 = (N1 + N2)" + "\n");
	
	for (int x = 0; x<4; x++)
	{
		for (int y= 0; y<6; y++)
		{
		System.out.print(M1[x][y] + "\t");
		}
		System.out.println();
	}
	
	System.out.println();
	System.out.print("A subtração das matrizes é igual a (M2 = N1 - N2) " + "\n");
			
	for (int x = 0; x<4; x++)
	{
		for (int y= 0; y<6; y++)
		{
		System.out.print(M2[x][y] + "\t");
		}
		System.out.println();
	}
	}	
}