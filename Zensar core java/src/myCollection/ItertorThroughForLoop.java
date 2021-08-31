package myCollection;

import java.util.ArrayList;

public class ItertorThroughForLoop {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Creating an array list
	    ArrayList<String> languages = new ArrayList<>();
	    languages.add("Java");
	    languages.add("JavaScript");
	    languages.add("Python");
	    System.out.println("ArrayList: " + languages);

	    // Using for loop
	    System.out.println("Iterating over ArrayList using for loop: ");

	    for(int i = 0; i < languages.size(); i++) {
	      System.out.print(languages.get(i));
	      System.out.print(", ");
	    }

	}


}
