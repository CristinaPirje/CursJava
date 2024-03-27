package curs7;

import java.util.Scanner;

public class CheckPin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String pindefault="2244";
		int max_attempts=3;
		int attempts=0;
		
			while(attempts < max_attempts) {
				System.out.println("Introdu PIN");
			String pin = scan.next();
			
			
			if(pin.equals(pindefault)) {
				System.out.println("Acces granted");
				return;
				
			}else {
				attempts++;
				System.out.println("Wrong PIN");
			}
			}
			System.out.println("Maximum attempts reached. Card blocked");
	}
		
		
		


	}



