package exercícios;

public class ClasseMain {
	public static void main(String args[]) {
		
		Cachorro cachorro = new Cachorro("Adamastor", 7);
		Cavalo cavalo = new Cavalo("Coice Bravo", 4);
		Preguiça preguica = new Preguiça("Laura", 6);
		
		
		int n = (int) (Math.random()*3);
				
		switch (n){
			case 0: 
				cachorro.emitirSom();
				break;
			case 1:
				cavalo.emitirSom();
				break;
			case 2:
				preguica.emitirSom();
				break;
				
		}
				
	}
}
