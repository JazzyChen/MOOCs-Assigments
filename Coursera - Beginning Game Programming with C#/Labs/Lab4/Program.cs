using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Lab4
{
    class Program
    {
        static void Main(string[] args)
        {
            // create a new deck and print the contents of the deck

            Deck x = new Deck();
            x.Print();

            // shuffle the deck and print the contents of the deck

            Console.WriteLine();
            x.Shuffle();
            x.Print();

            // take the top card from the deck and print the card rank and suit

            Card c = x.TakeTopCard();
            Console.WriteLine(c.Rank);

            // take the top card from the deck and print the card rank and suit

            c = x.TakeTopCard();
            Console.WriteLine("Rank: " + c.Rank);
            Console.WriteLine("Suit: " + c.Suit);
        }
    }
}
