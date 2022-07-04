programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
    // 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. //
		escreva ("\n ======================================== Exercícios - 1 ===================================================")
		inteiro idadeanos, idademeses, idadedias, totaldiasidade
		escreva ("\nQuantos anos você tem? ")
		leia (idadeanos)
		escreva ("\nQuantos meses você tem? ")
		leia (idademeses)
		escreva ("\nQuantos dias você tem? ")
		leia (idadedias)

		totaldiasidade = idadeanos * 365 + idademeses * 30 + idadedias

		escreva ("\nVocê tem ", totaldiasidade, " dias.")
		
		escreva ("\n ======================================== Exercícios - 2 ===================================================")
    // 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. //
		inteiro idade_anos, idade_meses, idade_dias
		escreva ("\nQuantos anos você tem em dias? ")
		leia (idade_dias)
		idade_anos = idade_dias / 365
		idade_meses = (idade_dias % 365) / 30
		idade_dias = (idade_dias % 365) % 30

		escreva ("\nVocê tem ", idade_anos," anos",",", idade_meses, " meses ", "e ", idade_dias, " dias.")
		
		escreva ("\n ======================================== Exercícios - 3 ===================================================")
    // 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas,
    //    minutos e segundos. //
		inteiro horas, minutos, segundos
		escreva ("\nQuantos segundos durou o evento na fábrica? ")
		leia (segundos)

		horas = segundos / 3600
		minutos = segundos % 3600 / 60
		segundos = segundos % 3600 % 60

		escreva ("\nA duração do evento na fábrica foi de: ", horas, " horas, ", minutos, " minutos e ", segundos, " segundos.")

		escreva ("\n ======================================== Exercícios - 4 ===================================================")
    // 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: (D = R + S / 2) 
    //    onde : R = (A + B)²; S = (B + C)² //
		inteiro A, B, C
		real R, S, D
		escreva ("\nDigite o valor de A: ")
		leia(A)
		escreva ("\nDigite o valor de B: ")
		leia(B)
		escreva ("\nDigite o valor de C: ")
		leia(C)

		D = (mat.potencia((A + B), 2.0) + mat.potencia((B + C), 2.0)) / 2

		escreva ("\n A expressão D, equivale a:", D)

		escreva ("\n ======================================== Exercícios - 5 ===================================================")

    // 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada 
    //    e que o peso das notas é: 2,3 e 5, respectivamente //
		inteiro nota1, nota2, nota3, media
		cadeia aluno
		escreva ("\nQual o nome do(a) aluno(a)? ")
		leia (aluno)
		escreva ("\nDigite a primeira nota do(a) aluno(a) " , aluno ,": ")
		leia (nota1)
		escreva ("\nDigite a segunda nota do(a) aluno(a) ", aluno, ": ")
		leia (nota2)
		escreva ("\nDigite a terceira nota do(a) aluno(a) ", aluno, ": ")
		leia (nota3)

		media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 3

		escreva ("\nA média do(a) aluno(a) ", aluno, " foi de: ", mat.arredondar(media, 2.0))

		escreva ("\n ======================================== Exercícios - 6 ===================================================")

    // 6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
    //    escreva a distância entre eles. A fórmula d = raiz de (x2 - x1)² + (y2 - y1)² //
		real x1, x2, y1, y2, distancia_pontos
		escreva ("\nDigite o primeiro ponto no plano x1: ")
		leia (x1)
		escreva ("\nDigite o primeiro ponto no plano y1: ")
		leia (y1)
		escreva ("\nDigite o seguno ponto no plano x2: ")
		leia (x2)
		escreva ("\nDigite o segund ponto no plano y2: ")
		leia (y2)

		distancia_pontos = (mat.raiz((mat.potencia((x2-x1), 2.0) + mat.potencia((y2-y1),2.0)),2.0))
		escreva ("\nA distância entre os dois pontos é de: ", mat.arredondar(distancia_pontos, 2.0))
		
		escreva ("\n ======================================== Exercícios - 7 ===================================================")

	// 7. Um sistema de equações lineares do tipo: Ax + By = C ; Dx + Ey = f, pode ser resolvida segundo mostrado abaixo: 
	//    x = CE - BF / AE - BD ; y = AF - CD / AE - BD Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula 
	//    e mostra os valores de x e y. //
		inteiro a, b, c, d, E, f, x, y
		escreva("\nDigite o coeficiente a: ")
		leia (a)
		escreva("\nDigite o coeficiente b: ")
		leia (b)
		escreva("\nDigite o coeficiente c: ")
		leia (c)
		escreva("\nDigite o coeficiente d: ")
		leia (d)
		escreva("\nDigite o coeficiente e: ")
		leia (E)
		escreva("\nDigite o coeficiente f: ")
		leia (f)

		x = ((c*E) - (b*f)) / ((a*E) - (b*d))
		y = ((a*f) - (c*d)) / ((a*E) - (b*d))
		
		escreva("\nO valor de x é igual a:", x , " e o valor de y é igual a:", y)

		escreva ("\n ======================================== Exercícios - 8 ===================================================")

  // 8.  O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos 
  //     (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um
  //     sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. //
		real custo, consumo, custo_ao_consumidor
		escreva("\nDigite o custo de fábrica de um carro :")
		leia (custo)

		custo_ao_consumidor = (custo + (custo * 28 / 100) + (custo * 45 / 100))

		escreva ("\nO custo ao consumir um carro é de: ", custo_ao_consumidor, " reais.")

		escreva ("\n ======================================= Exercícios - Fim ===================================================")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 5435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */