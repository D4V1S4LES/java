package aula12;

public class Item {
	//Definindo atributos
	String joy;
	int quantidade;
	double preco;
	
	//Construtor da classe
	public Item(String joy, int quantidade, double preco) {
		this.joy = joy;
		this.quantidade =  quantidade;
		this.preco = preco;
	}
	
	//Método para transformar os dados em String
	public String toString() {
		return "Item: " + joy + " Quantidade: " + quantidade + " Preço (R$): " + String.format("%.2f", preco);
	}
}
