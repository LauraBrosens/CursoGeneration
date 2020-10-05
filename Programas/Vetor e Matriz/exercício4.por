programa
{
	
	funcao inicio()
	{
		/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		diagonal, ou seja, diagonal principal.*/

		escreva("Preencha a Matriz, linha a linha: \n")
		inteiro matriz[3][3], soma=0, diagonal=0, x, y

		para (x=0;x<3;x++){
			escreva ("\nLinha ", x+1,":\n")
			para(y=0;y<3;y++){
				escreva ("\nColuna ",y+1, ":")
				matriz[x][y] = sorteia(0,20)
				escreva (matriz[x][y])
				soma = soma + matriz[x][y]
				se (x == y) diagonal = diagonal + matriz[x][y]
			}
			escreva("\n")
		}

		escreva ("\nSoma dos valores da matriz = ", soma)
		escreva ("\nSoma dos valores da diagonal principal = ", diagonal)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 615; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */