package aula09Metodos;

public class Metodo08 {
	public static void main(String[] args) { 
		//operadores de string
		
		String string01 = "Olá";
		String string02 = "Mundo";
		
		String concatenar = string01 + string02;
		System.out.println(concatenar);
		
		//Além do operador +, temos ==, !=, >=, porém estamos validando referencias e não os valores, aconselhado usar equals().
	}
}
