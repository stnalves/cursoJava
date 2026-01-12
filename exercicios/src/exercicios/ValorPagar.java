package exercicios;

import java.util.Scanner;

public class ValorPagar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qnt1, qnt2;
		double preco1, preco2, total;
		
		cod1 = sc.nextInt();
		qnt1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qnt2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total = qnt1 * preco1 + qnt2 * preco2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}
}
