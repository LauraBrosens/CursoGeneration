package exercicio8;
import java.util.Scanner;

public class exercício8 {
	private static Scanner leia;

	public static void main (String[] args) {
		leia = new Scanner (System.in);
		System.out.println("Informe o custo de fábrica: ");
		double custo = leia.nextInt();
		
		custo = (custo*(1 + 0.28 + 0.45));
		
		System.out.println("O custo total é de R$"+ custo);
		
	}
}
