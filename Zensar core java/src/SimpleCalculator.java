import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,ans;
		char op;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		System.out.println("Enter the Operator");
		op=sc.next().charAt(0);
		
		switch(op)
		{
		case '+':ans=num1+num2;
		break;
		case '-':ans=num1-num2;
		break;
		case '*':ans=num1*num2;
		break;
		case '/':ans=num1/num2;
		break;
		default: System.out.println("Error! Enter correct operator");
		return;
		}
		
		System.out.println("The result will be: ");
		System.out.println(num1+" "+op+" "+num2+" ="+ans);
			
		sc.close();
		}

	}


