package lab11;
// 3/5/19 Kush Dalal
// Lab11bvst Version 3
//This class compiles the deck and card class to print the shuffled version

// This is the Student starting version of the <Deck> class lab11b assignment.

public class Lab11bvst {

	public static void main(String[] args) 
	{
		Deck deck = new Deck(); //creates a new deck
		deck.shuffle(); //shuffles that deck
		System.out.println(deck.FullDeck()); //prints that shuffled deck
	}
	
	
}
