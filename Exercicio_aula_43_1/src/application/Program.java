package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		sc.close();
		
		System.out.println("Area: "+rectangle.area());
		System.out.println("Perimeter: "+rectangle.perimeter());
		System.out.println("Diagonal: "+rectangle.diagonal());
	}
}