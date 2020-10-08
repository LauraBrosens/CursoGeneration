package exercícios;
import java.util.*;

public class Exercício5 {
	private static Scanner leia;
	public static void main(String[] args) {
		leia = new Scanner(System.in); 
		int n, soma=0;
		do {
		n =	leia.nextInt();
		soma += n;	
		} while(n !=0);
		System.out.println("Soma = "+ soma);
	}
}
