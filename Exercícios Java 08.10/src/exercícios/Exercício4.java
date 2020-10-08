package exercícios;

import java.util.*;

public class Exercício4 {
	private static Scanner leia;
	public static void main (String[] args) {
		leia = new Scanner(System.in); 
		
		int pessoaCalma = 0, mulheresNervosas = 0, homensAgressivos = 0, enbyCalmes = 0, nervosas40 = 0, calmas18 = 0;
		int n=1, genero, idade, temperamento;
		
		while (n<=150) {
			System.out.println("Qual a idade da pessoa?");
			idade = leia.nextInt();
			System.out.println("Qual o gênero da pessoa?\n 1 - mulher\n 2 - homem\n 3 - não-binárie");
			genero = leia.nextInt();
			System.out.println("Qual o comportamento da pessoa?\n 1 - calmo\n 2 - nervoso\n 3 - agressivo");
			temperamento = leia.nextInt();		
			if (temperamento == 1 || temperamento == 2 || temperamento == 3 && genero == 1 || genero == 2 || genero == 3) n++;
			switch (temperamento) {
				case 1: 
					pessoaCalma++;
					if (genero == 3) enbyCalmes++;
					if (idade < 18) calmas18++;
					break;
				case 2:
					if (genero == 1) mulheresNervosas++;
					if (idade > 40) nervosas40++;
					break;
				case 3:
					if (genero == 2) homensAgressivos++;
					break;
				default:
					System.out.println("Algo deu errado");
			}
			
		}
		System.out.println("Pessoas Calmas: " + pessoaCalma);
		System.out.println("Mulheres Nervosas: " + mulheresNervosas);
		System.out.println("Homens Agressivos: " + homensAgressivos);
		System.out.println("Não-Bináries Calmes: " + enbyCalmes);
		System.out.println("Pessoas nervosas com mais de 40 anos: " + nervosas40);
		System.out.println("Pessoas calmas com menos de 18 anos: " + calmas18);
	}
}
