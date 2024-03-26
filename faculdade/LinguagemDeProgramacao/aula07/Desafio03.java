package aula07;
import java.util.Scanner;

public class Desafio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Primeiro número: ");
		double n1 = scanner.nextDouble();
		
		System.out.println("Segundo número");
		double n2 = scanner.nextDouble();
		
		System.out.println("Digite a operação: ");
		String operacao = scanner.next();
		
		double resultado = 0;
		
		switch (operacao) {
		
		case "+":
			resultado = n1 + n2;
			System.out.println("O resultado é: " + resultado);
			break;
			
		case "-":
			resultado = n1 - n2;
			System.out.println("O resultado é: " + resultado);
			break;
			
		case "*":
			resultado = n1 * n2;
			System.out.println("O resultado é: " + resultado);
			break;
			
		case "/":
			resultado = n1 / n2;
			System.out.println("O resultado é: " + resultado);
			break;
			
		default:
			System.out.println("VAGABUNDO");
		}
		scanner.close();
	}
}
