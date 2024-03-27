package aula08;

import java.util.Scanner;

public class Desafio03 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 7: ");
		
		int numero = scanner.nextInt();
		String diaSemana;
		
		switch (numero){
			case 1:
				diaSemana = "Domingo, fim de semana";
				break;
			
			case 2: 
				diaSemana = "Segunda-feira, dia útil";
				break;
			
			case 3: 
				diaSemana = "Terça-feira, dia útil";
				break;
			
			case 4: 
				diaSemana = "Quarta-feira, dia útil";
				break;
			
			case 5: 
				diaSemana = "Quinta-feira, dia útil";
				break;
			
			case 6: 
				diaSemana = "Sexta-feira, dia útil";
				break;
				
			case 7:
				diaSemana = "Sábado, fim de semana";
				break;
			
			default:
				diaSemana = "Dia inválido seu topera";
				break;
		}
		System.out.println("O dia da semana que corresponde ao número " + numero + " é " + diaSemana);		
		scanner.close();
	}	
}
