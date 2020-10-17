package exercícios;

public class Preguiça extends Animal {

	public Preguiça (String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("A preguiça " + getNome() + " ... faz sons?");
	}

	public void atividadeFisica() {
		System.out.println("A preguiça sobe na árvore!");
	}
}
