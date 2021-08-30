package myString;

public class StringImmutableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=new String("Hello ");
		System.out.println("String before concatenate: "+str);
		
		String str1=str.concat("World");
		System.out.println("String after concatenate: "+ str1);
		
		
		System.out.println("String str1 : "+str1);
		
		String s1="Hello ";
		String s2="Luck ";
		String s3=s1+s2;
		
		System.out.println("String s1 : "+ s1);
		System.out.println("String s2 : "+ s2);
		System.out.println("String s3 : "+ s3);


		
		
		
		

	}

}
