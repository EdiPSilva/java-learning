package entities;

import java.util.Random;

public class Account {
	
	public static final double TAX = 5.00;

	private int numberAccount = 0;
	private String name = "";
	private double balance = 0;
	
	/*public Account() {
		this.name = "";
		this.setBalance(0);
		setNumberAccount();
	}*/
	
	public Account(String name) {
		this.name = name;
		this.setBalance(0);
		setNumberAccount();
	}
	
	public Account(String name, double balance) {
		this.name = name;
		this.setBalance(balance);
		setNumberAccount();
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount() {
		Random random = new Random();
		this.numberAccount = random.nextInt(999999);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance += balance;
	}
	
	public void withdrawBalance(double withdraw) {
		balance = (balance - withdraw) - TAX;
	}
	
	public String toString () {
		return "Account: "+numberAccount+", Holder: "+name+", Balance: $"+String.format("%.2f", balance);
	}
}