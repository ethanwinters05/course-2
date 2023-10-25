package com.jap.addevens;

public class AddEven
{
    //Write the logic to add evens in the methods
    public long addEvens(int n)    
	{
		if(n<=0)
		{
			return 0;
		}
		else if(n%2==0)
		{
			return n+addEvens(n-2);
		}
		else
		{
             return addEvens(n-1);   
		}
      
    }
        public static void main(String[] args) {
        // Initialize the object of AddEven class
            AddEven addEven = new AddEven();
            // Declare a variable to give as input to the addEvens method
             int number=9;
			 long sum=addEven.addEvens(number);
            // Call the addEvens method and display the result
            System.out.println("sum of even numbers up to " + number + "is"+sum);
        }


}
