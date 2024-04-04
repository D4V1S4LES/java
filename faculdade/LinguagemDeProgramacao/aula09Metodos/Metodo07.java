package aula09Metodos;

public class Metodo07 {
	public static void main(String[] args) {
		//Formatação de string
		
		//Podemos usar .format() para formatar strings sendo: %s (Strings), %d (Inteiros) %f (Flutuantes)
		
		String nome = "Davi";
		int idade = 19;
		
		String mensagem = String.format("Olá, meu nome é %s e eu tenho %d anos", nome, idade);
		System.out.println(mensagem);
		
		//Formatando usando números decimais e flutuantes
		
		double valorAleatorio = 235.4567;
		String valorFormatado = String.format("O valor é %.2f", valorAleatorio);//Setamos 2 números depois da vírgula
		System.out.println(valorFormatado);
		
		//Removendo espaços no início e fim
		
		String texto = "     texto aleatório     ";
		String textoTrimmed =  texto.trim();
		System.out.println("\nTexto original: " + texto + "\ntexto sem os espaços iniciais e finais: " + textoTrimmed);
	}
}
