package course;

import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		String fullName = "";
		int quantityBedrooms = 0;
		double productPrice = 0;
		String[] info;
		String lastName = "";
		int age = 0;
		double height = 0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Enter your full name.");
		fullName = sc.nextLine();
		System.out.println(fullName);
		
		System.out.println("-----------------------");
		System.out.println("How many bedrooms are there in your house?");
		quantityBedrooms = sc.nextInt();
		System.out.println(quantityBedrooms);
		
		System.out.println("-----------------------");
		System.out.println("Enter product price:");
		productPrice = sc.nextDouble();
		System.out.println(productPrice);*/
		
		System.out.println("-----------------------");
		System.out.println("Enter your last name, age and height (same line):");
		info = sc.nextLine().split(" ");
		lastName = info[0];
		age = Integer.parseInt(info[1]);
		height = Double.parseDouble(info[2]);
		System.out.printf("%s%n%d%n%.2f", lastName, age, height);
		sc.close();
	}

}
