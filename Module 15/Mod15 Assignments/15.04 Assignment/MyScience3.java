/**
 * @purpose Class to model homework assignments.
 * 
 * @author Jody Rutter
 * @version 8/13/2015
 */
public class MyScience3 extends Homework3
{
    /**
     * Constructor for objects of type MyScience.
     */
    public MyScience3()
    {
        super();
    }
    
    /**
     * Method to create assignments.
     * @param p Number of pages to read as homework.
     */
    public void createAssignments(int p)
    {
        setPagesRead(p);
        setTypeHomework("Science");
    }
    
    public String toString()
    {
        return getTypeHomework()+" - Must read "+getPagesRead()+" pages."; 
    }
}