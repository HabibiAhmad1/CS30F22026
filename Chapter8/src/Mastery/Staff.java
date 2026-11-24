package Mastery;


/*
 * Staff.java
 * Staff subclass of UEmployee.
 */

public class Staff extends UEmployee {

    private String jobTitle;

    /*
     * Constructor
     * Creates a staff employee.
     */
    public Staff(String name, double pay, String title) {
        super(name, pay);
        jobTitle = title;
    }

    /*
     * Returns the job title.
     */
    public String getJobTitle() {
        return(jobTitle);
    }
}
