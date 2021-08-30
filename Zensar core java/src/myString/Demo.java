package myString;
import java.util.Arrays;

public class Demo {
	
	public static void main(String[] args) {
		
		//asc
		String s1=new String("Ajay");
		String s2=new String("Bijaya");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		
		System.out.println(s1.compareToIgnoreCase(s2));
		String [] a={"Manav","Anand","Rehan","Rahul","Diya"};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					String t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		
	}
	}



