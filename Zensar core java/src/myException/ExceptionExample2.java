package myException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.println("Enter the Number: ");
			Scanner sc=new Scanner(System.in);
			int d=sc.nextInt();
			System.out.println("Square "+d*d);
			System.out.println("try ends");
			System.out.println("Enter Name");
			String nm=sc.next();
			System.out.println(nm.charAt(3));
			//break;
			
		}
		catch(NullPointerException e)
		{
			System.out.println("Wrong Input");
		}

	}


	}


