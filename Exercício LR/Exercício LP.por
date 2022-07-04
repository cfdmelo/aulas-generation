programa
{

	funcao inicio()
	{	
// 		1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de 
//		filhos. A prefeitura deseja saber:a) média do salário da população; b) média do número de filhos; c) maior salário; 
//		d) percentual de pessoas com salário até R$100,00.

		cadeia Pessoa
		real Salario
		inteiro x=1, Filho, MaiorSalario = 0, MediaSalario, SomaFilho=0, MediaFilho, y=0, Percentual, SomaSalario=0

		para (x=1; x <= 4; x++)
		{
		escreva ("\nQual o seu salário? ")
		leia (Salario)
		escreva ("Quantos filho você tem? ")
		leia (Filho)

		se (1 > 0)
		SomaSalario = Salario + SomaSalario
		SomaSalario = SomaSalario
		
		se (1> 0)
		SomaFilho = Filho + SomaFilho
		SomaFilho = SomaFilho
		
		se (Salario >= MaiorSalario)
		MaiorSalario = Salario

		se (Salario <= 100)
		y = 1 + y
		}
					
		MediaSalario = (SomaSalario) / 4
		escreva ("\nA média do salário da população é: ", MediaSalario)
		
		MediaFilho = SomaFilho / 4
		escreva ("\nA média da quantidade de filhos é: ", MediaFilho)

		escreva ("\nO maior salário é: ", MaiorSalario)

		Percentual = y * 100 / 4
		escreva ("\nO percentual de pessoas com salário até 100 reais é de:", Percentual,"%")

//		2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  (imprimindo o novo valor) até
//		que ele seja maior do que 100. Ex.: se o usuário digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.
		inteiro soma=0, b = 1

		para (b; b<= 500; b++)
		{
			se (b % 2 == 1 e b % 3 == 0)
			{
			soma = b + soma
			escreva (b, "\n")
			}
		}
		escreva ("A soma total dos números impares e multiplos de 3 é :", soma)

// 		2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são múltiplos de três e que se encontram no conjunto 
//   	 dos números de 1 até 500.//

		inteiro numero, soma = 0

		para (numero=1; numero<= 500; numero++)
		{
				se (numero%2==1 e numero%3==0)
				{
				soma = soma + numero
				escreva ("\nOs números impares e multiplos de 3 são:", numero)
				}
				
		}
		escreva ("\nA soma total dos números impares e multiplos de 3 é: ", soma)

//		3 -Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, a média e
//		o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
//		positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.

		inteiro x, soma, somatotal = 0, contador, media = 0, numeros = 0

		escreva ("Digite a sequência de números (quando quiser parar, digite um número negativo) :\n")
		leia(x)
		somatotal = x
		contador = 1
		
		enquanto (x >= 0) 
		{
			leia(x)
			contador = contador + 1
			se (x < 0)
			{
			escreva ("Programa interrompido\n")
			escreva ("A Soma dos números escolhidos é de :", somatotal, "\n")
			escreva ("A média dos valores escolhidos é de:", media, "\n")
			escreva ("Os números escolhidos foram: ", contador -1, "\n")
			}
			
		soma = x + somatotal
		somatotal = soma

		media = somatotal / contador

//		2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  (imprimindo o novo valor) 
//		até que ele seja maior do que 100. Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte sequência: 5 15 45 
//		135.
		inteiro num, multiplica = 0, contador, i

		escreva ("Usuário, digite um número: \n")
		leia (num)
				
		enquanto (num <= 100)
		{
			multiplica = num * 3
			num = multiplica
			escreva (multiplica, "\n")
		
			se (num > 100 ou num < 0)
			{
			escreva ("Por favor, digite números entre 0 e 100. Obrigada!\n")
			}
		}
//		3. Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de 3 em 3 quando estiver entre 300 e 400
//		   e de 5 em 5 quando não estiver
		
		inteiro a = 233 
		
		faca
		{
			se (a >= 300 e a <= 400)
			{
			a +=3
			}
			senao
			a +=5
			escreva (a, "\n")
		}				
		enquanto (a <= 456)
				
		}
//		6 - Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele. Ex.: o usuário 
//		entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.

		inteiro x, i = 1,soma=0

		escreva ("Digite um número do teclado para somar do 1 até ele: \n")
		leia(x)

		limpa()

		faca
		{
			para (x; x>= 1; x--)
			{
				soma = x + soma
				soma = soma
			}
		}
		enquanto (x == 1)
		escreva (soma)
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1898; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */