package curs11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String>list= new ArrayList<>();
		//ArrayList<String>list= new ArrayList<>();
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.add("Oana");
		list.add("Ion");
		list.add("Gabriel");
		list.add("Maria");
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list);
		
		System.out.println("--------------------------------------");
		System.out.println("get element: " + list.get(0));
		
		for (String nume : list) {
			System.out.println(nume);
		}
		System.out.println("---------------------------------------");
		list.add("Ioana");
		System.out.println(list);
		list.add(2, "Carmen");
		System.out.println(list);
		list.add(6,"Bogdan");
		System.out.println("----------------------------------------");
		
		System.out.println(list.size());
		list.remove(0);
		
		System.out.println(list.size());
		System.out.println(list);
		list.remove("Gabriel");
		
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("----------------------------------------");
		list.add("Maria");
		System.out.println(list);
		
		list.remove("Maria");
		System.out.println(list);
		
		//list.clear();
		//System.out.println(list);
		
		System.out.println(list.subList(0,3));
		list.subList(0, 3);
			
		System.out.println("----------------------------------------");
		System.out.println(list.contains("Alina"));
		System.out.println(list.contains("Bogdan"));
		System.out.println(list.indexOf("Bogdan"));
		
		System.out.println("----------------------------------------");
		list.set(3, "Oana");
		System.out.println(list);
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
