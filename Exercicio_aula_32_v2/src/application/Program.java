package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String nameX = "X", nameY = "Y";
		
		Triangle x = new Triangle(nameX);
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the measures of triangle %s: ", nameX);
		x.setA(sc.nextDouble());
		x.setB(sc.nextDouble());
		x.setC(sc.nextDouble());		
		x.returnArea();
		
		Triangle y = new Triangle(nameY);
		System.out.printf("Enter the measures of triangle %s: ", nameY);
		y.setA(sc.nextDouble());
		y.setB(sc.nextDouble());
		y.setC(sc.nextDouble());		
		y.returnArea();
		sc.close();
		
		Triangle.compareArea(nameX, nameY, x.getArea(), y.getArea());
	}
}