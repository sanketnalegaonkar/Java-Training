package Day4;

import java.util.Scanner;

public class HarshadOrNivenNumber {

	  public static void main(String args[]) {
	 
	    //Input number to be tested
	    System.out.print("Please enter number to be tested:");
	    Scanner scanner = new Scanner(System.in);
	    Long inputNo = scanner.nextLong();
	 
	    //Calculate sum of digits of inputNo
	    long temp = inputNo;
	    int sumOfDigits = 0;
	    while (temp > 0) {
	      long rem = temp % 10;
	      sumOfDigits += rem;
	      temp = temp / 10;
	    }
	 
	    //Check if inputNo is divisible by sum of its digits
	    if (inputNo % sumOfDigits == 0) {
	      System.out.println(inputNo + " is a Harshad/Niven Number");
	    } else {
	      System.out.println(inputNo + " is NOT a Harshad/Niven Number");
	    }
	 
	  }
	}


