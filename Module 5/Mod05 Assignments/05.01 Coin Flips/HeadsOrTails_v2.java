/**
 * This program models flipping an unbiased coin and counting the
 * number of times heads or tails occurs.
 * 
 * This program has been revised by me. I have revised it to give a 20% chance of heads.
 * 
 * @author B. Jordan 
 * Revised by: Jody Rutter
 * @version 04/01/08
 */
import java.util.Scanner;
public class HeadsOrTails_v2
{
	public static void main(String[] args)
	{
	    int heads = 0;
	    int tails = 0;
	    int counter = 1;
	    double randNum = 0.0;
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("How many times will the coin be flipped? ");
	    int flips = in.nextInt();
	    
	    while(counter <= flips)
	    {
	        randNum = Math.random();
	        System.out.print(counter + "\t" + randNum);
	        
	        if(randNum < .2)
	        {
	            heads++;
	            System.out.println("\t heads");
	        }
	        else
	        {
	            tails++;
	            System.out.println("\t tails");
	           }
	        counter++;      
	    }
	    System.out.println();
	    System.out.println("Number of Heads = " + heads);
	    System.out.println("Number of Tails = " + tails);
	    
	    
	    
	}
}
