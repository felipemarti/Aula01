import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		int qtdKmInicio, qtdKmTermino, qtdCombustivel;
		int mediaKm;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("CALCULADORA DE COMSUMO");
		System.out.println("Por favor, digite o n�mero de quilometros apresentado no painel no in�cio da viagem:");
		qtdKmInicio = leitor.nextInt();
		
		System.out.println("Por favor, digite a o n�mero de quilometros apresentado no painel no t�rmino da viagem: ");
		qtdKmTermino = leitor.nextInt();
		
		System.out.println("Por favor, digite a quantidade de combustivel abastecido ap�s a viagem:");
		qtdCombustivel = leitor.nextInt();
		
		mediaKm = (qtdKmTermino - qtdKmInicio) / qtdCombustivel;
		
		System.out.println("A m�dia de quilometros por litro foi de: " + mediaKm + " Km/l");
		
		leitor.close();
	}

}
