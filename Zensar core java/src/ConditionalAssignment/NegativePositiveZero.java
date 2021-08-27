package ConditionalAssignment;

import java.util.Scanner;

public class NegativePositiveZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		
		num=sc.nextInt();
		
		if(num >0)
		{
			System.out.println("This is Positive Number");
		}
		else if (num < 0)
		{
			System.out.println("This is Negative Number");
		}
		else
		{
			System.out.println("Zero");
		}

	}

}
