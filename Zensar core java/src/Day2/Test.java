package Day2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter three Numbers: ");
		int num1=sc.nextInt();
		byte num2=sc.nextByte();
		short num3=sc.nextShort();
		
		System.out.println("Addition : "+(num1+num2+num3));
		
		System.out.println("Enter Height: ");
		float h=sc.nextFloat();
		
		System.out.println("Enter Mobile number: ");
		long mb=sc.nextLong();
		
		System.out.println("Enter First Name: ");
		String nm=sc.next();
		
		System.out.println("Enter the Gender: ");
		char ch=sc.next().charAt(0);

	}

}
