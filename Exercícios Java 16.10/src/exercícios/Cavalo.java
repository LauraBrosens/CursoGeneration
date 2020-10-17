package exercícios;

public class Cavalo extends Animal {
	
	public Cavalo (String nome, int idade) {
		super(nome, idade);
		
	}
	
	public void emitirSom() {
		System.out.println("O Cavalo " + getNome() + " relincha!");
	}
	
	public void atividadeFisica() {
		System.out.println("O Cavalo cavalga!");
	}
}
