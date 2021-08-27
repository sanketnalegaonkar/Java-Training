package ConditionalAssignment;

import java.util.Scanner;

public class SwitchCaseAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("MENU:");
		System.out.println("1.Area of a circle");
		System.out.println("2.Area of a square");
		System.out.println("3.Area of a Right angled Triangle");
		System.out.println("4.Area of a Rectangle");
		System.out.println("5.Circumference of a circle");
		System.out.println("6.Peremeter of a square");
		System.out.println("7.Exit");

		System.out.println("Enter your Option: ");
		int op=sc.nextInt();
		
		
		switch(op) 
		{
		case 1:
		     System.out.println("Enter radius: ");
		     float r=sc.nextFloat();
		     float ac=3.14f*r*r;
		     System.out.println("Area: "+ac);
			break;
			
		case 2: 
			System.out.println("Enter Side:");
			int x=sc.nextInt();
			int as=x*x;
			System.out.println("Area:"+as);
			break;
			
		case 3:
		System.out.println("Enter height and base:");
		float h=sc.nextFloat();
		float bs=sc.nextFloat();
		float art=0.5f*h*bs;
		System.out.println("Area:"+art);
			break;
			
		case 4:
		System.out.println("Enter length and breadth:");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int ar=sc.nextInt();
		System.out.println("Area:"+ar);
			break;
			
		case 5:
			System.out.println("Enter radius:");
			float R=sc.nextFloat();
			float c=3.14f*2f*R;
			System.out.println("Circumference:"+c);
			break;
			
		case 6:
			System.out.println("Enter side:");
			int X=sc.nextInt();
			int p=4*X;
		System.out.println("Perimeter"+p);
			break;
			
		default:
			return;
		
		
		}

	}

}
