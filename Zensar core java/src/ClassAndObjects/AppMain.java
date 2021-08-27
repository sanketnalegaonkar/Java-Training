package ClassAndObjects;

class Employeeee {
	
	private int id;
    private String name;
    private String designation;
    private String company;
    public int getId() {
        return id;
    }
    public void setId(final int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(final String name) {
        // Validating the name and throwing an exception if name is null or length is <= 0.
        if(name == null ||  name.length() <= 0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(final String designation) {
        this.designation = designation;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(final String company) {
        this.company = company;
    }
    // 'toString()' method to print the values.
    @Override
    public String toString() {
        return "Employee: [id= " + getId() + ", name= " + getName() + ", designation= " + getDesignation() + ", company= " + getCompany() + "]";
    }
}
// Main class.
public class AppMain {
    public static void main(String[] args) {
        // Creating the employee object.
        final Employeeee myemployeeee = new Employeeee();
        // Setting the employee details via the setter methods.
        myemployeeee.setId(1001);
        myemployeeee.setName("Sanket");
        myemployeeee.setDesignation("Software Developer");
        myemployeeee.setCompany("Zensor");
        // Printing the employee details via the 'toString()' method that uses the getter methods.
        System.out.println(myemployeeee.toString());
    }
}


