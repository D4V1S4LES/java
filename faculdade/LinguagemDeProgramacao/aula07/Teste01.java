package aula07;

public class Teste01 {
	public static void main(String[] args) {
		int numero = 4;
		String resultado;
		
		switch (numero) {
		
		case 1:
			resultado = "Um";
			break;
			
		case 2:
			resultado = "Dois";
			break;
			
		case 3:
			resultado = "Três";
			break;
			
		default:
			resultado = "Outro número";
			break;
		}
		resultado = (numero > 0 && numero <= 3) ? resultado.toUpperCase() : resultado;
		System.out.println("Resultado: " + resultado.toUpperCase());
	}
}
