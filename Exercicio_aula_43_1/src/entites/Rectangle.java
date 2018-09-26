package entites;

public class Rectangle {
	
	public double width = 0;
	public double height = 0;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		double x = Math.pow(width, 2);
		double y = Math.pow(height, 2);
		return Math.sqrt(x + y);
	}
}