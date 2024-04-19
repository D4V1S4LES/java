package aula12;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	
	public List<Item> itens = new ArrayList<>();
	Scanner tito = new Scanner(System.in);
	
	//Método iniciar
	public void iniciar() {
		boolean executar = true;
		
		while(executar) {
			System.out.println("\nEscolha uma opção");
			System.out.println("1- Cadastrar Item");
			System.out.println("2 - Listar Item");
			System.out.println("3- Sair");
			System.out.println("\nDigite sua opção: ");
			int opcao = tito.nextInt(); //Lendo um número inteiro
			tito.nextLine();//Lendo qualquer coisa que o usuário digitar
			
			switch(opcao) {
			
			case 1:
				cadastrarItem();
				break;
				
			case 2:
				listarItem();
				break;
				
			case 3:
				executar = false;
				break;
				
			default:
				System.out.println("Opcão inválida");
			}
		}
	}
	
	//Método cadastrar Item
	public void cadastrarItem() {
			System.out.println("Nome do item: ");
			String joy = tito.nextLine();
			
			System.out.println("Quantidade do item: ");
			int quantidade = tito.nextInt();
			
			System.out.println("Preço do item: ");
			double preco = tito.nextDouble();
			
			Item toperaItem = new Item(joy, quantidade, preco);
			itens.add(toperaItem);
	}
	
	//Método Listar itens
	public void listarItem() {
		if(itens.isEmpty()) {
			System.out.println("Nenhum item cadastrado");
		}
		else {
			for(Item toperaItem: itens) {
				System.out.println(toperaItem);
			}
		}
	}
}
