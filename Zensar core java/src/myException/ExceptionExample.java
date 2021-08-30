package myException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Enter the Number: ");
			Scanner sc=new Scanner(System.in);
			int d=sc.nextInt();
			System.out.println("Square "+d*d);
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Wrong Input");
		}

	}

}
