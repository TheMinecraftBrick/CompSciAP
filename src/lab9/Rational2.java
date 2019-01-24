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
			firstNum = num1; // define the first numerator as the input
			firstDen = den1; // define the first denominator as the input
		}
		
		


		public Rational2()
		{
			//A simple placeholder
		}

		private void reduce() 
		{
			getGCF(firstNum, firstDen); //get the gcf when we reduce
			reducedNum = firstNum/gcf;	//actually reduce it 
			reducedDen = firstDen/gcf;
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
		  this.firstNum = r1.firstNum * r2.firstNum;
		  this.firstDen = r1.firstDen * r2.firstDen;
		  reduce();
		  
		}


		public void divide(Rational2 r1, Rational2 r2)
		{
			this.firstNum = r1.firstNum * r2.firstDen;
			this.firstDen = r1.firstDen * r2.firstNum;
			reduce();
			
		}


		public String getReduced()
		{
			String reducedString = reducedNum + "/" + reducedDen;
			return reducedString;
		}




		public void add(Rational2 r1, Rational2 r2)
		{
			this.firstNum = (r1.firstNum * r2.firstDen) + (r2.firstNum * r1.firstDen);
			this.firstDen = r1.firstDen * r2.firstDen;
			reduce();
		
		}




		public void subtract(Rational2 r1, Rational2 r2)
		{
			this.firstNum = (r1.firstNum * r2.firstDen) - (r2.firstNum * r1.firstDen);
			this.firstDen = r1.firstDen * r2.firstDen;
			reduce();
			
		}


	
}
