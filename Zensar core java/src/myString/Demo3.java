package myString;

import java.util.Scanner;

public class Demo3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String s1="Sanket";
		
		System.out.println(s1);
		//Deepa
		//apeeD
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}

		System.out.println();
		
		char[] arr=s1.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		
		
		
		
		
	}
	}



