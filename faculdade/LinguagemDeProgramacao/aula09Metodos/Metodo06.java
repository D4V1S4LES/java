package aula09Metodos;

public class Metodo06 {
	public static void main(String[] args) {
		//comparação de string idêntica e prefixo e sufixo;
		
		String string01 = "Naruto Shippuden";
		String string02 = "Pokemon";
		String string03 = "Naruto Shippuden";
		
		//método equalsIgnoreCase() verifica se duas strings são iguais
		
		boolean verificarStringIgual = string01.equalsIgnoreCase(string02);//Verificando se a 1 e a 2 são iguais
		System.out.println("A string 1 é igual a string 2?: " + verificarStringIgual);
		
		//método startsWith() e endsWith() verifica se a primera palavra ou a última são iguais
		
		boolean comecaComNaruto = string01.startsWith(string02); //Verifica se a string 2 começa com a pallavra da string 1
		boolean terminaComShippuden = string01.endsWith(string03);//Verifica se a string 3 termia com a última palavra da string 1
		
		System.out.println("A string 2 começa com naruto?: " + comecaComNaruto);
		System.out.println("A string 3 termina com Shippuden?: " + terminaComShippuden);
	}
}
