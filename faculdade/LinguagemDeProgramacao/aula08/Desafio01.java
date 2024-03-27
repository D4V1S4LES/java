package aula08;
import java.util.Scanner;

public class Desafio01 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
		if (numero < 0) {
			System.out.println("O número é negativo");
		}
		
		if (numero == 0) {
			System.out.println("O número é zero");
		}
		
		if (numero > 0) {
			System.out.println("O númmero é positivo");
		}
		scanner.close();
	}
}
