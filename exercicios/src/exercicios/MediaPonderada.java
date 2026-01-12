package exercicios;

import java.util.Scanner;

public class MediaPonderada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double mediaPonderada = (a * 2 + b * 3 + c * 5) / (2 + 3 +5);
			
			System.out.printf("%.1f%n", mediaPonderada);
		}
		
		sc.close();
	}
}
