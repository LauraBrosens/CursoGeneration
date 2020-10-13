package projeto;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class projetoGenerationMain{
	public static void main (String[] args) {
		//---------------------------------		
		double[][] carrinho = new double[400][3];
		String[] carrinhoNomes = new String[400];
		int casos;
		String senha = "ger123", senha0;
		//-----------------------------//---------	
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
		Scanner ler = new Scanner (System.in);
		boolean ok = true;
		
		do 
		{			
			System.out.println("Olá, selecione opção desejada!\n"
					+ "1- Gerenciar Estoque;\n"
					+ "2- Fazer uma nova venda\n"
					+ "3- Sair");
			casos = ler.nextInt();

			switch(casos){
			//-----------------------------------------------------------------------------------------		
			case 1:
				System.out.println("Insira senha");
				senha0 = ler.next();
				if(Objects.equals(senha, senha0)){											
					do {
						System.out.println("Selecione a opção desejada:"
								+ "\n1- Adicionar item"
								+ "\n2- Remover item"
								+ "\n3- Alterar quantidade de item"
								+ "\n4- Consolidar estoque"
								+ "\n5- Visualizar estoque"
								+ "\n6- Alterar senha"
								+ "\n7- Voltar");
						casos= ler.nextInt();
						switch(casos){
						case 1:
							System.out.println("Adicionar Novo Item:");
							adicionarEstoque(estoque, nomesProduto);
							imprimirEstoque(estoque, nomesProduto);
							break;
						case 2:
							System.out.println("Remover Item: \nInsira a posição do item a ser removido: ");						
							casos = ler.nextInt();
							removerEstoque(estoque, nomesProduto, casos);
							imprimirEstoque(estoque, nomesProduto);
							break;
						case 3:			
							System.out.printf("Alterar quantidade do item nº ");
							casos = ler.nextInt();
							System.out.printf("\nSomar/subtrair quanto?");
							estoque[casos-1][2] += ler.nextInt(); // a += b é a mesma coisa que a = a+b 
							if (estoque[casos-1][2] < 0 ) {
								estoque[casos-1][2] = 0; 
							}
							break;
						case 4:
							System.out.println("Consolidando estoque... \n");	
							consolidarEstoque(estoque,nomesProduto);
							break;
						case 5:	
							imprimirEstoque(estoque, nomesProduto);
							break;
						case 6:
							System.out.println("Insira a nova senha: \n");
							senha0 = ler.next();
							System.out.println("Confirme a nova senha: \n");
							if(Objects.equals(ler.next(), senha0)) {
								senha = senha0;
							}
							break;
						case 7:
							//System.out.println("Voltar!");
							ok = false;
							break;
						}	
						System.out.println("Aperte enter para continuar");
						try {
							System.in.read();
						} catch (IOException e) {
							e.printStackTrace();
						} //aperte enter para continuar.
					}while(ok);
					ok = true;
				}
				else
					System.out.println("Senha Inválida!");
				break;	
				//------------------------------------------------------------------------------------------				
			case 2:				
				vendaCarrinho(estoque, nomesProduto, carrinho, carrinhoNomes);
				imprimirCarrinho(carrinho, carrinhoNomes);
				System.out.println("Aperte enter para continuar");
				try {
					System.in.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;			
			case 3:					
				System.out.println("Sair!");
				ok = false;
			}
		}
		while(ok);
		ler.close();
	}
		//----------------------------//------/--/-----------------------------/-------------------------	
	public static double NovaVenda(int codigo, double qtdeDesejada, double[][] estoque, String[] nomeProduto) {
	double ValorDaVenda;
		int i = ConferirDisponibilidade(estoque,qtdeDesejada,codigo);
		if (i != -1) {
			ValorDaVenda = estoque[i][1]*qtdeDesejada;
			estoque[i][2] =estoque[i][2]-qtdeDesejada;
			return ValorDaVenda;
		}else {
			removerEstoque(estoque, nomeProduto, i);
		}
		return 0;
	}	 
	@SuppressWarnings("resource")
	public static double[][] vendaCarrinho(double[][] array, String[] vetor, double[][] carrinho, String[] carrinhoNome) {
		Scanner ler = new Scanner (System.in);
		int codigo, quantidade;
		int x = 0, a, i;
		do {
			System.out.println("Inserir cód produto:");
			codigo = ler.nextInt();
			System.out.println("Inserir quantidade desejada:");
			quantidade = ler.nextInt();
			i = ConferirDisponibilidade(array,quantidade,codigo);
			if (i != -1) {
				carrinho[x][0] = array[i][0];
				carrinho[x][1] = array[i][1];
				carrinho[x][2] = quantidade;
				carrinhoNome[x] = vetor[i];
				array[i][2] -= quantidade;
			}
			else {
				System.out.println("Não tem disponibilidade deste produto");
			}
			do {
				System.out.println("Deseja adicionar um novo produto?\n 1 - Sim\n 2 - Não");
				a = ler.nextInt();
				switch (a) {
				case 1:
					x++;
					break;
				case 2:
					System.out.println("Obrigado pela compra!");
					break;
				default:
					System.out.println("Erro. Insira uma opção correta.");
				}
			} while (a != 1 && a != 2);
		} while (a !=2);
		//ler.close();
		return carrinho;
	}
	private static int ConferirDisponibilidade(double[][] array, double qtdeDesejada, double codigo) {
		int tamanho = estoqueInicializado(array); 
		int i;
		for(i=0;i<tamanho;i++){
			if(codigo==array[i][0]) {
				if(qtdeDesejada <= array[i][2])	return i;
			}
		}
		return -1;
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
		if (n == array.length) {
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
		a--;
		int n = estoqueInicializado(array);
		for (int i = a; i <= n; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = array[i + 1][j];
			}
		}
		removerNome(vetor, a, n);
		return array;
	}
	public static String[] removerNome(String[] vetor, int a, int n) {
		for (int i=a;i<=n;i++ ) {
			vetor[i] = vetor[i+1];
		}
		return vetor;
	}
	public static double[][] consolidarEstoque(double[][] array, String[] vetor){
		double aux;
		int a;
		int n = estoqueInicializado(array);
		boolean ok;
		do {
			ok = true;
			for (a = 0; a<n-1; a++) {
				if (array[a][0] > array[a+1][0]) {
					ok = false;
					for (int j = 0; j<3;j++) {
						aux = array[a][j]; 
						array[a][j] = array[a+1][j];
						array[a+1][j] = aux;
						consolidarNomes(vetor, a);
					}
				}
			}
		}while(!ok);
		for (a = 0; a<n-1; a++) {
			if (array[a][0]==array[a+1][0]) {
				array[a][2] = array[a][2] + array[a+1][2];
				removerEstoque(array, vetor, a+2);
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
	public static void imprimirCarrinho(double[][] carrinho, String[] nomes) {
		System.out.println("Código\tPreço\tQtd\tNome");
		double total = 0;
		for(int i=0;i<carrinho.length;i++) {
			if (carrinho[i][0]==0) {
				break;
			}
			for (int j=0;j<3;j++) { 
				switch (j) {
				case 0:
					System.out.printf("%.0f\t", carrinho[i][0]); //código
					break;
				case 1:
					System.out.printf("%.2f\t", carrinho[i][1]); //preço
					break;
				case 2:
					System.out.printf("%.0f\t", carrinho[i][2]); //quantidade
					break;
				}
			}
			System.out.printf("%s\t\n", nomes[i]); //nome
			System.out.println("\t\t\t      Subtotal"); 
			System.out.printf("\t\t\t      %.2f\n", carrinho[i][1]*carrinho[i][2]);
			total = total + carrinho[i][1]*carrinho[i][2]; 
		}
		System.out.printf("\nPreço total = %.2f", total);
	}
}


