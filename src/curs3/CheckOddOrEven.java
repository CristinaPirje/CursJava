package curs3;

import java.util.Scanner;

public class CheckOddOrEven {
	
	int numar;
	
	public void askTheUserForANumber() {
		System.out.println("Please enter a number:");
		
		Scanner scan = new Scanner(System.in);
		numar = scan.nextInt();
		
	}
	public void checkNumberIsOddOrEven() {
		
		if(numar % 2 == 0) {
			
		System.out.println("Number is even!");	
			
		}else {
			
			System.out.println("Number is odd!");
			
		}
		}
		
		
	}


