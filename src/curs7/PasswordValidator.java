package curs7;
/*facem un program care valideaza o parola pe baza unor reguli
 * regulile sunt:
 * 1. parola trebuie sa fie minim 10 caractere
 * 2. parola trebuie sa contina cel putin un upper case
 * 3. parola nu trebuie sa fie la fel username
 * La rulare:
 *  -informam care sunt regulile parolei
 *  -intrebam utilizatorul un username si o parola
 *  
 *  Daca parola este invalida printam "Parola invalida!"
 *  Daca nu, il informam care dintre regului nu au fost respectate
 *  si il tinem in loop pana cand parola este valida.
 *  
 *  1. o metoda care printeaza regulile parolei
 *  2. o metoda pentru user
 *  3. o metoda care cere parola
 *  4. o metoda pentru validare
 *  
 * 
 */

import java.util.Scanner;

public class PasswordValidator {
	Scanner scan = new Scanner(System.in);
	String username;
	String parola;
	boolean isInvalid;
	
	public void printPasswordRules() {
		System.out.println("Regulile parolei sunt:");
		System.out.println(" 1. parola trebuie sa fie minim 10 caractere");
		System.out.println(" 2 .parola trebuie sa contina cel putin un upper case");
		System.out.println(" 3. parola nu trebuie sa fie la fel username");
	
	
	}
	public void getUsername() {
		System.out.println("Introdu un username:");
		username= scan.next();
		
	}
	public void getPassword() {
		System.out.println("Introdu o parola");
		parola= scan.next();
		
	}
	public void checkPasswordRules() {
		isInvalid = false;
		if(parola.length()<0) {
			System.out.println("1. parola trebuie sa fie de minim 10 caractere");
			isInvalid=true;
		}
		if(parola.equals(parola.toLowerCase())) {
			System.out.println(" 2 .parola trebuie sa contina cel putin un upper case");	
			isInvalid=true;
		}
		if(parola.equals(username)) {
			System.out.println(" 3. parola nu trebuie sa fie la fel username");
			isInvalid=true;
		}
	}
	public void validatePassword() {
		do {
			getPassword();
			checkPasswordRules();
			
			
		}while(isInvalid);
		System.out.println("Parola valida");
		
		
		
		
	}

}
