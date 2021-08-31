package myCollection;

import java.util.ArrayList;

public class Demo1 {

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
				
				System.out.println(al);
				System.out.println(al.size());
				//a1.clear();
				//System.out.println(a1);
				
				al.add("Ayush");
				System.out.println(al.size());
				
				al.remove("Pooja");
				System.out.println(al);
				System.out.println(al.contains("om"));
				
				ArrayList<String>al2=new ArrayList<>();
				al.add("Sachin");
				al.add("Sanket");
				al.add("Jayant");
				
				al2.addAll(al);
				System.out.println(al);
				System.out.println(al2);
                al2.retainAll(al);
            al.removeAll(al2);
            
            System.out.println(al);
            System.out.println(al2);



System.out.println(al);

for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i));
}



		

	}

}
