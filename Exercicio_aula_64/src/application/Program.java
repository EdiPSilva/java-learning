package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] rooms = new Room[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Rent #"+(i+1)+":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			rooms[room] = new Room(name, email);
		}
		
		sc.close();
		
		System.out.println();
		System.out.println("Busy rooms");
		for (int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.println(i+": "+rooms[i]);
			}
		}
	}
}