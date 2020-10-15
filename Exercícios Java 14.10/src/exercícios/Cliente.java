package exerc�cios;

public class Cliente {
	private String nome, sobrenome, genero;
	private int idade;
	
	public static void main(String[] args) {
		Cliente Carlos = new Cliente("Carlos", "Souza", "Homem", 28);
		Cliente Mariana = new Cliente("Mariana", "Souza", "Mulher", 29);
		String nomeC = Carlos.obterNome(), generoC = Carlos.obterGenero();
		int idadeC = Carlos.obterIdade();
		System.out.println("O nome deste cliente � " + nomeC + ". Seu g�nero � " + generoC + " e sua idade � "+ idadeC);	
		String nomeM = Mariana.obterNome();
		String generoM = Mariana.obterGenero();
		int idadeM = Mariana.obterIdade();
		System.out.println("O nome deste cliente � " + nomeM + ". Seu g�nero � " + generoM + " e sua idade � "+ idadeM);	
	}
	public Cliente (String nome, String sobrenome, String genero, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.genero = genero;
		this.idade = idade;
	}
	public String obterNome() {
		String nome = this.nome + " " + this.sobrenome;
		return nome;
	}
	public String obterGenero() {
		return this.genero;
	}
	public int obterIdade() {
		return this.idade;
	}
}
