package curs12;

public class VarArgExample {

	public static void main(String[] args) {
		
		printCeva("Alb","Galben");
		printCeva("1","2","3","4");
		printAltceva(123, "Bob");//0 argumente variabile
		printAltceva(123, "Bob",33);
		
		
		//JavaScriptExecutor.executeScript(jsScript,element)
		//JavaScriptExecutor.executeScript(jsScript,element,element2)
	

	}

	
	
	/*public static void printCeva(String a, String b) {
	 
		System.out.println(a);
		System.out.println(b);
		*/
	
public static void printCeva(String...values) {
	for (String element : values) {
		System.out.println(element);
	}
	
}

public static void printAltceva(int number,String nume,int...numbers) {
	
}
}

	  

	 
	


