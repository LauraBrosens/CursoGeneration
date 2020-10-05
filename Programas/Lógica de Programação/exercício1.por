programa
{
	funcao inicio(){
		ex1()
	}
	
	funcao ex1(){ 
		//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
		escreva ("Exercício 1\n\n\n")
		
		inteiro anos, meses, dias
		
		escreva ("Informe quantos anos você tem: ")
		leia (anos)
		escreva ("\nInforme quantos meses você tem: ")
		leia (meses)
		escreva ("\nInforme quantos dias você tem: ")
		leia (dias)
		
		dias = anos*365 + meses*30 + dias
		escreva ("\n\nVocê tem " + dias + " dias de idade")
	}

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 41; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */