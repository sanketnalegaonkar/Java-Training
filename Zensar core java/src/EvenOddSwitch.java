import java.util.Scanner;
//Day3 18th august
public class EvenOddSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		
		switch(num%2)
		{
		case 0 :
		System.out.println("This is even number");
		break;
		
		case 1 :
			System.out.println("This is odd number");
			break;
		
		default:
			System.out.println("invalid");
		}
		sc.close();

	}

}
