package curs4;

import java.util.Scanner;

public class CheckPunctaj {

	public static void main(String[] args) {
		int punctaj;
		Scanner scan =  new Scanner(System.in);
		System.out.println("Introduceti punctajul:");
		punctaj = scan.nextInt();
		String print = (punctaj > 90) ? "FB" : 
			(punctaj > 80) ? "B" : (punctaj < 80) ? "S":"Punctaj invalid";
		if(print == "FB") {
			System.out.println("Ai primit : Foarte Bine");
		}else if(print =="B") {
			System.out.println("Ai primit: Bine");
		}else {
			System.out.println("Ai primit : Suficient");
		}

	}

}
