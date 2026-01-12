package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Triangle x, y; 
		 * x = new Triangle(); 
		 * y = new Triangle(); 
		 * 
		 * x.a = sc.nextDouble(); 
		 * x.b = sc.nextDouble(); 
		 * x.c = sc.nextDouble(); 
		 * 
		 * y.a = sc.nextDouble(); 
		 * y.b = sc.nextDouble(); 
		 * y.c = sc.nextDouble();
		 */
		
		double aX, bX, cX, aY, bY, cY;
		
		System.out.println("Enter the measures of triangle X:");
		aX = sc.nextDouble();
		bX = sc.nextDouble();
		cX = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y:");
		aY = sc.nextDouble();
		bY = sc.nextDouble();
		cY = sc.nextDouble();
		
		Triangle x = new Triangle(aX, bX, cX);
		Triangle y = new Triangle(aY, bY, cY);
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		System.out.println("Larger area: " + largerArea(areaX, areaY));
		
		sc.close();
	}
	
	private static String largerArea(double area1, double area2) {
		if (area1 > area2) {
			return "X";
		} return "Y";
	}
}
