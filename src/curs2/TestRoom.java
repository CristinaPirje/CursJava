package curs2;

public class TestRoom {

	public static void main(String[] args) {
		Room baie = new Room(4,2);
		System.out.println("Perimetru baie este : "+ baie.calculPerimetru());
		System.out.println("Arie baie este : "+ baie.calculArie());
		
		
		Room dormitor = new Room(8,6);
		System.out.println("Perimetru dormitor este : "+ dormitor.calculPerimetru());
		System.out.println("Arie dormitor este : "+ dormitor.calculArie());
		System.out.println("Culoare perete dormitor : "+ dormitor.afiseazaCuloareDreptunghi());
		
		
		Room dreptunghi = new Room(8,6,"alb");
		System.out.println("Culoare dreptunghi : " + dreptunghi.afiseazaCuloareDreptunghi());
		System.out.println("Culoare dreptunghi  " + dreptunghi.afiseazaCuloareDreptunghi() + " si are aria " + dreptunghi.calculArie());
		
		
		
		

	}
	
	
		 
		 
		 
		 
	 }
	 
	 
	 
	 
	 
	 

