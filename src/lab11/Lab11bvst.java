package lab11;
// 3/5/19 Kush Dalal
// Lab11bvst Version 3
//This class compiles the deck and card class to print the shuffled version

// This is the Student starting version of the <Deck> class lab11b assignment.

public class Lab11bvst {

<<<<<<< HEAD
	public static void main(String[] args) 
	{
		Deck deck = new Deck(); //creates a new deck
		deck.shuffle(); //shuffles that deck
		System.out.println(deck.FullDeck()); //prints that shuffled deck
=======
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
			cards[i] = new Card(suits[i], rank[j], numbers[j]);
			
		}
>>>>>>> 62d1ee2e0847f830e383becf18e91651eb572823
	}
	
	
}
