package Day6;

import java.util.Scanner;

public class TestEmp {
	
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	Emp e1=new Emp();
	System.out.println("Enter emp id, emp name,sal");
	
	int id=sc.nextInt();
	//String nm=sc.nextInt();
	int sal=sc.nextInt();
	
	e1.setEid(id);
	//e1.setName(nm);
	e1.setSalary(sal);
	
	//Emp e2=new Emp(1,"Rohan",null);
	//e2.setNmae(name);
	
	System.out.println("Enter your deptid and dname ");
	
	int did=sc.nextInt();
	String dnm=sc.next();
	Department d1=new Department(did,dnm);
	
	e1.setDept(d1);
	
	String ename=e1.getName();
	System.out.println(ename);
	System.out.println(e1.getSalary());
	
	
	System.out.println(d1.getDeptid());
	System.out.println(e1.getDept().getDeptname());





}

}
