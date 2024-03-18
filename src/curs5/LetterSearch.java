package curs5;

import java.util.Scanner;

/* facem un program care citeste de la tastatura 
 * si cauta in textul respectiv litera A
 * daca o gasim, printam : litera A exista in text
 * Daca nu o gasim, printam : litera A nu exista in text
 */

public class LetterSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a text:");
		String text = scan.next();
		//text==radar   radar.tength()
		//boolean existaA = false;
		int counter=0;
		
		for (int i=0;i< text.length();i++) {
			//System.out.println(text.charAt(i));
			if(text.charAt(i)== 'a') {
				//System.out.println("Litera A exista in text");
				//existaA=true;
				counter++;
				//break;
				
			}
			
			
		}
		if(counter > 0) {
			System.out.println("Litera A exista in text de" + counter + "ori");
			
		}else {
			System.out.println("Litera A nu exista in text");
			
		}
	}

}
