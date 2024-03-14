package curs4;

import java.util.Scanner;

public class RescriereProgram {

	public static void main(String[] args) {
		int comision;
		int vanzari;
		Scanner scan =  new Scanner(System.in);
		System.out.println("Introduceti valoarea vanzarii :");
		vanzari = scan.nextInt();
		if(vanzari > 2500) {
			comision = vanzari * 5/100;
			System.out.println("Comisionul tau este:" + comision);
		}else {
			comision = 0;
			System.out.println("Comisionul tau este:" + comision);
		}
		
		
		
	}

}
