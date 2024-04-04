package aula10Exercicios;

public class Exercicio01 {
	public static void main(String[] args) {
		//Crie array com 5 inteiros e calcule a soma de todos eles
		
		int[] numeroInteiro = {1,2,3,4,5};
		
		int soma = numeroInteiro[0] + numeroInteiro[1] + numeroInteiro[2] + numeroInteiro[3] + numeroInteiro[4];
		System.out.println(soma);
		
		int soma2 = 0;
		
		
		
		for (int numero : numeroInteiro) {
			soma2 += numero;
		}
		System.out.println(soma2);
		
		
		//for (int i = 0; i < numeroInteiro.length; i++) {
		//	int soma = i + i;
		//	System.out.println(numeroInteiro[i]);
		//}
	}
}
