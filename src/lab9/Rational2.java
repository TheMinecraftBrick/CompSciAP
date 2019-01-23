package lab9;

public class Rational2
{
	
		private int firstNum;	   // entered numerator
		private int firstDen;	   // entered denominator
		private int reducedNum;		// reduced numerator
		private int reducedDen;		// reduced denominator
	    private int gcf;           // greatest common factor

		
		

		public Rational2(int num1, int den1)
		{
			firstNum = num1;
			firstDen = den1;
		}
		
		


		public Rational2()
		{
			// TODO Auto-generated constructor stub
		}




		private void getGCF(int n1,int n2)
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
			}
			while (rem != 0);
		}


		public String getOriginal()
		{
			String endString = firstNum + "/" + firstDen;
			return endString;
		}


		public void multiply(Rational2 r1, Rational2 r2)
		{
		  int multiplied = r1.getOriginal() * r2.getOriginal();
			
		}


		public void divide(Rational2 r1, Rational2 r2)
		{
			// TODO Auto-generated method stub
			
		}


		public String getReduced()
		{
			// TODO Auto-generated method stub
			return null;
		}


	
}
