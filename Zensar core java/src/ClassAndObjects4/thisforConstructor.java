package ClassAndObjects4;

class Abc{  
Abc(){System.out.println("hello a");}  
Abc(int x){  
this();  
System.out.println(x);  
}  
}  
class thisforConstructor{  
public static void main(String args[]){  
Abc a1=new Abc(10);  
}}  

	
	


