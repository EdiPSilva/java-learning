package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		String[] entry;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		String out = "Higher = ";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter yours numbers (some line):");
		entry = sc.nextLine().split(" ");
		n1 = Integer.parseInt(entry[0]);
		n2 = Integer.parseInt(entry[1]);
		n3 = Integer.parseInt(entry[2]);
		
		if((n1 > n2) && (n1 > n3)) {
			out += n1;
		} else if((n2 > n1) && (n2 > n3)) {
			out += n2;
		} else {
			out += n3;
		}
		
		System.out.println(out);
		sc.close();
	}

}
