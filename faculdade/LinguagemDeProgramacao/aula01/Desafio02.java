package aula01;
import java.util.Scanner;

public class Desafio02{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	//declarando a nota
		
		System.out.print("digite a nota: ");
		int nota = scanner.nextInt();
	
	if(nota >= 70 && nota < 90) {
		System.out.println("Aprovado");
	}
	
	else {
		if(nota >= 90)
		
		System.out.println("Parabéns");
		
		else { 
			System.out.println("reprovado");
		}
	scanner.close();

		}	
	}
}