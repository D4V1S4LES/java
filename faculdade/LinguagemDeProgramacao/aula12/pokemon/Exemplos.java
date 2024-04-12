package pokemon;

public class Exemplos {
	public static void main(String[] args) {
		Pokemon Blastoise = new Pokemon("blastoise", "Agua", "Azul", 36, 99 );
		Pokemon Alakazam = new Pokemon("Alakazam", "Psiquico", "Amarelo", 50, 100);
		
		Alakazam.mostrarStatus();
		Alakazam.subirLevel();
		//Blastoise.mostrarStatus();
		
		Alakazam.mostrarStatus();
		Alakazam.descerLevel();
	}
}
