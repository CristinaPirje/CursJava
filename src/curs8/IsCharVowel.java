package curs8;
/* Facem un program care cere o litera si verifica daca este vocala sau consoana
 * rezolvare cu switch
 * Citim litera de la tastatura
 * 
 */

import java.util.Scanner;

public class IsCharVowel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu o litera");
		char litera= scan.next().charAt(0);
		//aeiouAEIOU
		switch(litera) {
		
		case 'a':
		case'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':	
		case 'O':	
		case 'u':
		case 'U': System.out.println("Este vocala!");
		break;
		default :System.out.println("Nu este vocala");
	}
		
		System.out.println("--------------------------");
		
		
		switch(litera) {
		case 'a','A','e','E','i','I','o','O','u','U'->System.out.println("Este vocala!");
		default -> System.out.println("Nu este vocala!");
		}

}
}
