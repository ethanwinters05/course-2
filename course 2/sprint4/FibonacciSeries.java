package com.jap.fibonacci;

public class FibonacciSeries
{
    // Write the logic in the method to generate the next number in the Fibonacci series
    public long fibonacci(long n) 
	{
		if(n<0)
		{
			return -1;
		}
		else if (n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		else
		{
            return fibonacci(n-1)+fibonacci(n-2);
		}
        
    }
    // Print the series inside the method
    public void printFibonacciSeries(long n)
	{
      for(int i=0;i<n;i++)
	  {
	  System.out.println(fibonacci(i)+" ");
	  }
    }
    public static void main( String[] args )
    {
        FibonacciSeries fib = new FibonacciSeries();
        // Call the  printFibonacciSeries() method and pass the value.
		fib.printFibonacciSeries(9);


    }
}
