package ConditionalAssignment;

import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char ch;
       System.out.println("Enter the alphabet: ");
       Scanner sc=new Scanner(System.in);
       
       ch=sc.next().charAt(0);;
       if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
       {
    	   System.out.println("This is vowel");
       }
       else
       {
    	   System.out.println("This is a consonent");
       }
       }
       
       
	}


