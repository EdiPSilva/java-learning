package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Student student;
		
		String name;
		double grade1, grade2, grade3;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name student: ");
		name = sc.nextLine();
		System.out.println("Enter grades student (three values):");
		grade1 = sc.nextDouble();
		grade2 = sc.nextDouble();
		grade3 = sc.nextDouble();
		sc.close();
		
		student = new Student(name, grade1, grade2, grade3);
		System.out.println();
		System.out.print(student);
	}
}