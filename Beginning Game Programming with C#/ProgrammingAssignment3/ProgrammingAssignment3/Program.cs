using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using ConsoleCards;

namespace ProgrammingAssignment3
{
    class Program
    {
        /// <summary> 
        /// A single hand of Blackjack
        /// </summary> 
        /// <param name="args">command-line args</param> 
        static void Main(string[] args)
        {
            //Declare variables for and create a deck of cards and blackjack hands for the dealer and the player

            Deck deck = new Deck();
            BlackjackHand dealerHand = new BlackjackHand("Dealer");
            BlackjackHand playerHand = new BlackjackHand("Player");

            //Print a “welcome” message to the user telling them that the program will play a single hand of Blackjack

            Console.WriteLine("You will play a single hand of Blackjack.");

            // Shuffle the deck of cards

            deck.Shuffle();

            //Deal 2 cards to the player and dealer
            dealerHand.AddCard(deck.TakeTopCard());
            playerHand.AddCard(deck.TakeTopCard());

            //Show all the player’s cards 

            playerHand.ShowAllCards();

            //Show the dealer’s first card 

            dealerHand.ShowFirstCard();

            //Print both the player’s hand and the dealer’s hand

            playerHand.Print();
            dealerHand.Print();

            //Let the player hit if they want to

            playerHand.HitOrNot(deck);

            //Show all the dealer’s cards

            dealerHand.ShowAllCards();

            //Print both the player’s hand and the dealer’s hand

            playerHand.Print();
            dealerHand.Print();

            //Print the scores for both hands

            Console.WriteLine("Player's score: " + playerHand.Score + ".");
            Console.WriteLine("Dealer's score: " + dealerHand.Score + ".");
            
        }
    }
}
