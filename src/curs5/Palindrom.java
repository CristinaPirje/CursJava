package curs5;

public class Palindrom {

	public static void main(String[] args) {
		String cuvant = "masina";
		String cuvantIntors ="";
		//cuvantIntors = "";
		//cuvantItors= cuvant.charAt(4)=r
		//cuvantIntors = cuvantIntors + cuvant.charAt(4)
		for(int i=cuvant.length()-1;i>=0;i--) {
			cuvantIntors = cuvantIntors + cuvant.charAt(i);
			
		}
		System.out.println(cuvantIntors);
		if(cuvant.equals(cuvantIntors)) {
			System.out.println("Cuvantul este palindrom");
			
		}else {
			System.out.println("Nu este palindrom");
			
		}

	}

}
