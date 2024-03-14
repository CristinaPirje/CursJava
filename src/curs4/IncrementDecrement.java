package curs4;

/* operator unar: are un singur operand numar++--> numar = numar +1
operator binar : doi operanzi var > var2
operator ternac : trei operanzi (operator conditional)
*/


public class IncrementDecrement {

	public static void main(String[] args) {
		
		//POST increment --> numar++
		//PRE increment --> ++numsr
		
		System.out.println("-----POST-----");
		int num = 10;
		System.out.println("Valoarea lui num inainte de increment :" + num);
		System.out.println("Valoarea lui num POST increment :" + num++);
		System.out.println("Valoarea lui num POST increment :" + num);
		
		System.out.println("-----PRE-----");
		int num2 = 10;
		System.out.println("Valoarea lui num inainte de increment :" + num2);
		System.out.println("Valoarea lui num POST increment :" + ++num2);
		System.out.println("Valoarea lui num POST increment :" + num2);
		
		
	}

}
