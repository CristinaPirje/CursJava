package curs9;

public class ExceptionExample {

	public static void main(String[] args) {
	
		String[] week = {"L","M","Mi","J","V","S","D"};
		
		try {
			System.out.println(week[7]);
			
		} catch(ArrayIndexOutOfBoundsException err) {
			System.out.println("Am prins o eroare:"+ err.getMessage());
			
		};
			System.out.println(week[2]);
			System.out.println("------------------");
		
			for(String day: week) {
				System.out.println(day);
			}
		
		
	}

}
