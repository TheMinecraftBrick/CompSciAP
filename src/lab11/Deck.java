package lab11;
// 3/5/19 Kush Dalal (edited on 3/7/19 to add shuffling)
// This class creates the deck then shuffles it.

import java.util.Random;



public class Deck {
	
	private Card[] cards; //private variables
	private int size; 
	
	public Deck() {
		
		/////////////Store the suits ranks and number/////////////
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" }; 
		String[] rank = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" }; 
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 }; 
		//-----Store card size and create cards-----\\
		size = 52;
		cards = new Card[size];
		/////////////////////////////////////////////////////////
		
		
		for (int k = 0; k < 4; k++) //repeat for each of the four suits
		{
			
			for (int i = 0; i < 13; i++) //repeat for each of the numbers
			{
				cards[k * 13 + i] = new Card(suits[k], rank[i], numbers[i]); //Take the card array, and for each new card created, create a new spot in the array for it.
			}
		}
	}
	
	
	
	

	public String FullDeck()
	{
		String finalDeck = "";
		for (int i = 0; i < size; i++) //repeat each time for all 52 cards
		{
			finalDeck += cards[i].toString() + "\n"; //combine each card  using the toString method, to make the final deck. use \n for linebreak
		}
		return finalDeck; //return that deck to be printed
	}
	
	
	
	

	public void shuffle() 
	{
		Random rand = new Random(); //instantiate random method
		for (int i = 0; i < 5000; i++) //repeat 5000 times because why not(to completely shuffle)
		{
			int pos1 = rand.nextInt(52);  //determine the new position for the card
			int pos2 = rand.nextInt(52); 
			Card temp = cards[pos2];  //create a temporary position
			cards[pos2] = cards[pos1]; //swap the positions of cards 1 and 2
			cards[pos1] = temp; 
		}
	}

}