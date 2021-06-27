import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		int qtdKmInicio, qtdKmTermino, qtdCombustivel;
		int mediaKm;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("CALCULADORA DE COMSUMO");
		System.out.println("Por favor, digite o número de quilometros apresentado no painel no início da viagem:");
		qtdKmInicio = leitor.nextInt();
		
		System.out.println("Por favor, digite a o número de quilometros apresentado no painel no término da viagem: ");
		qtdKmTermino = leitor.nextInt();
		
		System.out.println("Por favor, digite a quantidade de combustivel abastecido após a viagem:");
		qtdCombustivel = leitor.nextInt();
		
		mediaKm = (qtdKmTermino - qtdKmInicio) / qtdCombustivel;
		
		System.out.println("A média de quilometros por litro foi de: " + mediaKm + " Km/l");
		
		leitor.close();
	}

}
