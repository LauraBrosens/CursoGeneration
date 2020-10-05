programa
{
	funcao inicio()
	{
		//Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
		//número é par ou ímpar, e se é positivo ou negativo.

		inteiro A
		leia (A)
		
		escolha (A%2){
			caso -1: 
				escreva ("O número é Ímpar e")
				pare
			caso 0:
				escreva ("O número é Par e")
				pare
			caso 1: 
				escreva ("O número é Ímpar e")
				pare
		}
		se (A>0){
			escreva (" Positivo")
		}
		senao{
			escreva (" Negativo")
		}
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */