package aulas;

import java.util.Locale;

public class Saida {
	public static void main(String[] args) {
		String prod1 = "Computador";
		String prod2 = "Mesa de escritório";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.00;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		/*
		 * printf
		 * 
		 * %s string
		 * %d int
		 * %f float
		 * %c char/double
		 * %n linha
		 */
		
		System.out.println("Produtos:");
		System.out.printf("%s, cujo preço é R$ %.2f%n", prod1, preco1);
		System.out.printf("%s, cujo preço é R$ %.2f%n", prod2, preco2);
		
		System.out.printf("%nRegistro: %d anos, código %d e gênero: %c%n%n", idade, codigo, genero);
		
		System.out.printf("Medida com oito casas decimais: %f%n", medida);
		System.out.printf("Arredondado (três casas decimais): %.3f%n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal US: %.3f%n", medida);
	}
}
