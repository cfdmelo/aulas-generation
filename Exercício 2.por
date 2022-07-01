programa
{
	
	funcao inicio()
	{
// 2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são múltiplos de três e que se encontram no conjunto 
//    dos números de 1 até 500.//

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
 * @POSICAO-CURSOR = 200; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */