package Inheritance;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num;
		boolean flag = false;
		
		System.out.println("Enter the Number: ");
		num=sc.nextInt();
		
		
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	
		

	}


