package aula12;

public class Carro {
	String marca;
	String modelo;
	int ano;
	double preco;
	boolean ligado;
	
	public Carro(String marca, String modelo, int ano, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
		this.ligado = false;
	}
	
	public void ligar() {
		if(!ligado) {
			System.out.println("Carro ligado");
			ligado = true;
		}
		else {
			System.out.println("O carro já esta ligado");
		}
	}
	
	public void desligar() {
		if(ligado) {
			System.out.println("Carro desligado");
			ligado = false;
		}
		else {
			System.out.println("\n O carro está desligado");
		}
	}
	
	public void verificarEstado() {
		if(ligado) {
			System.out.println("O carro está ligado");
		}
		else {
			System.out.println("O carro está desligado");
		}
	}
	
	public void mostrarMarca() {
		System.out.println("A marca do carro é: " + marca);
	}
	
	public void mostrarModelo() {
		System.out.println("O modelo do carro é: " + modelo);
	}
	
	public void mostrarAno() {
		System.out.println("O ano do carro é: " + ano);
	}
	
	public void mostrarPreco() {
		System.out.println("O preço do carro é R$: " + preco);
	}
}
