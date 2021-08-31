package myCollection;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ReverseOrderUsingIterator {
	
	  public static void main(String[] args)
	    {
	        List<String> list = Arrays.asList("C", "C++", "Java");
	 
	        // use `ListIterator` to iterate list in reverse order
	        ListIterator<String> itr = list.listIterator(list.size());
	 
	        // `hasPrevious()` returns true if the list has a previous element
	        while (itr.hasPrevious()) {
	            System.out.println(itr.previous());
	        }
	    }

}
