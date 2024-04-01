package curs9;

public class OverLoadExample {

	public static void main(String[] args) {
		System.out.println(multiply (2,3));
		System.out.println(multiply (2,5.5));
		System.out.println(123);
		System.out.println("123");
		System.out.println('x');
		System.out.println(true);
		
		
		
		

	}
	public static int multiply(int a, int b) {
		return a*b;
		
	}
	public static double multiply(double a, double b) {
		return a*b;
		
	}

}
