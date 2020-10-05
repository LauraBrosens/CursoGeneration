programa
{
	funcao inicio()
	{
		
		/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		imprima a média aritmética dos lançamentos, contabilize e apresente também	
		quantas foram as ocorrências da maior pontuação.*/
		
		inteiro dados[10], n, maior=0, frequencia=0
		real media = 0.0
		
		escreva ("Vetor: ")
		para (n=0;n<10;n++){
			dados[n] = sorteia(1,6)
			
			se (dados[n] > maior){
				maior = dados[n]
				frequencia = 1
			}
			senao se (dados[n] == maior){
				frequencia++
			}
			
			media = media + dados[n]
			escreva (dados[n], ", ")
		}
		
		escreva ("\nO maior valor rodado foi ", maior, " e sua frequencia foi ", frequencia)
		escreva ("\nA média dos valores é ", media/10)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 422; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */