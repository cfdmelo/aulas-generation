package Familia55;

import java.util.Scanner;

public class Java_LR_Exercicio_04 
{
	public static void main(String[] args)
	{
// 	  4- Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
//	  Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
//	  (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um 
//	  sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
	
	  Scanner ler = new Scanner (System.in);
		
	  int i=0, a, b, c, count1 =0, count2 =0, count3=0, count4=0, count5=0, count6=0;
	
	  while (i <= 159)
	  {
		i = i + 1;
		System.out.println("Digite a seu sexo: [1] Feminino [2] Masculino");
		a = ler.nextInt();
		System.out.println("Digite a sua idade:");
		b = ler.nextInt();
		System.out.println("Você é:\n[1] Calmo(a); \n[2]- Nervoso(a); \n[3] Agressivo(a);");
		c = ler.nextInt();	
		
		if (a == 1 && c == 1)
		{
		count1 += 1;
		}
			if (a == 2 && c == 1)
			{
				count2 += 1;
			}
				if (a == 1 && c == 2)
				{
					count3 += 1;
				}
					if (a == 2 && c == 3)
					{
					count4 += 1;
					}
						if (b >= 40 && c == 2)
						{
							count5 += 1;
						}
							if (b <= 18 && c == 1)
							{
								count6 += 1;
							}
	  }
	  System.out.println("O número de mulheres calmas é igual a: " + count1);
	  System.out.println("O número de homens calmos é igual a: " + count2);
	  System.out.println("O número de mulheres nervosas é igual a: " + count3);
	  System.out.println("O número de homens agressivos é igual a: " + count4);
	  System.out.println("O número de pessoas nervosas com mais de 40 anos é igual a: " + count5);
	  System.out.println("O número de pessoas calmas com menos de 18 anos é igual a: " + count6);
	}
}



