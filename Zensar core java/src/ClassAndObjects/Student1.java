//Question 3

package ClassAndObjects;

public class Student1 {
	int id=101;
	String name="Sanket";
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1();
		//cannot access id without creating object
		
		System.out.println(s1.id+" "+s1.name);
		

	}

}
