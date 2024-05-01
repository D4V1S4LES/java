package main;
import model.Carro;
import model.Moto;

public class Main {
	public static void main(String[] args) {
		
		Carro carro = new Carro("Ford", "Mustang", 4);
		System.out.println("Marca: " + carro.getMarca() + "\nModelo: " + carro.getModelo() 
		+ "\nNumero de portas: " + carro.getnumeroPortas());
		
		Moto moto = new Moto("Honda", "CB 500F", 471);
		System.out.println("\nMarca: " + moto.getMarca() + "\nModelo: " + moto.getModelo()
		+ "\nCilindragem: " + moto.getCilindrada());
	}
}
