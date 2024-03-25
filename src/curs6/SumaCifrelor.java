package curs6;

import java.util.Scanner;

public class SumaCifrelor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog sa introduci numarul");
		int numar= scan.nextInt();
		
	
			
			
		}
	
	
	public static void calculeazaSumaCifrelor(int numar) {
	
		int suma=0;
		while(numar !=0) {
			suma += numar % 10;
			numar /=10;
	
		}
		
		
		
		
		
	}

}
