package curs6;

import java.util.Scanner;

/*facem un program care calculeaza salariul pe o saptamana
 * intrebal userul cate ore a lucrat
 * calculam doar daca a lucrat minim o ora sau maxim 40 de ore
 * daca introduce numar invalid il rugam sa introduca numar valid de ore
 * 
 */
public class CalculSalariuSaptamanal {

	public static void main(String[] args) {
		int ratePerHour= 25;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introdu numarul de ore lucrate :");
		int nrOreLucrate= scan.nextInt();
		
		while(nrOreLucrate <1 || nrOreLucrate>40) {
			System.out.println("Numar invalid de ore. Introdu un numar intre 1 si 40");
			System.out.println("Introdu nr de ore valid");
			nrOreLucrate= scan.nextInt();
	
			
		}
		int salariu = nrOreLucrate *ratePerHour;
		System.out.println("Salariul tau este :" + salariu);
		
	}

}
