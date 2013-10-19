using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProgrammingAssignment5
{
    class Program
    {
        static void Main(string[] args)
        {
            Random randNum = new Random();
            int[] playersWins = new int[2];
            int[] playersDice = new int[2];
            const int p1 = 0;
            const int p2 = 1;
            const int diceMin = 1;
            //The dice goes until 13
            const int diceMax = 14;
            const int numBattle = 21;
            bool cont = true;
            

            Console.Write("Welcome. Let's play a War game.\n");

            while (cont)
            {
                playersWins[p1] = 0;
                playersWins[p2] = 0;

                for (int i = 0; i < numBattle; i++)
                {
                    playersDice[p1] = randNum.Next(diceMin, diceMax);
                    playersDice[p2] = randNum.Next(diceMin, diceMax);

                    while (playersDice[p1] == playersDice[p2])
                    {
                        Console.Write("   WAR! " + "P1:" + playersDice[p1] + " P2:" + playersDice[p2] + "\n");
                        playersDice[p1] = randNum.Next(diceMin, diceMax);
                        playersDice[p2] = randNum.Next(diceMin, diceMax);
                    }

                    Console.Write("\nBATTLE: ");
                    Console.Write("P1:" + playersDice[p1]);
                    Console.Write(" P2:" + playersDice[p2]);

                    if (playersDice[p1] > playersDice[p2])
                    {
                        Console.Write(" P1 WINS!\n");
                        playersWins[p1]++;
                    }
                    else
                    {
                        Console.Write(" P2 WINS!\n");
                        playersWins[p2]++;
                    }

                }

                if (playersWins[p1] > playersWins[p2])
                {
                    Console.Write("P1 is the overall Winner with " + playersWins[p1] + " battles!\n");

                }
                else
                {
                    Console.Write("P2 is the overall Winner with " + playersWins[p2] + " battles!\n");
                }

                Console.Write("\nDo you want to play again (y/n)?");
                String op = Console.ReadLine().ToUpper();

                if (op == "Y") continue;
                else if (op == "N") cont = false;
                else Console.Write("\nWrong continue option. We will play one more time, ok?");
            }

        }
    }
}
