package aula09Metodos;

public class Metodo09 {
	public static void main(String[] args) {
		//percorrendo uma sring usando loop
		
		String minhaString = "Exemplo de string";
		
		//Estou setando para ele percorrer e a string e pegar cada letra uma por vez usando char e mostrando na tela
		for (int i = 0 ; i < minhaString.length() ; i++) {
			char quantidadeCaractere = minhaString.charAt(i);
			System.out.println("A quantidade de caractere é: " + quantidadeCaractere);
		}
		//Estou pegando a quantidade numérica dos caracteres e mostrando o total
		System.out.println("\nA quatidade de caracteres total da string é: " + minhaString.length());
		
		//percorrendo uma Array
		
		String minhaString02 = "\nSegundo exemplo";
		
		for (char caractere : minhaString02.toCharArray()) {
			System.out.println(caractere);
		}
		System.out.println("\nA quatidade de caracteres total da string é: " + minhaString02.length());
	}
}
