programa
{
	inclua biblioteca Matematica --> m
	funcao inicio()
	{
		ex6()
	}

	funcao ex6(){
		real x1, x2, y1, y2

		escreva ("Insira as coordenadas do 1º ponto: ")
		leia (x1, y1)
		escreva ("Insira as coordenadas do 2º ponto: ")
		leia (x2, y2)

		escreva ("\nA distância entre os pontos é de ", m.raiz( (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1),2))
		
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 357; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */