package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public String toString() {
		return "Area: " + String.format("%.2f ", calculateArea()) + " Perimeter: " + String.format("%.2f ",calculatePerimeter()) + "Diagonal: " + String.format("%.2f ", calculateDiagonal());
		//return "Area: " + calculateArea() + " Perimeter: " + calculatePerimeter() + "Diagonal: " + calculateDiagonal();
	}
	public double calculateArea() {
		return width * height;
	}
	public double calculatePerimeter() {
		return 2 * (width + height);
	}
	public double calculateDiagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

}
