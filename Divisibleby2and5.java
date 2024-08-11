import java.util.*;
public class Divisibleby2and5
{
	public static void main(String[] args) 
	{
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
	    if(n==0)
		{
		    System.out.println("The number is zero so cannot divided by any number.");
		}
		else
		{
		    if(n%5==0)
		
		    if(n%2==0)
		    {
		        System.out.println("The number is divisible by 5 and 2.");
		    }
		    else
		    {
		        System.out.println("The number is divisible by 5 but not divisible by 2.");
		    }
		else if(n%2==0)    
		{
		   System.out.println("The number is divisible by 2 but not divisible by 5.");
		}
		
		
		else
		{
		    System.out.println("The number is not divisible by 5 and 2.");
		}
		
		}
		
		
		
	}
}
