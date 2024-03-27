package aula08;
import java.util.Scanner;
import java.util.Random;

public class Desafio06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int numeroAleatorio = random.nextInt(5) + 1;
		
		int tentativa;

        System.out.println("Tente adivinhar o número secreto entre 1 e 100:");

        do {
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();

            if (tentativa > numeroAleatorio) {
                System.out.println("O número secreto é menor.");
            	} 
            
            else if (tentativa < numeroAleatorio) {
            	System.out.println("O número secreto é maior.");
            	} 
            
            else {
            		System.out.println("Cornoo!!! Você acertou o número secreto: " + numeroAleatorio);
            	}
            
        	} 
        	while (tentativa != numeroAleatorio);
        
        	scanner.close();
		}
		
	}
