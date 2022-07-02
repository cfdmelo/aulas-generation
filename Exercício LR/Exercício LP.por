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
		
		inteiro numero
		
		escreva ("\nDigite um número: ")
		leia (numero)
		escreva ("\n",numero)

		enquanto (numero <= 100)
		{
			numero = numero * 3
			escreva ("\n", numero)
		}

// 		2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são múltiplos de três e que se encontram no conjunto 
//   	 dos números de 1 até 500.//

		inteiro numero, soma =0

		para (numero=1; numero<= 500; numero++)
		{
				se (numero%2==1 e numero%3==0)
				{
				soma = soma + numero
				escreva ("\nOs números impares e multiplos de 3 são:", numero)
				}
				
		}
		escreva ("\nA soma total dos números impares e multiplos de 3 é: ", soma)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1492; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */