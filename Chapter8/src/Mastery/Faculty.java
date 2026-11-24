package Mastery;


/*
 * Faculty.java
 * Faculty subclass of UEmployee.
 */

public class Faculty extends UEmployee {

    private String departmentName;

    /*
     * Constructor
     * Creates a faculty employee.
     */
    public Faculty(String name, double pay, String department) {
        super(name, pay);
        departmentName = department;
    }

    /*
     * Returns the department name.
     */
    public String getDepartmentName() {
        return(departmentName);
    }
}
