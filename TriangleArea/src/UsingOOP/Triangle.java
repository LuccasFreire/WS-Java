package UsingOOP;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	// double p = (x.a + x.b + x.c) / 2.0;
	// double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
	public double calculateArea() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
				
	}
}
