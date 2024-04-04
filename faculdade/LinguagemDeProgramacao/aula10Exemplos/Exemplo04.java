package aula10Exemplos;

public class Exemplo04 {
	public static void main(String[] args) {
		//Atribuindo valores para uma array já criada
		
		//Uma array com 5 espaços tipo inteiro
		int[] numeroInteiro = new int[5];
		
		numeroInteiro[0] = 5; //Defini que o primeiro slot do meu array vale 5
		numeroInteiro[3] = 4; //Defini que o quarto slot do meu array vale 4
		
		//Definindo uma variavel e colocando o valor do 1º item do array nessa variável
		int valor01 = numeroInteiro[0];
		
		System.out.println(valor01);
		System.out.println(numeroInteiro[3]);		
	}
}
