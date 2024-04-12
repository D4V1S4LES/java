package pokemon;

public class Pokemon {

	//Atributos (Oque precisamos saber)
	String nome;
	String tipo;
	String cor;
	int level;
	int iv;
	
	//Construtor (A ordem que vamos criar os objetos)
	public Pokemon(String nome, String tipo, String cor, int level, int iv) {
		this.nome = nome;
		this.tipo = tipo;
		this.cor = cor;
		this.level = level;
		this.iv = iv;
	}
	
	//Métodos (Oque ele faz, as ações dele)
	
	public void evoluir() {
		System.out.println("O pokemon " + nome + " evoluiu");
	}
	
	public void mostrarStatus() {
		System.out.println("\nSTATUS DO POKEMON:\n ");
		System.out.println("Nome: " + nome);
		System.out.println("Tipo: " + tipo);
		System.out.println("Cor: " + cor);
		System.out.println("Level: " + level);
		System.out.println("IV: " + iv);
	}

	public void subirLevel() {
		level += 1;
		System.out.println("\n" + nome + " subiu de level e foi para LV: " + level);
	}
	
	public void descerLevel() {
		level += -1;
		System.out.println("\n" + nome + " desceu de level e foi para LV: " + level);
	}
	
}
