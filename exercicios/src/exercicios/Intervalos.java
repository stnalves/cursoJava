package exercicios;

import java.util.Scanner;

public class Intervalos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if (valor  < 0 || valor > 100) {
			System.out.println("Fora de intervalo");
		} else if (valor <= 25) {
			System.out.println("Intevalo [0, 25]");
		} else if (valor <= 50) {
			System.out.println("Intevalo (25, 50]");
		} else if (valor <= 75) {
			System.out.println("Intevalo (50, 75]");
		} else {
			System.out.println("Intevalo (75, 100]");
		}
		
		sc.close();
	}
}
