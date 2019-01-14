// Lab08vst.java
// Kush Dalal
// The "Palindrome" Program
// This is the student starting file for Lab08.
package labs;

import java.util.Scanner;

public class Lab08
{
	public static void main (String[] args)
	{
      Scanner input = new Scanner(System.in);
		boolean notFinished = false;
		do
		{
			System.out.print("Enter a string  ===>>  ");
			String str = input.nextLine();
			System.out.println();
			System.out.println("Entered String:     " + str);
			System.out.println("Palindrome:         " + Palindrome.isPal(str));
			System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));	  // used only for the 100 point version
			System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
			String repeat = input.nextLine();
			notFinished = (repeat.equals("Y")) || (repeat.equals("y"));
			System.out.println();
		}
		while (notFinished);
	}
}





