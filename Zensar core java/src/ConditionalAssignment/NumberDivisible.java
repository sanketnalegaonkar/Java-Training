package ConditionalAssignment;

import java.util.Scanner;

public class NumberDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number: ");
		num =sc.nextInt();
		
		if((num % 5 == 0) && (num % 11== 0))
		{
			System.out.println("The number is divisible by 5 and 11");
		}
		else {
			System.out.println("The number is not divisible by 5 and 11");
		}
		}

	}


