package Day4;


	import java.util.Scanner;

	public class EvenNumber {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num,i;
			
			Scanner sc= new Scanner(System.in);
			
			//System.out.println("Enter the number:");
			//num=sc.nextInt();
			
			for(i=121;i<=229;i++)
			{
				if(i%2==0);
				{
					System.out.println(i+"\t");
				}
			}
			sc.close();
		}

	}

