package Lab2.Bai04;

class Roots{
	public double x1;
	public double x2;
}
public class SquareEquation {
//	private double a, b, c;
//
//	public SquareEquation(double a, double b, double c) {
//		super();
//		this.a = a;
//		this.b = b;
//		this.c = c;
//	}
//
//	public SquareEquation() {
//		
//	}
//


//	public Roots Solution() {
//		double d = b*b - 4*a*c;
//		if(d<0) 
//			throw new ArithmeticException("Solution has no roots.");
//		Roots result = new Roots();
//		result.x1= (-b - Math.sqrt(d) / (2*a));
//		result.x1= (-b + Math.sqrt(d) / (2*a));
//		return result;
//	}
	public double Solution(double a, double b, double c) {
		double d = b*b - 4*a*c; 
		Roots result = new Roots();
		result.x1= (-b - Math.sqrt(d) / (2*a));
		result.x2= (-b + Math.sqrt(d) / (2*a));
		return d;
	}
}
