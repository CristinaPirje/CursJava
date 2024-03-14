package curs4;

import java.util.Scanner;

public class CheckFactura {

	public static void main(String[] args) {
		int factura;
		Scanner scan =  new Scanner(System.in);
		System.out.println("Introduceti valoarea facturii :");
		factura = scan.nextInt();
		double discount = factura > 100 ? 0.1 : 0.05;
		double valoareFactura = factura - (factura * discount);
		System.out.println("Valoarea facturii dupa aplicarea discountului este :" + valoareFactura);
		
	}

}
