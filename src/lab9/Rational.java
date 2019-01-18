package lab9;

public class Rational
{

	public Rational(int num, int den)
	{
		
	}

	public void displayData()
	{
		System.out.println();
		System.out.println(getNum() + "/" + getDen() + " equals " + getDecimal());
		System.out.println();
	}

	private String getDecimal()
	{
		
		return null;
	}

	private String getDen()
	{
				return null;
	}

	private String getNum()
	{
				return null;
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
