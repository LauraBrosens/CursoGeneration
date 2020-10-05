programa
{
	
	funcao inicio()
	{
		/*Escrever um programa que leia uma quantidade desconhecida de números e conte
		quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A
		entrada de dados deve terminar quando for lido um número negativo.*/

		inteiro numero, intervalo1=0, intervalo2=0, intervalo3=0, intervalo4=0
		
		faca{
			escreva ("Insira um número positivo: ")
			leia (numero)
			se (numero < 0){
				escreva ("\n\nQuebrou o loop!\n\n")
			}
			senao se (numero<=25){
				intervalo1++
			}
			senao se (numero<=50){
				intervalo2++
			}
			senao se (numero<=75){
				intervalo3++
			}
			senao se (numero<=100){
				intervalo4++
			}
		} enquanto(numero >= 0)

		escreva ("Havia ", intervalo1, " números entre 0 e 25\n")
		escreva ("Havia ", intervalo2, " números entre 26 e 50\n")
		escreva ("Havia ", intervalo3, " números entre 51 e 75\n")
		escreva ("Havia ", intervalo4, " números entre 76 e 100\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 945; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */