package myString;

public class Reverse {
	
		
		static String reverse(String str)
		{
			//str="ram" 3
			//2
			String reverse="";
			
			for(int i=str.length()-1;i>=0;i--)
			{
				reverse=reverse+str.charAt(i);
			}
			
			return reverse;
			
		}
	public static void main(String[] args) 
	{
		String s="My name is Kiran";
		//nariK si eman yM
		
		//yM eman si nariK 
		
		String[] arr=s.split(" ");
		//arr[0]="my"
		//arr[1]="name"
		
		for(int i=0;i<arr.length;i++)
		{
			String s1=reverse(arr[i]);
			System.out.print(s1+" ");
		}
		
		//ym eman si nariK
		
		
		
	}
	}



