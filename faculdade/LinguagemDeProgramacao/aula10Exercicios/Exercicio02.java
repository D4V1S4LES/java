package aula10Exercicios;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		//leia 3 nomes de alunos, suas notas do 1º e 2º bimestre, calcule a média e mostre ao aldo do nome
		
		Scanner leitor = new Scanner(System.in);

        // Array para armazenar os nomes dos alunos
        String[] nomes = new String[3];

        // Array para armazenar as médias dos alunos
        double[] medias = new double[3];

        // Solicita os nomes dos alunos e suas notas para cada bimestre
        for (int i = 0; i < 3; i++) {
            System.out.println("Aluno " + (i+1));
            System.out.print("Nome: ");
            nomes[i] = leitor.nextLine();

            System.out.print("Nota do 1º bimestre: ");
            double nota1 = leitor.nextDouble();

            System.out.print("Nota do 2º bimestre: ");
            double nota2 = leitor.nextDouble();

            // Calcula a média e armazena no array de médias
            medias[i] = (nota1 + nota2) / 2;

            // Limpa o scanner
            leitor.nextLine();
        }

        // Mostra os nomes dos alunos e suas respectivas médias
        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i] + ": " + medias[i]);
        }

        leitor.close();
	}
}
