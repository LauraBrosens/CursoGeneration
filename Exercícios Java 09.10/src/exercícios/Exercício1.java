package exercícios;

public class Exercício1 {
	public static void main(String[] args) {
		
		int[] vetor = {1, 0, 5, -2, -5, 7};
		int soma = vetor[0] + vetor[1] + vetor[5];
		
		System.out.println("Soma das posições 1, 2 e 6 do vetor = " + soma);
		
		vetor[3] = 100; /*Estou interpretando "posição quatro" como "a quarta posição"*/
		
		for(int i = 0; i<6; i++) {
			System.out.println("Posição "+i+" do vetor = "+ vetor[i]);
		}
		
	}
}
