package lab9;

public class Rational
{
	public double numerator; //The first numerator
	public double denominator; //The first denominator
	int gcf = 0; //the gcf
	int reducedNum; //the reduced numerator
	int reducedDen; //the reduced denominator

	public Rational(int num, int den)
	{
		numerator = num; //define 
		denominator = den;
	
	}

	public void displayData() //given display data method 
	{
		System.out.println();
		System.out.println(getOriginal() + " equals " + getDecimal());
		System.out.println();
		getGCF((int)numerator, (int)denominator); //get the gcf when we reduce
		reduce(); //reduce the number
		System.out.println("and reduces to " + getReduced()); //return the reduced number
		System.out.println();
	}
	
	private void reduce() 
	{
		reducedNum = (int) (numerator/gcf); //reduce by dividing the numerator by the gcf
		reducedDen = (int) (denominator/gcf); //do the same with the denominator
	}

	private String getReduced()
	{
		String reducedString = reducedNum + "/" + reducedDen; //create the string
		return reducedString;
		//return the reduced string
	}

	private String getDecimal()
	{
		double decimal = numerator/denominator; //get the actual output of division
		String stringDec = Double.toString(decimal); //cast the double to a string
		return stringDec; //return this number
	}

	private String getOriginal()
	{
		String endString = (int) numerator + "/" + (int) denominator; //just make a compiled string
		return endString; // return that string
	}

	private void getGCF(int n1, int n2)
	{
		////////Calculate the gcf\\\\\\\\
		int rem = 0;
		do
		{
			rem = n1 % n2;
			
			if (rem == 0)
				gcf = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		} while (rem != 0);
		//////////////////\\\\\\\\\\\\\\\\
	}

}
