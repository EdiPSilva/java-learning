package entities;

public class Employee {
	
	public String name = "";
	public double grossSalary = 0;
	public double tax = 1000;
	
	public void netSalary(double salary) {
		grossSalary = salary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100;
	}
}