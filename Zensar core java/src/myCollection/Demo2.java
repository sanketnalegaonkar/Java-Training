package myCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		System.out.println(al.size());
				al.add("Snehal");
				al.add(new String("Megha"));
				al.add("A");
				al.add("B");
				al.add("C");
				al.add("D");
				al.add("E");
				al.add("F");
				al.add("G");
				
				Iterator<String> i=al.iterator();
				
				while(i.hasNext())
				{
					String data=i.next();
					System.out.println(data);
				}

	}

}
