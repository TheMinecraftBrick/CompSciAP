package lab11;
// 3/5/19 Kush dalal
// Lab11bvst.java
// This is the Student starting version of the <Deck> class lab11b assignment. 


public class Lab11bvst
{
	public static void main(String[] args)
	{ 
      Deck deck = new Deck();
      System.out.println(deck);
	}
}


class Deck 
{
	private Card[] cards;
	private int size;

	public Deck() 
   {
      size = 52;
		cards = new Card[size];
	}    
 }
