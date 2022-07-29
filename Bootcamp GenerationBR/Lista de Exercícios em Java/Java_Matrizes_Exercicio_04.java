package Familia55;

import java.util.Scanner;

public class Java_Matrizes_Exercicio_04
{
	public static void main(String[] args) 
	{
//  4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e 
//	em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
//	ou seja, diagonal principal.
	
	Scanner ler = new Scanner (System.in);
	int soma=0;
	int M[][] = new int [3][3];
	int	primeiraDiagonal[][] = new int [3][3];
	
	for (int x=0; x<3; x++)
	{
		for (int y=0; y<3; y++)
		{
		System.out.println("Digite os valores da matriz 3x3: ");
		M[x][y] = ler.nextInt();
		soma += M[x][y];
		primeiraDiagonal[x][y] = M[0][0] + M[1][1] + M[2][2];
		}
	}
	System.out.println();
	
	System.out.print("Os dados da matriz: \n");
	for (int x = 0; x <3; x++)
	{
		for (int y = 0; y <3; y++)
		{
		System.out.print(M[x][y] + "\t");
		}
		System.out.println();
	}
	System.out.println();
	
	System.out.print("A soma da matriz é igual a: \n");
	for (int x = 0; x <3; x++)
	{
		for (int y = 0; y <3; y++)
		{
		System.out.print(soma + "\t");
		}
		System.out.println();
	}
	System.out.print("A soma da diagonal é igual a: \n");
	for (int x = 0; x < 3; x++)
	{
		for (int y = 0; y < 3; y++)
		{
			System.out.print (primeiraDiagonal[x][y] + "\t");
		}
		System.out.println();
	}
  }
}
