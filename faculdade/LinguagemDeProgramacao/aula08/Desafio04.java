package aula08;
import java.util.Scanner;

public class Desafio04 {
	public static void main(String[] args) {
		Scanner coxinha = new Scanner(System.in);
		
		System.out.println("Digite um número e descubra seu fatorial: ");
		int numero = coxinha.nextInt();
		
		int fatorial = 1;
		int contador = 1;
		
		while(contador <= numero) {
			fatorial *= contador;
			contador++;
		}

		System.out.println("O resultado é: " + fatorial);
		coxinha.close();
	}
}
