package Day4;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum = 0, evenNumber = 2;
	      // loop from 1 to 100
	      for (int count = 1; count <= 100; count++) {
	         // add current even number to sum
	         sum += evenNumber;
	         // get the next even number
	         evenNumber += 2;
	      }
	      System.out.println("Sum of even numbers is " + sum);
	   }
	

	}


