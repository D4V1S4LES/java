package aula09Exercicios;
import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		//Pegar 3 strings e mostrar a maior delas;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a primeira String: ");
		String texto01 = leitor.next();
		
		System.out.println("Digite a segunda String: ");
		String texto02 = leitor.next();
		
		System.out.println("Digite a terceira String: ");
		String texto03 = leitor.next();
		
		int tamanhoTexto01 = texto01.trim().length();
		int tamanhoTexto02 = texto02.trim().length();
		int tamanhoTexto03 = texto03.trim().length();
		
		if (tamanhoTexto01 > tamanhoTexto02 & tamanhoTexto01 > tamanhoTexto03) {
			System.out.println("O texto " + texto01 + " Tem " + tamanhoTexto01 + " caracteres");
		}
		
		if (tamanhoTexto02 > tamanhoTexto01 & tamanhoTexto02 > tamanhoTexto03) {
			System.out.println("O texto " + texto02 + " Tem " + tamanhoTexto02 + " caracteres");
		}
		
		if (tamanhoTexto03 > tamanhoTexto01 & tamanhoTexto03 > tamanhoTexto02) {
			System.out.println("O texto " + texto03 + " Tem " + tamanhoTexto03 + " caracteres");
		}
		
		leitor.close();
	}
}
