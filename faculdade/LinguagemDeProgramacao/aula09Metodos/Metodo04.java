package aula09Metodos;

public class Metodo04 {
	public static void main(String[] args) {
		String minhaString = "Texto aleatório";
		String stringMaiuscula = minhaString.toUpperCase();//Texto em maiúsculo
		String stringMinuscula = minhaString.toLowerCase();//Tetxo em minúsculo
		
		System.out.println("String original: " + minhaString);
		System.out.println("String maiúscula: " + stringMaiuscula);
		System.out.println("String minúscula: " + stringMinuscula);
	}
}
