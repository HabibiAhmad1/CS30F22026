package Mastery;


/*
 * UEmployeeTest.java
 * Tests the UEmployee, Faculty, and Staff classes.
 */

public class UEmployeeTest {

    public static void main(String[] args) {

        Faculty facultyMember =
            new Faculty("John Smith", 65000, "Computer Science");

        Staff staffMember =
            new Staff("Mary Jones", 45000, "Administrative Assistant");

        System.out.println("FACULTY EMPLOYEE");
        System.out.println("------------------------");
        System.out.println("Name: " +
            facultyMember.getEmployeeName());
        System.out.println("Salary: $" +
            facultyMember.getSalary());
        System.out.println("Department: " +
            facultyMember.getDepartmentName());

        System.out.println();

        System.out.println("STAFF EMPLOYEE");
        System.out.println("------------------------");
        System.out.println("Name: " +
            staffMember.getEmployeeName());
        System.out.println("Salary: $" +
            staffMember.getSalary());
        System.out.println("Job Title: " +
            staffMember.getJobTitle());
    }
}
