package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
	
		String name = "";
		double balance = 0;
		Account account;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account holder: ");
		name = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		String type = sc.nextLine();
		
		if(type.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();
			System.out.println();
			account = new Account(name, balance);
			System.out.println("Account data: ");
			System.out.println(account);
		} else {
			account = new Account(name);
			System.out.println("Account data: ");
			System.out.println(account);
		}
		
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		account.setBalance(sc.nextDouble());
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		account.withdrawBalance(sc.nextDouble());
		System.out.println("Update account data: ");
		System.out.println(account);
		sc.close();
	}
}