package curs7;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		String [] textArray= new String[5];
		System.out.println(textArray[0]);
		textArray[0]="This";
		System.out.println(textArray[0]);
		System.out.println(textArray[1]);
		textArray[1]=" is ";
		System.out.println(textArray[1]);
		textArray[2]="an ";
		System.out.println(textArray[2]);
		textArray[3]="array ";
		System.out.println(textArray[3]);
		textArray[4]="! ";
		System.out.println(textArray[4]);
		System.out.println(Arrays.toString(textArray));
		System.out.println(textArray.length);
		
		for (int i= 0; i<textArray.length; i++) {
			System.out.print(textArray[i]);
		}
		
	}

}
