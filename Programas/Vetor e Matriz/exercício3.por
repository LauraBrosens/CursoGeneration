programa
{
	
	funcao inicio()
	{
		/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
			a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
			das matrizes N1 e N2;
			b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
			posição das matrizes N1 e N2.*/

		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6], x, y

		para (x=0;x<4;x++){
			para (y=0;y<6;y++){
				//escreva ("Insira o valor da primeira matriz na linha ", x+1, " e coluna ", y+1, ".")
				//leia (N1[x][y])
				N1[x][y] = sorteia(-9,9)
				//escreva ("Insira o valor da segunda matriz na linha ", x+1, " e coluna ", y+1, ".")
				//leia (N2[x][y])
				N2[x][y] = sorteia(-9,9)
				M1[x][y] = N1[x][y] + N2[x][y]
				M2[x][y] = N1[x][y] - N2[x][y]
			}
		}
		escreva ("Matriz M1:\n")
		para (x=0;x<4;x++){
			para (y=0;y<6;y++){
				escreva (M1[x][y], " ")
			}
			escreva ("\n")
		}
		escreva ("\n\nMatriz M2:\n")
		para (x=0;x<4;x++){
			para (y=0;y<6;y++){
				escreva (M2[x][y], " ")
			}
			escreva ("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 710; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */