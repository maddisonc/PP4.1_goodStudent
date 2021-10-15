import java.text.DecimalFormat;

public class GoodStudent
{
    //1) List of instance variables:
    private String firstName;
    private String lastName;
    private int idNum;
    private double gpa;
    private boolean isCsStudent;

    //2) constructors:
    public GoodStudent (String newFirstName, String newLastName, int newId, double newGpa, boolean newIsCsStudent)
    {
        firstName = newFirstName;
        lastName = newLastName;
        idNum = newId;
        gpa = newGpa;
        isCsStudent = newIsCsStudent;
    } // end full constructor

    public GoodStudent (String newFirstName, String newLastName, double newGpa, boolean newIsCsStudent)
    {
        firstName = newFirstName;
        lastName = newLastName;
        gpa = newGpa;
        isCsStudent = newIsCsStudent;
    } // end partially full constructor

    public GoodStudent ()
    {
        firstName = "unnamed student";
        lastName = "unnamed student";
        idNum = 0;
        gpa = 0.0;
        isCsStudent = false;
    } // end empty constructor

    //4) Getters
    public String getFirstName()
    {
        return firstName;
    } // end getFirst

    public String getLastName()
    {
        return lastName;
    } // end getLast

    public int getIdNum()
    {
        return idNum;
    } // end getId

    public double getGpa()
    {
        return gpa;
    } // end getGpa

    public boolean getIsCsStudent()
    {
        return isCsStudent;
    } // end getCS

    //5) Setters
    public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    } // end setFirst

    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    } // end setLast

    public void setIdNum(int newIdNum)
    {
        idNum = newIdNum;
    } // end setId

    public void setGpa(double newGpa)
    {
        gpa = newGpa;
    } // end setGpa

    public void setIsCsStudent(boolean newIsCsStudent)
    {
        isCsStudent = newIsCsStudent;
    } // end setCS

    //6) Brain methods
    // private String CreateID
    public String CreateID ()
    {
        String lastThree = String.valueOf(idNum);
        return "" + firstName.substring(0, 1) + lastName + lastThree.substring(lastThree.length()-3);
    } // end create id

    // CSGPA
    public String CSGPA ()
    {
        if (isCsStudent)
        {
            gpa = 1.15 * gpa;
        }
        DecimalFormat fmt = new DecimalFormat("0.##");
        return fmt.format(gpa);
    } // end increase GPA 15% if CS student

    //3) toString()
    public String toString()
    {
        String output = "First name: " + firstName;
        output += ("\n Last name: " + lastName);
        output += ("\n ID Number: " + idNum);
        output += ("\n GPA: " + gpa);
        output += ("\n CS Student status: " + isCsStudent);
        return output;
    } // endtoString()

} // end GoodStudent class
