package fichaRPG;

import java.util.Scanner;

public class MainFichaRPG {
	public static void main (String[] args) {
		int nivel;
		Scanner leia = new Scanner(System.in);
		nivel = leia.nextInt();
		String[] equipamentos = new String[100];
		String[] equipamentos2 = new String[100];
		String[] caracteristicas = new String[100];
		//int[] atributos = {15, 14, 14, 12, 10, 8};
		int[] habilidades = new int[6];
		Clerigo clerigo = new Clerigo("", "", "", nivel, 0, habilidades, equipamentos, caracteristicas);
		Barbaro barbaro = new Barbaro("", "", "", nivel, 0, habilidades, equipamentos2, caracteristicas);
		Ladino ladino = new Ladino("", "", "", nivel, 0, habilidades, equipamentos, caracteristicas);
		Guerreiro guerreiro = new Guerreiro("", "", "", nivel, 0, habilidades, equipamentos, caracteristicas);
		
		//clerigo.definirCaracteristicas();
		clerigo.definirEquipamentos();
		//clerigo.definirHabilidades();
		//barbaro.definirCaracteristicas();
		barbaro.definirEquipamentos();
		
		clerigo.mostrarEquipamentos();
		System.out.println("\nEquips barbaro");
		barbaro.mostrarEquipamentos();
		//barbaro.definirHabilidades();
		//ladino.definirCaracteristicas();
		//ladino.definirEquipamentos();
		//ladino.definirHabilidades();
		//guerreiro.definirCaracteristicas();
		//guerreiro.definirEquipamentos();
		//guerreiro.definirHabilidades();
		
		
		/*clerigo.mostrarCaracteristicas();
		clerigo.mostrarTruques();
		clerigo.mostrarEquipamentos();
		barbaro.mostrarCaracteristicas();
		
		ladino.mostrarCaracteristicas();
		ladino.mostrarEquipamentos();
		guerreiro.mostrarCaracteristicas();
		guerreiro.mostrarEquipamentos();
		*/
		leia.close();
	}
}
