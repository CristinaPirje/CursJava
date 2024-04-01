package curs9;
/*
 * Method override -  suprascrie metoda
 * implica o relatie de mostenire pentru ca 
 * suprascrierea se face in clasa copil si presupune scrierea identica a metodei din clasa parinte
 * dar cu o alta implementare
 * --este best practice ca metoda suprascrisa sa aiba adnotarea 
 * @override
 */

public class TestWildAnimal {

	public static void main(String[] args) {
		Lion simba= new Lion();
		simba.makeSound();//metoda suprascrisa
		simba.whereDoesItLives();
		simba.eatMeat();
		
		System.out.println("------------------------");
		
		Deer bambi= new Deer();
		bambi.makeSound();
		bambi.whereDoesItLives();
		bambi.eatGrass();
		
		

	}

}
