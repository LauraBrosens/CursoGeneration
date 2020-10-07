package exercício3;

import java.util.Scanner;

public class Exercício3 {
	private static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner (System.in);
		System.out.println("Insira a idade: ");
		int idade = leia.nextInt();
		
		idade = (10 <= idade && idade <= 14) ? 1 : 
				(15<=idade & idade <=17) ? 2 : 
				(18 <= idade && idade <= 25) ? 3 : 0;
		
		switch (idade) {
		case 1: 
			System.out.println("Categoria Infantil");
			break;
		case 2:
			System.out.println("Categoria Juvenil");
			break;
		case 3:
			System.out.println("Categoria Adulto");
			break;
		default: 
			System.out.println("Idade Inválida\nNão pode competir");
			break;
		}
				
	}
}
