package Lab17a;

class Test
{
	// displays consecutive integers from k to n
	public static void countUp(int k, int n)
	{
		for (int i = 0; i < n; i++)
		{
			countUp(k++, n);
			System.out.print(k + " ");
		}
		
		
		
		
	}
   
	// displays consecutive integers backwards from k to n
	public static void countDown(int k, int n)
	{
		k--;
		countDown(k, n);
		System.out.print(k+ " ");
	}
   
	// returns the sum of all integers 1 + 2 + .... + n-1 + n
	public static int sum(int n)
	{
		if (n == 1)
	        return 1;
		else {
			return n + sum(n + 1);
		}
	}
    
	// returns n factorial
	public static int factorial(int n)
	{
		if (n == 1)
	        return 1;
	    else
	        return n * factorial(n-1);
	}
   
	// returns the nth Fibonacci number
	public static int fibo(int n)
	{
		if(n == 1)
			return 1;
		else {
			
		}
	}
   
	// returns the gcf of n1 and n2
	public static int gcf(int n1, int n2)
	{
		if (n1 == n2)
		{
			return n1;
		}
		else {
			return gcf(Math.max(n1, n2) - Math.min(n1, n2), Math.min(n1, n2));

		}
		
	}		
   
	// returns n1 raised to the n2 power
	public static int pow(double d, int n2)
	{
		Math.pow(d, n2);
		return pow(Math.pow(d, n2), n2);
	}
   
}    

