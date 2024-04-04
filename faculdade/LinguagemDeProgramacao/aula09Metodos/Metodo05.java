package aula09Metodos;

public class Metodo05 {
	public static void main(String[] args) {
		String minhaString = "Maça,Banana,Cereija,Damasco";
		
			String[] parteString = minhaString.split(",");
			
			//for (String parte : parteString) {
			//	System.out.println("A lista completa é: " + parte);
			//}
			
			System.out.println("O primeiro item é: " + parteString[0]);
	}
}
