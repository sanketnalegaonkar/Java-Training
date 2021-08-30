package myString;

public class Vowels {

	public static void main(String[] args) {
		String s="Gaurav";
		int c=0;
		for(int i=0;i<s.length();i++)
		{
		   char ch=s.charAt(i);
		   if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e')
			   c++;
			   
		}
		
		System.out.println("No of vowels are "+c);
	}
	}


