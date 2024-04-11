package aula12;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao;
		
		Carro exemplo = new Carro("Toyota", "Corola", 1999, 50000.00);
		
		do {
			System.out.println("\nMENU\n");
			System.out.println("1 - Ligar carro");
			System.out.println("2 - Desligar carro");
			System.out.println("3 - Verificar estado");
			System.out.println("4 - Verificar Marca");
			System.out.println("5 - Verificar Modelo");
			System.out.println("6 - Verificar Ano");
			System.out.println("7 - Mostrar Preço");
			
			System.out.println("\nEscolha uma opção: \n");
			opcao = leitor.nextInt();
			
			switch(opcao) {
			
			case 1:
				exemplo.ligar();
			break;
			
			case 2:
				exemplo.desligar();
			break;
			
			case 3:
				exemplo.verificarEstado();
			break;
			
			case 4:
				exemplo.mostrarMarca();
			break;
			
			case 5:
				exemplo.mostrarModelo();
			break;
			
			case 6:
				exemplo.mostrarAno();
			break;
			
			case 7:
				exemplo.mostrarPreco();
			break;
			
			default:
				System.out.println("\nOpção inválida\n");
			}
		}
		while(opcao != 0);
		
		leitor.close();
	}
}
