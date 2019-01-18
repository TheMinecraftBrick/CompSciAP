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
      @SuppressWarnings("resource")
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
			notFinished = (repeat.equalsIgnoreCase("y")); //This was the more efficient way of doing things
			System.out.println();
		}
		while (notFinished);
	}
}

//---------------Lab Notes---------------\\
/*
Before i started writing any code, i spent time trying to think of what exactly i have to do.
After some thinking, i came to the conclusion that i needed to find the first letter and last
letter, compare the two, then move in a letter and do the same. But how was i going to do this?

After thinking some more, i ended up using s.substring() and defining a start index and an end index integers. 
I initiated the end index as the string length( therefore being the last letter when used in the substring method) 
and the start index as 0. from there I created a for loop that would repeat for the length of the string(so 
i could check every letter) counting down. Inside the for loop i used the if statement described earlier, using the
substring method and .equalsIgnoreCase so casing would not matter at all, making the code much more efficient. 
then another if statement was added to confirm that we made it through every letter. once we've done that we set 
isPalindrome to true and return that. 

my next goal was for the 100point version. Where i had to confirm that it was not one word, to do this, i just checked
if the string contains a space. From there, i went and replaced all the special characters using the replaceAll method
to become null. From there, i sent my new edited string into my isPal method i described above,  and if its true 
i set almost pal to true and return. If there is no space i instantly return false;

As for the other two methods, i found them to be redundant and pointless, so i added some simple working code
such as matching the letter to a letter and using what i had previously done for purge. In theory it would work
but as there is no point i just simply never called it.

lastly i went through and set each scenario given to confirm everything did as expected.

 */
//-------------------------------------\\



