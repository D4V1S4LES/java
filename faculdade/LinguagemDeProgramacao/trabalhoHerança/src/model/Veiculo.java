package model;

public class Veiculo {
	//Definindo atributos
	
	protected String Marca;
	protected String Modelo;
	
	public Veiculo(String Marca, String Modelo) {
		this.Marca = Marca;
		this.Modelo = Modelo;
	}
	
	public void setMarca(String Marca) { //Setando para artribuir valor a Marca
		this.Marca = Marca;
	}
	
	public String getMarca() { //Setando para retornar a marca
		return Marca;
	}
	
	public void setModelo(String Modelo) { //Setando para atribuir valor a modelo
		this.Modelo = Modelo;
	}
	
	public String getModelo() { //Setando para retornar o modelo
		return Modelo;
	}
}
