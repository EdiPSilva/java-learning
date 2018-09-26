package course;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desck";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.00;
		double measure = 53.234567;
		
		System.out.println("Products");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, conde %d and gender %s%n", age, code, gender);
		System.out.println();
		System.out.printf("Meause with eight decimal places: %f%n", measure);
		System.out.printf("Rouded (three decimal place): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Us decimal point: %.3f%n", measure);
	}
}