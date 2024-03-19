package curs5;

import java.util.Scanner;

public class CalculSuma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double suma=0;
		for(int i = 1; i<= 10; i++) {
			System.out.println("Please enter number" + i+ ":");
			double numar = scan.nextDouble();
			suma+=numar;
			
		}
		System.out.println("The sum of the numbers is : " + suma);
		
		
	}

}
