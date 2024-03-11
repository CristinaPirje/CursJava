package curs3;

import java.util.Scanner;

/* program care citeste un numar de la tastatura 
 * si verifica daca este zi lucratoare sau weekend
 * Ex: citeste 1-->Its a working day
 * citeste 7--> Its weekend
 * citeste 9--> Invalid day
 */

public class CheckWorkingDay {
	int zi;
	
	public void askTheUserForADay() {
		System.out.println("Please enter a day:");
		
		Scanner scan = new Scanner(System.in);
		zi = scan.nextInt();
		
	}
	
	public void checkDay() {
		askTheUserForADay();
		
		//&&--> AND
		// ||--> OR
		if(zi >=1 && zi <= 5) {
			System.out.println("Its a working day");
			
		} else if(zi == 6 || zi ==7) {
			System.out.println("Its weekend");
			
		}
		else {
			System.out.println("Invalid number for the day!");
		}
	}

}
