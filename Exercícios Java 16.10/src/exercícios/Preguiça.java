package exerc�cios;

public class Pregui�a extends Animal {

	public Pregui�a (String nome, int idade) {
		super(nome, idade);
	}
	
	public void emitirSom() {
		System.out.println("A pregui�a " + getNome() + " ... faz sons?");
	}

	public void atividadeFisica() {
		System.out.println("A pregui�a sobe na �rvore!");
	}
}
