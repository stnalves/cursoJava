package aulas;

import java.util.Scanner;

public class Operadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		double valor = 50;
		
		if (minutos > 100) {
			valor += (minutos - 100) * 2;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f", valor);
		
		sc.close();
	}
}
