package fichaRPG;
import java.util.*;

public abstract class Personagem {
	/*	ler:
	 	nome do jogador
		personagem
		classe
		nivel
		
		gerar: 
 		pontosVida (específicos por classe)
 		atributos (c/ método)
 		equipamentos (específicos por classe)
 		habilidades	(específicos por classe)
	*/
	
	private String nomePersonagem, nomeJogador, classe;
	private int nivel, pontosVida;
	private int[] atributos = new int[6];
	private String[] equipamentos = new String[100];
	private String[] habilidades = new String[100];
	
	public Personagem(String nomePersonagem, String nomeJogador, String classe, int nivel,
			int pontosVida, int[] atributos, String[] equipamentos, String[] habilidades) {
		this.nomePersonagem = nomePersonagem;
		this.nomeJogador = nomeJogador;
		this.classe = classe;
		this.nivel = nivel;
		this.pontosVida = pontosVida;
		this.atributos = atributos;
		this.equipamentos = equipamentos;
		this.habilidades = habilidades;
	}

	public void definirAtributos() {
		Scanner leia = new Scanner(System.in);
		int[] distribuicao = {15, 14, 13, 12, 10, 8};

		for (int n = 0; n<6; n++) {
			System.out.printf("Para definição de atributos, usaremos a distribuição padrão: "
					+ "\n\tOs valores restantes são:");
			for (int i = n; i<6; n++) {
				System.out.printf("%d ", distribuicao[i]);
			}
			System.out.printf("\nAtributos: ");
			if(getAtributo(0) == 0) System.out.printf("\n1 - Força");
			if(getAtributo(1) == 0)	System.out.printf("\n2 - Destreza");
			if(getAtributo(2) == 0) System.out.printf("\n3 - Constituicao");
			if(getAtributo(3) == 0) System.out.printf("\n4 - Inteligencia");
			if(getAtributo(4) == 0) System.out.printf("\n5 - Sabedoria");
			if(getAtributo(5) == 0) System.out.printf("\n6 - Carisma");
			System.out.printf("\nEscolha qual atributo receberá o valor %d: ", distribuicao[n]);

			setAtributo(leia.nextInt(), distribuicao[n]);
		}
		leia.close();
	}
	
	public abstract void definirEquipamentos();
	public abstract void definirHabilidades();
	
	public int getAtributo(int n) {
		return atributos[n];
	}
	public void setAtributo(int n, int a) {
		this.atributos[n] = n;
	}
	
	//Getters e Setters
	public String getNomePersonagem() {
		return nomePersonagem;
	}
	public String getNomeJogador() {
		return nomeJogador;
	}
	public String getClasse() {
		return classe;
	}
	public int getNivel() {
		return nivel;
	}
	public int getPontosVida() {
		return pontosVida;
	}
	public String[] getEquipamentos() {
		return equipamentos;
	}
	public String[] getHabilidades() {
		return habilidades;
	}
	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}
	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}
	public void setClasse(String classe) {
			this.classe = classe;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public void setPontosVida(int pontosVida) {
		this.pontosVida = pontosVida;
	}
	public void setEquipamentos(String[] equipamentos) {
		this.equipamentos = equipamentos;
	}
	public void setHabilidades(String[] habilidades) {
		this.habilidades = habilidades;
	}
}
