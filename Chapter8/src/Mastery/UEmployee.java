package Mastery;


/*
 * UEmployee.java
 * University Employee superclass.
 */

public class UEmployee {

    private String employeeName;
    private double salary;

    /*
     * Constructor
     * Creates a university employee.
     */
    public UEmployee(String name, double pay) {
        employeeName = name;
        salary = pay;
    }

    /*
     * Returns the employee name.
     */
    public String getEmployeeName() {
        return(employeeName);
    }

    /*
     * Returns the employee salary.
     */
    public double getSalary() {
        return(salary);
    }
}
