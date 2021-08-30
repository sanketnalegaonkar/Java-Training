package myString;

import java.util.Arrays;
import java.util.Scanner;

public class DemoString {
	
       static String m1()
		{
			return "hi";
		}
	public static void main(String[] args) {
		
		
		/* int a=10,b=10;
		System.out.println(a==b);
		String s1="Rohan";
		String s2="Rohan";
		System.out.println(s1==s2);
		String s3=new String("Rohan");
		String s4=new String("Rohan");
		
		System.out.println(s3==s1);
		System.out.println(s3==s4);
		*/
		//effective memory 
		
		//SCP ->string constant pool of string where only unique string
		//are stored
		
		
		//Heap
		String str1="Kiran";
		String sss=str1.concat("Deepa");
		System.out.println(str1);
		System.out.println(sss);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		
		String s1=sc.nextLine();
		System.out.println(s1.length());
		String a=s1.toUpperCase();
		String b=s1.toLowerCase();
		 char c= s1.charAt(s1.length()-1);
		 
		System.out.println(s1);
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		}
		System.out.println(c);
		
		
		//System.out.println(s2);
		int idx=s1.indexOf('a');
		System.out.println(idx);
		int idx2=s1.indexOf('a',idx+1);
		System.out.println(idx2);
		
		String s2="thinkquotient";
		String ss=s2.substring(2,5);
		
		System.out.println(ss);

		System.out.println("computer".endsWith("ter"));
		System.out.println("snehal".startsWith("s"));
		
		String s3="Shanaya";
		String ss1=s3.toUpperCase();
		String s4="";
		for(int i=0;i<s3.length();i++)
		{
			char ch=s3.charAt(i);
					if(ch!='a')
						s4=s4+ch;
		}
		
		System.out.println(s3.indexOf('a'));//2
		System.out.println(s3.lastIndexOf('z'));//-1
		//String is immutable
		
		//toUppercase()
		//toLowerCase()-->return string
		//charAt(idx)-->return character
		//indexOf(data)->return int 
		//length()- int
		//startsWith -boolean
		//lastIndexOf(data) return last occur 
		//endsWith boolean
		//lastIndexOf();
		//equals //boolean
		//compareTo //int
		//split()
		//toCharArray
		
		String str="my name is Pavan";
		String[] arr=str.split(" ");
		System.out.println(arr[0]);
		System.out.println(Arrays.toString(arr));
		char[] carr=str.toCharArray();
		System.out.println(Arrays.toString(carr));
		
		
		
		
	}
	}






	//how to create custom immutable class(cant change)

	final class Student
	{
		final int id;
		final String name;
		
		Student(int i,String nm)
		{
			id=i;
			name=nm;
		}
		
		public static void main(String[] args) {
			Student s1=new  Student(1,"Pavan");
			Student s2=new Student(2,"Akshay");
			
			
		}
	}


