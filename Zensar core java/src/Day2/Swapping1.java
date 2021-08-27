package Day2;

import java.util.Scanner;

public class Swapping1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int x, y, t;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the value of x and y: ");
        x=sc.nextInt();
        y=sc.nextInt();
        
        System.out.println("Before Swapping: "+x +"  "+ y);
        t=x;
        x=y;
        y=t;
        
        System.out.println("After Swapping: " +x+" "+y);
        System.out.println();
	}

}
