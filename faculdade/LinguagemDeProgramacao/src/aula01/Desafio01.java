package aula01;
import java.util.Scanner;

public class Desafio01 {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome da pessoa: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite o signo de " + nome + ": ");
		String signo = scanner.nextLine();
		
		System.out.print ("Digite a idade de " + nome + ": ");
		int idade = scanner.nextInt();
		
		
		
		System.out.println(nome + " tem " + idade + " ano(s)," + " e seu signo é " + signo);
	
		scanner.close();
	}
}
	