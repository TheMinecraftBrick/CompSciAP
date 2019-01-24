package lab9;

public class Rational
{
	public double numerator;
	public double denominator;
	int gcf = 0;
	int reducedNum;
	int reducedDen;

	public Rational(int num, int den)
	{
		numerator = num;
		denominator = den;
	
	}

	public void displayData()
	{
		System.out.println();
		System.out.println(getOriginal() + " equals " + getDecimal());
		System.out.println();
		getGCF((int)numerator, (int)denominator); //get the gcf when we reduce
		reduce();
		System.out.println("and reduces to " + getReduced());
		System.out.println();
	}
	
	private void reduce() 
	{
		reducedNum = (int) (numerator/gcf);
		reducedDen = (int) (denominator/gcf);
	}

	private String getReduced()
	{
		String reducedString = reducedNum + "/" + reducedDen;
		return reducedString;
	}

	private String getDecimal()
	{
		double decimal = numerator/denominator;
		String stringDec = Double.toString(decimal);
		return stringDec;
	}

	private String getOriginal()
	{
		String endString = (int) numerator + "/" + (int) denominator;
		return endString;
	}

	private void getGCF(int n1, int n2)
	{
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
	}

}
