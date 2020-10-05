programa
{
	inclua biblioteca Matematica --> m
	funcao inicio()
	{
		/*Elabore um programa que calcule o que deve ser pago por um produto, considerando
		o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos
		da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo
		adequado.
		Código Condição de pagamento
			1 À vista em dinheiro ou cheque, recebe 20% de desconto
			2 À vista no cartão de crédito, recebe 15% de desconto
			3 Em duas vezes, preço normal de etiqueta sem juros
			4 Em três vezes, preço normal de etiqueta mais juros de 10%*/

		inteiro forma
		real preco

		escreva ("Insira o preco: R$")
		leia (preco)
		
		faca {
			escreva ("Formas de pagamento:\n1 - À vista em dinheiro ou cheque, recebe 20% de desconto\n2 - À vista no cartão de crédito, recebe 15% de desconto\n3 - Em duas vezes, preço normal de etiqueta sem juros\n4 - Em três vezes, preço normal de etiqueta mais juros de 10%\nDigite a forma de pagamento: ")
			leia (forma)
			escreva ("\n")
			escolha (forma){
				caso 1:
					preco = preco*0.8
					escreva ("Preço à vista no dinheiro ou débito: R$", preco)
					pare
				caso 2:
					preco = preco * 0.85
					escreva ("Preço à vista no cartão de crédito: R$", preco)
					pare
				caso 3:
					escreva ("Preço parcelado em duas vezes sem juros: R$", preco, "\nValor da parcela: R$", preco/2)
					pare
				caso 4:
					preco = m.arredondar(preco * 1.10,2)
					escreva ("Preço parcelado em três vezes, com 10% de juros: R$", preco, "\nValor da parcela: R$", m.arredondar(preco/3,2))
					pare
				caso contrario:
					escreva ("Escolha invalida - tente novamente\n\n")
			}
		}enquanto (forma <1 ou forma >4)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1663; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */