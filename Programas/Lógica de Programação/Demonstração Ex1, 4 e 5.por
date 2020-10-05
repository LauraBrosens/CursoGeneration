programa
{
	inclua biblioteca Teclado --> t
	inclua biblioteca Util --> u	
	funcao inicio()
	{
		logico ok = verdadeiro
		ex1()
		escreva ("\nO próximo exercício começará em 10 segundos")
		u.aguarde(10000)
		limpa()
		ex4()
		escreva ("\nO próximo exercício começará em 10 segundos")
		u.aguarde(10000)
		limpa()
		ex5()
		escreva ("\nA Demonstração chegou ao fim! Obrigada")
	}

	funcao ex1(){ 
		//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
		escreva ("Exercício 1\n\n\n")
		
		inteiro anos, meses, dias
		
		escreva ("Informe quantos anos você tem: ")
		leia (anos)
		escreva ("Informe quantos meses você tem: ")
		leia (meses)
		escreva ("Informe quantos dias você tem: ")
		leia (dias)
		
		dias = anos*365 + meses*30 + dias
		escreva ("\nVocê tem " + dias + " dias de vida")

	}

	funcao ex4(){
		escreva ("Exercício 2\n\n\n")

		//Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:

		inteiro A, B, C

		escreva ("Insira o valor de A: ")
		leia (A)
		escreva ("Insira o valor de B: ")
		leia (B)
		escreva ("Insira o valor de C: ")
		leia (C)

		escreva ("D = ", ((A+B)*(A+B) + (B+C)*(B+C))/2)
				
	}

	funcao ex5(){
		escreva ("Exercício 5\n\n\n")

		//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
		//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
		real notaA, notaB, notaC
		escreva ("Insira as notas do aluno: ")
		leia (notaA, notaB, notaC)

		escreva ("A média do aluno é: ", (notaA*2+notaB*3+notaC*5)/10)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1080; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */