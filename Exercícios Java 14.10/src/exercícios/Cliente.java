package exercícios;

public class Cliente {
	private String nome, sobrenome, genero;
	private int idade;
	
	public static void main(String[] args) {
		Cliente Carlos = new Cliente("Carlos", "Souza", "Homem", 28);
		Cliente Mariana = new Cliente("Mariana", "Souza", "Mulher", 29);
		String nomeC = Carlos.obterNome(), generoC = Carlos.obterGenero();
		int idadeC = Carlos.obterIdade();
		System.out.println("O nome deste cliente é " + nomeC + ". Seu gênero é " + generoC + " e sua idade é "+ idadeC);	
		String nomeM = Mariana.obterNome();
		String generoM = Mariana.obterGenero();
		int idadeM = Mariana.obterIdade();
		System.out.println("O nome deste cliente é " + nomeM + ". Seu gênero é " + generoM + " e sua idade é "+ idadeM);	
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
