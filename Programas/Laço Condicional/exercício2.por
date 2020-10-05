programa
{
	
	funcao inicio()
	{
		//Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
		//horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
		//por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
		//armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
		//trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
		//excedente.

		inteiro C, N, E=0
		
		escreva ("Insira o código do/a funcionário/a: ")
		leia (C)
		escreva ("Insira o número de horas trabalhadas: ")
		leia (N)
		
		se (N>50){
			E = (N-50)*20
			N = 50
		}
		N = N*10
		escreva ("O salário do/a funcionário/a #", C, " é de: R$", N+E, "\nO salário excedente é de R$", E)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 625; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */