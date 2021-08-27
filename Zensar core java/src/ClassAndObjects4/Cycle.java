package ClassAndObjects4;

public class Cycle {
	int accountNo;
	int noOfWheels;
	
	
	Cycle(){
		System.out.println("I am default constructor");
		}  
	
	Cycle(int i, int j){
      System.out.println("I am another constructor");
   }
	
	   public static void main(String args[]){
		   
		      Cycle obj = new Cycle(12,12);

	   }

	}
