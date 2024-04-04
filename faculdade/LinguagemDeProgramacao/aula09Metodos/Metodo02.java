package aula09Metodos;

public class Metodo02 {
	public static void main(String[] args) {
		//Acessando caractere em uma string;
		
		String minhaString = "Exemplo";
		
		char primeiroCaractere = minhaString.charAt(0);//Primeiro caractere
		char terceiroCaractere = minhaString.charAt(3);//Terceiro caractere
		
		System.out.println("String original: " + minhaString);
		System.out.println("Primeiro caractere: " + primeiroCaractere);
		System.out.println("Terceiro caractere: " + terceiroCaractere);
	}
}
