package switchCase;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {

	
	int num;
	
	Scanner sc=new Scanner(System.in);

    System.out.println("Enter any number to check even or odd: ");
    
    num=sc.nextInt();
  

    switch(num % 2)
    {
        case 0: 
        	System.out.println("Number is Even");
            break;

        case 1: 
        	System.out.println("Number is Odd");
            break;
    }
}
}




