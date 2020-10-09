package exercícios;
import java.util.*;

public class Exercício4 {
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		int caso;
		double[][] matriz1= new double[2][2];
		double[][] matriz2= new double[2][2];
		double[][] matriz3= new double[2][2];
		double constante;
		
		System.out.println("Preencha a primeira Matriz");
		for(int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				System.out.println("Posição ["+i+"]["+j+"]");
				matriz1[i][j] = leia.nextDouble();
			}
		}
		
		System.out.println("Preencha a segunda Matriz");
		for(int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				System.out.println("Posição ["+i+"]["+j+"]");
				matriz2[i][j] = leia.nextDouble();
			}
		}

		do{
			System.out.println("Escolha a opção: "
					+ "\n	1 - Somar as duas matrizes"
					+ "\n	2 - Subtrair a primeira matriz da segunda"
					+ "\n	3 - Adicionar uma constante as duas matrizes"
					+ "\n	4 - Imprimir as matrizes e sair do programa");
			caso = leia.nextInt();
			switch(caso) {
				case 1:
					for(int i=0;i<2;i++) {
						for (int j=0;j<2;j++) {
							matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
						}
					}
					break;
				case 2: 
					for(int i=0;i<2;i++) {
						for (int j=0;j<2;j++) {
							matriz3[i][j] = matriz2[i][j] - matriz1[i][j];
						}
					}
					break;
				case 3:
					System.out.println("Insira o valor da constante: ");
					constante = leia.nextInt();
					for(int i=0;i<2;i++) {
						for (int j=0;j<2;j++) {
							matriz2[i][j] += constante;
							matriz1[i][j] += constante;
						}
					}
					break;
				case 4:
					System.out.println("Primeira Matriz: ");
					for(int i=0;i<2;i++) {
						for (int j=0;j<2;j++) {
							System.out.printf("%f\t", matriz1[i][j]);
						}
						System.out.println("");
					}
					System.out.println("Segunda Matriz: ");
					for(int i=0;i<2;i++) {
						for (int j=0;j<2;j++) {
							System.out.printf("%f\t", matriz2[i][j]);
						}
						System.out.println("");
					}
					break;
				default:
					System.out.println("Insira um código válido");
			}
		}while(caso!=4);
		leia.close();
	}
}
