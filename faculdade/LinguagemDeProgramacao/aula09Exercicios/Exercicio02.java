package aula09Exercicios;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		//pegar primeiro nome maiúsculo
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nome = leitor.next();
		
		String[] separarNome = nome.split(" ");
		System.out.println("\nSeu primeiro nome é: " + separarNome[0].toUpperCase());
		
		leitor.close();		
	}
}
