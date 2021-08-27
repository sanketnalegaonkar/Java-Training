package ClassAndObjects;

class Studentt{          //Question 4

	 int rollno;  
	 String name;  
	 void insertRecord(int r, String n){  
	  rollno=r;  
	  name=n;
	 }
	 void display(){System.out.println(rollno+" "+name);}  

}
			
class Student3 {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				  Studentt s1=new Studentt();  
				  Studentt s2=new Studentt();  
				  s1.insertRecord(111,"Karan");  
				  s2.insertRecord(222,"Aryan");  
				  s1.display();  
				  s2.display();
				
				

			}

	}


