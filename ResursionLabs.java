/**
 * Name: Naylene Rondon
 * 
 * Florida Tech CIS 2503
 * 4.5 Programming Lab
 * 
 * Date Last Modified: 2/3/24
 * 
 * Purpose:
 * MPL methods for recursion 
 *
 */
import java.util.*; //For scanner

public class ResursionLabs 
{
	public static void main(String[]args) //I didn't use this for testing. I tested all in the MPL, but felt it was needed to call the methods even if they're not being used.
	{
		Scanner input = new Scanner(System.in); //Create scanner object
		copy(input);
		copy2(input);
		//Variables to call the int methods
		int addSum = add(input);
		int counter = count(input);
		int countpositive = countPos(input);
	}
	
	public static void copy(Scanner input) //For assignment 21238
	{
		String word;
		
		if(!input.hasNext())
		{
			return;
		}
		
		else
		{
			word = input.next();//Trying to get last value to read in reverse order
			copy(input);
			
			System.out.println(word);
		}
	}
	
	public static void copy2(Scanner input)//For assignment 21233
	{
		if(input.hasNext())
		{
			System.out.println(input.next()); //Prints each line
			copy(input);
		}
	}
	
	public static int add(Scanner input) //For assignment 21234
	{
		int sum = input.nextInt(); //makes sum input
		
		if (input.hasNextInt()) 
		{
			sum = sum + add(input); //sums the value while calling the method
		}
		
		return sum;
	}
	
	public static int count(Scanner input) //For assignment 21235
	{
	    if(input.hasNext())
	    {
	        input.next();
	        return 1 + count(input); //add one to each string and calls method again
	    }
	    else 
		{
			return 0; //no value
		}
	}
	
	public static int countPos(Scanner input) //For assignment 21236
	{
	    if(input.hasNextInt())
	    {
			if(input.nextInt() > 0) //Allows positive values only
			{
				return 1 + countPos(input);
			}
			
			else //skip negative values
			{
	        	return countPos(input);
			}
	    }
	    else 
		{
			return 0; //return nothing if no input
		}
	}

}
