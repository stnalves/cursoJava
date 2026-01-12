package aulas;

import java.util.Scanner;

public class Entrada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char c;
		String x;
		int y;
		double z;

		c = sc.next().charAt(0);
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();

		System.out.println("Você digitou: ");
		System.out.println("O caractere: " + c);
		System.out.println("A palavra: " + x);
		System.out.println("O número inteiro: " + y);
		System.out.println("O número decimal: " + z);

		sc.close();
		
		/*
		 * - A entrada pode ser na mesma linha:
		 * Maria 30 4,5
		 */
	}
}
