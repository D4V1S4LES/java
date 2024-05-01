package model;

public class Moto extends Veiculo{
	
	protected int Cilindrada; //Definindo atributos
	
	public Moto(String Marca, String Modelo, int Cilindrada) {
		super(Marca, Modelo); //Atributos da super classe
		this.Cilindrada = Cilindrada;
	}
	
	public void setCilindrada(int Cilindrada) { //Setando para definir o valor de Cilindrada
		this.Cilindrada = Cilindrada;
	}
	
	public int getCilindrada() { //Setando para retornar a Cilindragem
		return Cilindrada;
	}
}
