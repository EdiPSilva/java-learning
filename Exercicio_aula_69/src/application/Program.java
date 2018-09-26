package application;

//import java.awt.List;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Employee> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		if(n > 0) {
			for(int i = 1; i <= n; i++) {
				System.out.println("Employee #"+i);
				System.out.print("Id: ");
				int id = sc.nextInt();
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Salary: ");
				double salary = sc.nextDouble();
				
				list.add(new Employee(id, name, salary));
				System.out.println();
			}
			
			System.out.print("Enter the employee id that will have salary increase :");
			int id = sc.nextInt();
			Employee results = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			if (results == null) {
				System.out.println("This id does not exist!");
			} else {
				System.out.print("Enter the percentage: ");
				double percent = sc.nextDouble();
				results.increaseSalary(percent);
			}
			
			System.out.println();
			System.out.println("List of employees: ");
			for (Employee employee : list) {
				System.out.println(employee);
			}
			
		} else {
			System.out.print("No employees will be registered");
		}
		
		sc.close();
	}
}