import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		double valor, cotacao, resultado;
		
		System.out.println("Por favor, digite o valor da cota��o do dolar hoje:");
		cotacao = leitor.nextDouble();
		
		System.out.println("Por favor, digite o valor da doa��o em d�lares:");
		valor = leitor.nextDouble();
		
		resultado = valor*cotacao;
		
		System.out.println("O valor em reais foi de R$" + String.format("%.2f",resultado));
			
	}

}
