package myString;

public class DemoStringBuffer {
		
	public static void main(String[] args) {
		String s1="om";
		String s2=new String("Om");
		
		//String immutable
		
		//StringBuffer
		//mutable
		//no string constant pool concept
		//thread safety
		
		StringBuffer sb=new StringBuffer("java");
		StringBuffer sb2=new StringBuffer("java");
		
		//System.out.println(sb.equals(sb2));
		String s3=sb.toString();
		sb.append(" is OOPs language");
		sb.append("Sun microsystems");
			
		System.out.println(sb);
		//sb.reverse();
		//System.out.println(sb);
		
		sb.insert(1,"Omkar");
		System.out.println(sb);
		sb.delete(1,30);
		System.out.println(sb);
		sb.setCharAt(1,'a');
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		
		
		System.out.println(sb);
		
		
		//mutable
		//is not thread safe
		StringBuilder sbb=new StringBuilder();
		sbb.append("omkar");
		sbb.reverse();
	}
	}



