package exercicio4;
import java.util.Scanner;

public class Exercicio4 {
	private static Scanner leia;

	public static void main (String[] args) {
		leia = new Scanner (System.in);
		System.out.println("Informe o valor de A: ");
		int A = leia.nextInt();
		
		System.out.println("Informe o valor de B: ");
		int B = leia.nextInt();
		
		System.out.println("Informe o valor de C: ");
		int C = leia.nextInt();
		
		C = (B + C)*(B + C);
		B = (A + B)*(A + B);
		
		A = (B+C)/2;
		System.out.println("D = "+A);
		
	}
}
