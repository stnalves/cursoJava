package exercicios;

import java.util.Scanner;

public class Conta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int qnt  = sc.nextInt();
		
		double total;
		
		if (codigo == 1) {
			total = qnt * 4;
		} else if (codigo == 2) {
			total = qnt * 4.5;
		} else if (codigo == 3) {
			total = qnt * 5;
		} else if (codigo == 4) {
			total = qnt * 2; 
		} else {
			total = qnt * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();
	}
}
