package ConditionalAssignment;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the three numbers: ");
		 num1=sc.nextInt();
		 num2=sc.nextInt();
		 num3=sc.nextInt();
		 
		 if((num1 > num2) && (num1>num3))
		 {
			 System.out.println("Maximum number is "+num1);
		 }
		 else if((num2>=num1)&&(num2>=num3))
		 {
			 System.out.println("Maximum number is "+num2);
		 }
		 else
		 {
			 System.out.println("Maximum number is "+num3);
		 }
		 }

		 

	}


