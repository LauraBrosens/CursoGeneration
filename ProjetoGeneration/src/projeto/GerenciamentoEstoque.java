package projeto;

import java.util.*;

public class GerenciamentoEstoque {
	public static void main (String[] args) {
		
		double[][] estoque = {{100.0,4.50,10.0},{101,9.00,11},{102,40.00,15},{103,2.00,40},{104,25.00,18},
							  {105,10.50,16},{106,8.60,33},{119,16.50,30},{108,1.50,60},{109,2.5,4},
							  {200,3.5,18},{202,60.00,4},{210,0.5,50},{250,3.00,5},{270,1.20,10},
							  {208,4.5,9},{209,12.00,10},{218,10.00,15},{250,3.00,2},{120,6.00,12},
							  {0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0},
							  {0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0},
							  {0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0},
							  {0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0},
							  {0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0},
							  {0,0,0},{0,0,0},{0,0,0},{0,0,0},{0,0,0}}; 
		String[] nomesProduto = {"Bis","Feijão","Arroz","Açúcar","Lençol",
								 "Banana","Nescau","OMO","Limpol","Bombril",
								 "Bolacha Recheada","Ração para Gatos","Maçã","Negresco","Suco",
								 "Detergente","Água Sanitária","Sabão  em pó","Negresco","Refri",
								 "","","","","",
								 "","","","","",
								 "","","","","",
								 "","","","","",
								 "","","","","",
								 "","","","",""};
		//imprimirEstoque(estoque, nomesProduto);
		//System.out.println("Vamos remover o 10º item: Bolacha Recheada");
		//System.out.println("\nConsolidando estoque...\n");
		//consolidarEstoque(estoque, nomesProduto);
		//adicionarEstoque(estoque, nomesProduto);
		//removerEstoque(estoque, nomesProduto, -2);
		//imprimirEstoque(estoque, nomesProduto);
		
	}
	public static void imprimirEstoque(double[][] array, String[] nomes) {
		System.out.println("Código\tPreço\tQtd\tNome");
		for(int i=0;i<array.length;i++) {
			if (array[i][0]==0) {
				break;
			}
			for (int j=0;j<array[i].length;j++) {
				switch (j) {
				case 0: System.out.printf("%.0f\t", array[i][j]); break;
				case 1: System.out.printf("%.2f\t", array[i][j]); break; 
				case 2: System.out.printf("%.0f\t", array[i][j]); break;
				}
			}
			System.out.printf("%s\n", nomes[i]);
		}
	}
	public static int estoqueInicializado(double[][] array) { 
		int n;
		
		for (n = 0; n<array.length; n++) {
			if (array[n][0] == 0) {
				break;
			}
		}
		return n;
	}
	public static double[][] adicionarEstoque(double[][] array, String[] vetor){
		int n = estoqueInicializado(array);
		if (n == 50) {
			System.out.println("O estoque está cheio! Não posso adicionar um novo item");
			return array;
		}
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira o código do novo produto");
		array[n][0] = leia.nextDouble();
		System.out.println("Insira o preço do novo produto");
		array[n][1] = leia.nextDouble();
		System.out.println("Insira a quantidade do novo produto");
		array[n][2] = leia.nextDouble();
		adicionarNome(vetor, n);
		leia.close();
		return array;
	}
	public static String[] adicionarNome(String[] vetor, int n) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira o nome do novo produto");
		vetor[n] = leia.next();
		leia.close();
		return vetor;
	}
	public static double[][] removerEstoque(double[][] array, String[] vetor, int a){
		if (a>0 && a <= array.length) {
			int n = estoqueInicializado(array);
			for (int i = 0; i < 3; i++) {
				array[a][i] = 0;
			}
			for (int i = a; i <= n; i++) {
				for (int j = 0; j < 3; j++) {
					array[i][j] = array[i + 1][j];
				}
			}
			removerNome(vetor, a, n);
			return array;
		}
		System.out.println("Por favor, insira um código válido");
		return null;
	}
	public static String[] removerNome(String[] vetor, int a, int n) {
		vetor[a] = "";
		for (int i=a;i<=n;i++ ) {
			vetor[i] = vetor[i+1];
		}
		return vetor;
	}
	public static double[][] consolidarEstoque(double[][] array, String[] vetor){
		double aux;
		int n;
		int a = estoqueInicializado(array);
		boolean ok;
		do {
			ok = true;
			for (n = 0; n<a-1; n++) {
				if (array[n][0] > array[n+1][0]) {
					ok = false;
					for (int j = 0; j<3;j++) {
						aux = array[n][j]; 
						array[n][j] = array[n+1][j];
						array[n+1][j] = aux;
						consolidarNomes(vetor, n);
					}
				}
				
			}
		}while(!ok);
		for (n = 0; n<a-1; n++) {
			if (array[n][0]==array[n+1][0]) {
				array[n][2] = array[n][2] + array[n+1][2];
				removerEstoque(array, vetor, n+1);
			}
		}
		return array;
	}
	public static String[] consolidarNomes(String[] vetor, int n) {

		String aux;
			aux = vetor[n];
			vetor[n] = vetor[n+1];
			vetor[n+1] = aux;
		return vetor;
	}

}