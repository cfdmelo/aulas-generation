programa
{
	
	funcao inicio()
	{
// 	1.Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
//	Encontre após a maior pontuação e a apresente. 

	inteiro pontuacao[5], x, MaiorPontuacao=0

		para (x=0; x<5; x++)
		{
			escreva ("Digite os 5 valores de pontuação da atividade: \n" ,x+1, ") ")
			leia(pontuacao[x])
		//
			se (pontuacao[x]>MaiorPontuacao)
			{
				MaiorPontuacao = pontuacao[x]
			}
		}
		escreva ("A maior pontuação foi de: ", MaiorPontuacao," \n")

		escreva ("============= Próximo Exercício ==================")
		
//	2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, 
//	escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas
//	foram as ocorrências da maior pontuação.
	inteiro dado[10], lancamentos, y, soma=0, MaiorPont=0

		para (y = 0; y<10; y++)
		{
		escreva ("Digite os valores de 10 lançamentos do dado: \n", x+1, ") ")
		leia(dado[x])
		
			se (dado [y] >= 1 ou dado[y] <= 6 )
			{
			soma += dado[x]
			}
			se (dado[y]<=0 ou dado[y] > 6)
			{
			escreva ("Desculpe, cada lançamentos devem ser de 1 a 6\n")
			}
		     se (dado[y] == 6)
			{
			MaiorPont += dado[y]
			}
          escreva ("A média aritmetrica dos lançamentos foi de:", soma / y, "\n")
		escreva ("A maior pontuação é de:", MaiorPont, "\n")
		}
		escreva ("============= Próximo Exercício ==================")

//	3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria: a) Uma matriz M1 cujos elementos serão as somas dos 
//	elementos de mesma posição das matrizes N1 e N2; b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
//	posição das matrizes N1 e N2.

	inteiro n1[4][6], n2[4][6], M1[4][6], M2[4][6], linha=0, coluna=0, som = 0, subtracao =0

		para (linha=0; linha<4; linha++)
		{
			para (coluna=0; coluna<6 ;coluna++)
			{
			escreva ("Digite os números da linha - MATRIZ 1: \n", "linha ", "\n")
			leia (n1[linha][coluna])
			escreva ("Digite os números da linha - MATRIZ 2: \n", "linha ", "\n")
			leia (n2[linha][coluna])
			som = n1[linha][coluna] + n2[linha][coluna]
			M1[linha][coluna] = som
			}
		
		}
			para (linha=0; linha<4; linha++)
			{
				para (coluna=0; coluna<6 ;coluna++)
				{
				escreva ("Digite os números da linha - MATRIZ 1: \n", "linha ", "\n")
				leia (n1[linha][coluna])
				escreva ("Digite os números da linha - MATRIZ 2: \n", "linha ", "\n")
				leia (n2[linha][coluna])
				subtracao = n1[linha][coluna] - n2[linha][coluna]
				M2[linha][coluna] = subtracao 
				}
			}
			escreva ("============= Próximo Exercício ==================")
//	4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores 
//	dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.

//	3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria: a) Uma matriz M1 cujos elementos serão as somas dos 
//	elementos de mesma posição das matrizes N1 e N2; b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
//	posição das matrizes N1 e N2.

	inteiro matriz[3][3], z, lin=0, colun=0, somar=0, SomaDiagonal[3][3]

		para (lin=0; lin<=2 ;lin++) 
		{
			para (colun=0; colun<=2 ;colun++)
			{
				escreva ("Digite os valores da matriz 3x3: \n")
				leia(matriz[lin][colun])
				somar += matriz[lin][colun]
				somar = somar
				SomaDiagonal[lin][colun] = matriz[0][0] + matriz[1][1] + matriz [2][2]
			}
		}
		escreva ("A soma de todos os dados da matriz 3x3 é de: ", somar, "\n")
		escreva ("A soma da diagonal da matriz é igual a: ", SomaDiagonal[2][2])
		escreva ("============= Fim Exercício ==================")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3756; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pontuacao, 9, 9, 9}-{x, 9, 23, 1}-{MaiorPontuacao, 9, 26, 14};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */