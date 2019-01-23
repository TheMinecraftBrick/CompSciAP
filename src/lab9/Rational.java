package lab9;

public class Rational
{
	public double numerator;
	public double denominator;
	
	public Rational(int num, int den)
	{
		numerator = num;
		denominator = den;
	
	}

	public void displayData()
	{
		System.out.println();
		System.out.println(getNum() + "/" + getDen() + " equals " + getDecimal());
		System.out.println();
	}

	private String getDecimal()
	{
		double decimal = numerator/denominator;
		String stringDec = Double.toString(decimal);
		return stringDec;
	}

	private String getDen()
	{
		String stringDen = Double.toString(denominator);
		return stringDen;
	}

	private String getNum()
	{
		String stringNum = Double.toString(numerator);
		return stringNum;
	}

	private void getGCF(int n1, int n2)
	{
		int rem = 0;
		do
		{
			rem = n1 % n2;
			int gcf;
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
