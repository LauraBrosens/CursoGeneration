programa
{
		
	funcao inicio()
	{
		ex5()
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
 * @POSICAO-CURSOR = 277; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */