package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		String name = "";
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name employee: ");
		name = sc.nextLine();
		System.out.println("Enter gross salary employee: ");
		employee.netSalary(sc.nextDouble());
		
		System.out.println("Employee: "+name+", $"+employee.grossSalary);
		System.out.println("Which percentage to increase salary?");
		employee.increaseSalary(sc.nextDouble());
		System.out.println("Update data: "+name+", $"+employee.grossSalary);
		sc.close();
	}
}