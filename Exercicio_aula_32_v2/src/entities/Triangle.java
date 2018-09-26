package entities;

public class Triangle {
	
	private double a = 0;
	private double b = 0;
	private double c = 0;
	private double area = 0;
	private String name = "";
	
	public Triangle(String name) { this.setName(name); }
	
	private void setName(String name) { this.name = name; }
	public void setA(double a) { this.a = a; }
	public void setB(double b) { this.b = b; }
	public void setC(double c) { this.c = c; }
	
	/*private double getA() { return this.a; }
	private double getB() { return this.b; }
	private double getC() { return this.c; }*/
	
	private void setArea() {
		double p = (a + b + c) / 2.0;
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	public void returnArea() {
		this.setArea();
		System.out.printf("Triangle %s area: %.1f", name, area);
		System.out.println();
	}
	
	public double getArea() {		
		if(area == 0) this.setArea();
		return area;
	}
	
	public static void compareArea(String name1, String name2, double area1, double area2 ) {
		if(area1 > area2) {
			System.out.printf("Larger area: %s", name1);
			System.out.println(" ");
		} else {
			System.out.printf("Larger area: %s", name2);
			System.out.println(" ");
		}
	}
}