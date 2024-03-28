package curs8;

public class TestShape {

	public static void main(String[] args) {
		Square patrat = new Square("Galben","Patrat");
		System.out.println(patrat.culoare);
		System.out.println(patrat.nume);
		
		patrat.printDetails();
		System.out.println("-------------------");
		
		Square altPatrat = new Square(null, null);
		
		System.out.println(altPatrat.culoare);
		System.out.println(altPatrat.nume);

	}

}
