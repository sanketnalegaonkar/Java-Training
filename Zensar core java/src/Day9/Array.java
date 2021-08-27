package Day9;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int[]arr1=new int[8];
		System.out.println("Enter any 8 integer");
		for(int i=0;i<=4;i++)
		{
			arr1[i]=sc.nextInt();
		}

		
		for(int i=0;i<=4;i++)
		{
			
			System.out.println("First 5 integers in increment are:"+arr1[i]);
		}
		
       for(int i=5;i>=0;i--)
       {
			System.out.println("First 5 integers in decrement are:"+arr1[i]);
       }
		

	}

}
