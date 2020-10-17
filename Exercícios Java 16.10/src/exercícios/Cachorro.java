package exercícios;

public class Cachorro extends Animal {
	
	public Cachorro (String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("O Cachorro " + getNome() +" late!");
	}
	
	public void atividadeFisica() {
		System.out.println("O Cachorro corre!");
	}
}
