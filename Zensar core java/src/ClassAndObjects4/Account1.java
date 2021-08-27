package ClassAndObjects4;

public class Account1 {
	
	public long accountNo=624268;
	public String customerName="Sanket Nalegaonkar";
	
	void insertRecord(long a, String n){  
		  accountNo=a;  
		  customerName=n;
		 }
		 void display(){System.out.println(accountNo+" "+customerName);}  

	
	Account1(){
		System.out.println("I am in default Constructor");
		}  

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account1 a1= new Account1();
		Account1 a2= new Account1();
		
		  a1.insertRecord(111,"Karan");  
		  a2.insertRecord(222,"Aryan");  
		  a1.display();  
		  a2.display();

		
		
		//System.out.println(a1.accountNo+" "+a1.customerName);

	}

}
