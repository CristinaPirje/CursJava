package curs5;

import java.util.Scanner;

public class ProgramConversie {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Cate temperaturi vrei sa transformi?");
		int numar= scan.nextInt();
		double F;
		for(int i = 1; i<= numar; i++) {
			System.out.println("Te rog sa introduci temperatura" + i + ":");
			double C = scan.nextDouble();
			F =(C*1.8)+32;
			System.out.println("Temperatura Celsius de " + C+ " grade este in Farenheit "+F+" grade " );

	}

}
}
