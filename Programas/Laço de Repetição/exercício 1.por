programa{
	
	funcao inicio(){

		//A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		//coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
			//a) média do salário da população;
			//b) média do número de filhos;
			//c) maior salário;
			//d) percentual de pessoas com salário até R$100,00.
		
		inteiro cont, filhos
		real salario, salarioMaior = 0, salarioMedia = 0, filhosMedia = 0, pessoas = 0

		para (cont = 1; cont <= 20; cont++){
			escreva ("\n\nMorador/a nº", cont)
			escreva ("\n\nInsira o salário do/a morador/a: R$")
			leia (salario)
			escreva ("Insira o número de filhos do/a morador/a: ")
			leia (filhos) 
			
			filhosMedia = filhosMedia + filhos
			salarioMedia = salarioMedia + salario
			
			se (salario > salarioMaior) {
				salarioMaior = salario
			}
			se (salario <= 100) {
				pessoas++
			}
		}

		escreva ("\n\nMedia do salário da população é de R$", salarioMedia/20)
		escreva ("\nMédia do número filhos da população é de ", filhosMedia/20)
		escreva ("\nO maior salário é de R$",salarioMaior)
		escreva ("\nO percentual de pessoas com salário até R$100,00 é de ", pessoas*5, "%") 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 766; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */