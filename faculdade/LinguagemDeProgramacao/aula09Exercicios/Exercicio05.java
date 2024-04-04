package aula09Exercicios;
import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		//Pegar duas notas e mostrar média com 2 casas decimais.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Primeira nota: ");
		double nota01 = leitor.nextDouble();
		
		System.out.println("Segunda nota: ");
		double nota02 = leitor.nextDouble();
		
		double media = (nota01 + nota02) / 2;
		String mediaCorrigida = String.format("A média é %.2f", media);
		
		System.out.println(mediaCorrigida);
		
		leitor.close();
	}
}
