/**
 * @purpose Class to model homework assignments.
 * 
 * @author Jody Rutter
 * @version 8/13/2015
 */
public class MyMath extends Homework
{
    /**
     * Constructor for objects of type MyMath.
     */
    public MyMath()
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
        setTypeHomework("Math");
    }
    
    public String toString()
    {
        return getTypeHomework()+" - Must read "+getPagesRead()+" pages."; 
    }
}