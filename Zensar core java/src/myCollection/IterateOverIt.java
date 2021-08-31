package myCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


public class IterateOverIt {
	
	public static void main(String[] args) {
	    // Creating an ArrayList
	    ArrayList<String> Students = new ArrayList<>();
	    Students.add("Ajay");
	    Students.add("Vijay");
	    Students.add("Sujay");
	    System.out.println("ArrayList: " + Students);

	    // Creating an instance of ListIterator
	    ListIterator<String> iterate = Students.listIterator();
	    System.out.println("Iterating over ArrayList:");
	    while(iterate.hasNext()) {
	      System.out.print(iterate.next() + ", ");
	    }
	  }

}
