package aula09Metodos;

public class Exemplo01 {
	public static void main(String[] args) {
		String strOriginal = "Hello";
		
		String strConcatenada = strOriginal + "World";
		String strMaiuscula = strOriginal.toUpperCase();
		
		System.out.println("String original: " + strOriginal);
		System.out.println("String concatenada: " + strConcatenada);
		System.out.println("String maiúscula: " + strMaiuscula);
		
		System.out.println("String original após a manipulação: " + strOriginal);
	}
}
