package ClassAndObjects;

public class Employee {    //Question 5
	 int refno;  
	 String refname;  
	 Employee(int i, String n) {  
	  refno = i;  
	  refname = n;  
	 }  
	 Employee(Employee e) {  
	  refno = e.refno;  
	  refname = e.refname;  
	 }  
	 void display() {  
	  System.out.println(refno + " " + refname);  
	 }  
	 public static void main(String[] args) {  
	  Employee e1 = new Employee(123, "raman");  
	  Employee e2 = new Employee(e1);  
	  e1.display();  
	  e2.display();  
	 }

}
