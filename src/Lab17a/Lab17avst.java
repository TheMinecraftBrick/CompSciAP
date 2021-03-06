package Lab17a;

// Lab17avst.java
// The Recursive Methods Program
// This is the student, starting version of the Lab17a assignment.
// Students need to write the implementations of the
// <countUp>, <countDown>, <sum>, <fact>, <pow>, <fibo> and <gcf> methods.

	      
public class Lab17avst
{
	public static void main(String[] args)
	{
		System.out.println("Counting from 1 up to 10");
		Test.countUp(1,10);
		skip3();
		System.out.println("Counting from 10 down to 1");
		Test.countDown(1,10);
		skip3();
		System.out.println("The sum of all integers 0 to 100 is " + Test.sum(100));
		skip2();	
		System.out.println("The factorial of 8 is " + Test.factorial(8));
		skip2();
		System.out.println("The 10th Fibonacci Number is " + Test.fibo(10));
		skip2();
		System.out.println("The GCF of 120 and 108 is " + Test.gcf(120,108));
		skip2();
		System.out.println("2 raised to the 8th power is " + Test.pow(2,8));
		skip2();
	}
	
	public static void skip2()	  
   { 
      System.out.println("\n");
   }
	
	public static void skip3()  	
   { 	
      System.out.println("\n\n");
   }	
}




