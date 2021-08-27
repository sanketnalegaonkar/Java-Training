package ConditionalAssignment;

import java.util.Scanner;

public class ThreeDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int digit1;
		int digit3;
		int sum;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number: " );
		num=sc.nextInt();
		
		
		if((num>=100) && (num<=999)){
			System.out.println("This is Three digit number");
			 digit1=num/100;
			 digit3=num%10;
			 sum=digit1+digit3;
			// System.out.println("The 1st digit is: "+digit1);
			 //System.out.println("The 3rd digit is: "+digit3);

			 System.out.println("The sum is: "+sum);
		}
		else {
			System.out.println("This is not a three digit number");
		}
			

	}

}
