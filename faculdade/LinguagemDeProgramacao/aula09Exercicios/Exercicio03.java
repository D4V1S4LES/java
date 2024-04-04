package aula09Exercicios;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		//Validar cidade = "Curitiba"
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o nome da sua Cidade: ");
		String cidade = leitor.next();
		
		//String cidadeCuritiba = "Curitiba";
		
		switch (cidade){
		
		case "Curitiba":
			System.out.println("A cidade é Curitiba!!");
			break;
		
		default:
			System.out.println("A cidade não é Curitiba");
			break;
		}
		
		leitor.close();
	}
}
