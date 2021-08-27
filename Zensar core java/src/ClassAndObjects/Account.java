package ClassAndObjects;

public class Account {    //Question 6

	
	    protected int acno;
	    protected String name;
	    protected float balance;
	    
	    public void insert(int a, int b) {
	        acno = a;
	        balance = b;
	        
	    }
	    
	    public void display() {
	        System.out.println("Account Number: " + acno);
	        //System.out.println("Name: " + name);
	        System.out.println("Balance: " + balance);
	    }
	    
	    
	    public void deposit(int d){
	        balance += d;
	    }
	    
	    public void withdraw(int w) {
	        balance -= w;
	    }
	    
	    public void check_balance(int t) {
	        balance -= t;
	    }
	    
	
	
	
	
	}	
	

