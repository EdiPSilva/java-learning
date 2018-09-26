package entities;

public class Student {
	
	public String name = "";
	public double grade1 = 0;
	public double grade2 = 0;
	public double grade3 = 0;
	
	public Student(String name, double grade1, double grade2, double grade3) {
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
	}
	
	public double finalGrade () {
		return grade1 + grade2 + grade3;
	}
	
	public String toString() {
		double finalGrade = this.finalGrade();
		String value = "Final grade = ";
		
		if(finalGrade > 60) {
			value += finalGrade+"\nPass";
		} else {
			value += finalGrade+"\nFiled\nMissing "+(String.format("%.2f", 60 - finalGrade))+" points";
		}
		return value;
	}
}