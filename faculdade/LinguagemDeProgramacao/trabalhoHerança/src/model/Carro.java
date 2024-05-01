package model;

public class Carro extends Veiculo {

	protected int numeroPortas; //Definindo atributo
	
	public Carro(String Marca, String Modelo, int numeroPortas) {
		super(Marca, Modelo); //Atributos da superclasse
		this.numeroPortas = numeroPortas;
	}
	
	public void setnumeroPortas(int numeroPortas) { //Setando para definir o valor de numeroPortas
		this.numeroPortas = numeroPortas;
	}
	
	public int getnumeroPortas() { //Setando para retornar o numeroPortas
		return numeroPortas;
	}
}
