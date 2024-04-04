package aula09Metodos;

public class Metodo03 {
	public static void main(String[] args) {
		//Procurar e substituir uma string;
		
		String minhaString = "Exemplo de string";
		int indice = minhaString.indexOf("string");// tem que retornar o número da posição da palavra
		int indice2 = minhaString.indexOf("Java");// tem que retornar -1 por não achar
		
		System.out.println("String original: " + minhaString);
		System.out.println("Posição do indice 1: " + indice);
		System.out.println("Posição do indice 2: " + indice2);
		
		String stringAntiga = "Essa é a string antiga";
		String stringNova = stringAntiga.replace('a' , 'X');
		
		System.out.println("A string antiga: " + stringAntiga);
		System.out.println("A string nova: " + stringNova);
	}
}
