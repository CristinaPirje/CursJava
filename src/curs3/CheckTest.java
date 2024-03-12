package curs3;

import java.util.Scanner;

public class CheckTest {
	
	int punctaj;

public void askTheUserForAScore() {
	System.out.println("Please enter the test score:");
	
	Scanner scan = new Scanner(System.in);
	punctaj = scan.nextInt();
		
}
public void checkScore() {
	askTheUserForAScore();
	
	
	if(punctaj >=0 && punctaj <= 65) {
		System.out.println("Ai picat. Mai incearca");
		
	} else if(punctaj >= 66 && punctaj <=100) {
		System.out.println("Felicitari! Ai trecut");
		
	}
	else {
		System.out.println("Punctaj invalid");
	}

}


}

