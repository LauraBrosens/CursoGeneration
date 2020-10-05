programa
{
	
	funcao inicio()
	{
		//Desenvolva um sistema em que:
			//Leia 4 (quatro) números;
			//Calcule o quadrado de cada um;
			//Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
			//Caso contrário, imprima os valores lidos e seus respectivos quadrados.

		real A, B, C, D
		escreva ("Insira os valores de A, B, C e D\n")
		leia (A, B, C, D)
		
		se (C*C >= 1000){
			escreva ("C² é maior que 1000! Seu valor é = ", C*C)
		}
		senao {
			escreva ("Valor de A² = ", A*A, "\nValor de B² = ", B*B, "\nValor de C² = ", C*C, "\nValor de D² = ", D*D)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 393; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */