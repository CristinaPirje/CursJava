package curs6;

import java.util.Scanner;

/*simulam o retragere de la un bancomat. 
 * avem un sold initial (1500)
 * intreb userul cat vrea sa retraga si verific daca suma nu este mai mare decat soldul
 * daca suma este mai mare ii printez fonduri insuficiente si il rog sa incerce din nou
 * 
 * 
 */

public class RetragereAtm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sold = 1500;
		System.out.println("Introduceti suma pe care doriti sa o retrageti");
		int suma= scan.nextInt();
		while(suma > sold || suma<=0) {
			if (suma >sold) {
				System.out.println("Fonduri insuficiente.");
			}else {
				System.out.println("Suma invalida");
		
		}
			System.out.println("Introduceti suma pe care doriti sa o retrageti");
			suma= scan.nextInt();
		sold = sold-suma;
		System.out.println("Retragere cu succes ! Noul sold este " + sold);
		
		
		
		
		

	}

}
}
