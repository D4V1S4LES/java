package aula11;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Radio radio = new Radio();
		Scanner scanner = new Scanner(System.in);
		
		for (;;) {
			System.out.println("\nMenu");
			System.out.println("1. Ligar rádio");
			System.out.println("2. Desligar rádio");
			System.out.println("3. Aumentar volume");
			System.out.println("4. Diminuir volume");
			System.out.println("5. Sair do programa");
			System.out.println("\nEscolha uma opção: ");
			int opcao = scanner.nextInt();
			
			switch (opcao){
			case 1:
				radio.ligar();
				break;
			
			case 2:
				radio.desligar();
				break;
				
			case 3:
				radio.aumentarVolume();
				break;
				
			case 4:
				radio.diminuirVolume();
				break;
				
			case 5:
				System.out.println("Encerrando programa...");
				scanner.close();
				System.exit(0);
				
			default:
				System.out.println("Oopção inválida. Tente novamente");
				break;
			}
		}
	}
}
