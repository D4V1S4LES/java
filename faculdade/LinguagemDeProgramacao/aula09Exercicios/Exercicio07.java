package aula09Exercicios;

public class Exercicio07 {
	public static void main(String[] args) {
		//imprimir string, imprimir sem espaços inicio e fim, imprimir com 1 espaço no meio;
		
		String texto = "teste 123";
	    
		//Imprimir string
		System.out.println("String original: " + texto);
		
		//Imprimir string sem espaços incio e fim
		System.out.println("\nString sem espaços sobrando: " + texto.trim() );
		
		//Imprimir com apenas 1 espaço no meio
		
		texto = texto.replaceAll("\\s+", " ");
		System.out.println("\n" + texto);
		
		//String[] textoCom1Espaco = texto.split(" ");
		//for (String textoJunto : textoCom1Espaco) {
		//	System.out.println(textoJunto);
		//}
	}
}
