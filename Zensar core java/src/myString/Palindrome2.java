package myString;

public class Palindrome2 {
	
	public static void main(String[] args) {
		String s1="Shanaya";
		StringBuffer sb=new StringBuffer(s1);
		
		sb.reverse();
		String s2=sb.toString();
		
		System.out.println(s1);
		System.out.println(s2);
		if(s1.equals(s2))
			System.out.println("Palindrome");
		else
			System.out.println("Not ");
	}
	}

	


