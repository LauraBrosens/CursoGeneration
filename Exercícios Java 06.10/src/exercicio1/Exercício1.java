package exercicio1;
import java.util.Scanner;

public class Exercício1 {
	private static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner (System.in);
		System.out.println("Informe quantos anos você tem: ");
		
		int anos = leia.nextInt();
		System.out.println("Informe quantos meses você tem: ");
		int meses = leia.nextInt();
		System.out.println("Informe quantos dias você tem: ");
		int dias = leia.nextInt();
		
		dias = anos*365 + meses *30 + dias;
		
		System.out.println("Você tem " + dias + " dias de vida.");
	}
	
}
