programa
{
	
	funcao inicio()
	{	
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
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 754; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */