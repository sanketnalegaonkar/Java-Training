//Question 1

package ClassAndObjects;

public class Student {
	 
	     int id; 
		 String name;  

		 public static void main(String args[]){  

			 Student s1=new Student();//creating an first object of Student 
			 Student s2=new Student();//creating an second object of Student

		  System.out.println(s1.id);//accessing member through reference variable  
		  System.out.println(s1.name);  
		  System.out.println(s2.id);//accessing member through reference variable  
		  System.out.println(s2.name);
		 }  
		}  