package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		System.out.println();
		for(int i = 1; i <= n; i++) {
			System.out.print("Product #"+i+" data:");
			System.out.println();
			System.out.print("Common, used or imported (c/u/i)? ");
			char c = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			Product product;
			
			if(c == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				product = new ImportProduct(name, price, customsFee);
				list.add(product);
				
			} else if (c == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String manufactureDate = sc.nextLine();
				product = new UsedProduct(name, price, manufactureDate);
				list.add(product);
				
			} else {
				product = new Product(name, price);
				list.add(product);
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product l : list) {
			System.out.println(l.priceTag());
		}
		
		sc.close();
	}
}