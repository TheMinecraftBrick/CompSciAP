package lab11broke;
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
	private String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	private String[] rank = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Jack", "Queen", "King"};
	int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private Card[] cards;
	private int size;
	

	public Deck() 
   {
		size = 52;
		cards = new Card[size];
		
	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 13; j++)
		{
		
			
		}
	}
      
	}    
 }
