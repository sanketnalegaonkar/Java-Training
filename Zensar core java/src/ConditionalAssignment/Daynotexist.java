package ConditionalAssignment;

import java.util.Scanner;

public class Daynotexist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weekday;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the weekday number: ");
		weekday=sc.nextInt();
		
	if(weekday>8) {
		System.out.println("error,day does not exist");
	}
	else {
		System.out.println("It's Weekday");
	}
	}

}
