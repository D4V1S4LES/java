package aula07;
import java.util.Scanner;

public class Desafio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua altura (Em metros): ");
		double altura = scanner.nextDouble(); 
		
		System.out.println("Digite seu sexo (m) ou (f): ");
		char sexo = scanner.next().charAt(0);
		
		System.out.println(sexo);
		
		double pesoIdeal = 0; 
		
		if (sexo == 'm') {
			pesoIdeal = ( 72.7 * altura ) - 58;
			System.out.println(pesoIdeal);
		}
		
		if (sexo == 'f') {
			pesoIdeal = ( 62.1 * altura ) - 44.7;
			System.out.println(pesoIdeal);
		}
		
		if (pesoIdeal <= 0) {
			System.out.println("Sexo inválido!");
		}
		scanner.close();
	}
}
