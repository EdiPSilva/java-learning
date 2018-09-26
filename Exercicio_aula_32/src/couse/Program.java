package couse;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		int values = 0;
		
		while(n < 1) {
			System.out.print("N must be positive! Try again: ");
			n = sc.nextInt();
		}
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Value #"+i+":");
			int aux = sc.nextInt();
			if(aux > values) {
				values = aux;
			}
		}
		
		System.out.println("Hight = "+values);
		
		sc.close();
	}
}