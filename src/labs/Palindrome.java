package labs;
/*Kush Dalal
 * 1/13/19  AP Comp Sci A
 */


public class Palindrome
{

	public static boolean isPal(String s)
	{
		// ------ Variables ------\\
		int endIndex = s.length();
		boolean isPalindrome = false;
		int startIndex = 0;
		int i = 0;
		// -----------------------\\
		for (i = s.length(); i > 0; i--)
		{
			// checks if the first and last letter equal each other, then the 2nd and 2nd
			// last, etc for however many letters there are in the phrase
			if (s.substring(startIndex, startIndex + 1).equalsIgnoreCase(s.substring(endIndex - 1, endIndex)))
			{

				if (i == 1 || i == 0) // waiting to confirm we get through all the letters
				{
					isPalindrome = true; // let the return know it needs to be true
				}
				startIndex++; // add and subtract so we do a different pair of letters each time.
				endIndex--;
			}

		}

		return isPalindrome; //return if its true or false

	}
	
	//------This is pointless and purely because i was forced to add it ------\\
	private static boolean isLetter(String letter) 
	{
		boolean isLetter = false; //a boolean for if its a letter
		if(letter.matches(".*[A-Z].*")) { //see if it matches A-Z meaning its a letter
			isLetter = true;
		}
		return isLetter; //return true or false;
	}
	

	//Again a pointless method, i just need to have it apperntly\\
	private static String purge(String s)
	{
		// ------ Variables ------\\
		String endString = "";
		String s2;
		String s3;
		String s4;
		// -----------------------\\
		
		if (s.contains(" ")) //check if theres a space so it can be and Almost Pal
		{
			//////replace all the weird characters//////
			s2 = s.replaceAll(" ", "");
			s3 = s2.replaceAll(",", "");
			s4 = s3.replaceAll("'", "");
			
			endString = s4;
			
		}
		//See the below method almostPal, the reason it should be done in almostPal rather than a seperate method is due to efficiency, no need to try carry over a variable that comes from 4 lines of code.
		return endString; 
	}

	//------------------------------------------------------------------------\\
	
	
	public static boolean almostPal(String s)
	{
		// ------ Variables ------\\
		boolean isAlmostPal = false;
		String s2;
		String s3;
		String s4;
		String s5;
		// -----------------------\\
		
		if (s.contains(" ")) //check if theres a space so it can be and Almost Pal
		{
			//////replace all the weird characters//////
			s2 = s.replaceAll(" ", "");
			s3 = s2.replaceAll(",", "");
			s4 = s3.replaceAll("'", "");
			s5 = s4.replaceAll(";", "");
			//this was here for some testing purposes: System.out.println(s4);
			///////////////////////////////////////////
			if (isPal(s5)) //Run the script from above that tests for a palindrome now that there are now special chars
			{
				isAlmostPal = true;
			}
		}else //if theres no spaces then it must be one word
		{ 
			isAlmostPal = false;
		}

		return isAlmostPal; //return if its true or false
	}

}
