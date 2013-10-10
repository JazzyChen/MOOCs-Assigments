using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ProgrammingAssignmentWeek1
{
    class Program
    {
        int totalGold;
        float numberOfHours;

        public Program()
        {
            this.totalGold = 0;
            this.numberOfHours = 0;

        }

        public Program(int totalGold,float numberOfHours)
        {
            this.totalGold = totalGold;
            this.numberOfHours = numberOfHours;
        }

        private void printWelcomeMessage()
        {
            this.promptMessage("Hello user.\n This app will calculate your average gold-collecting performance.\nLet's go!\n");
        }

        private void promptMessage(String s)
        {
            Console.Write(s);
        }

        private void getGold()
        {
            this.totalGold = int.Parse(Console.ReadLine());
            this.promptMessage("\n");
        }

        private void getHours()
        {
            this.numberOfHours = float.Parse(Console.ReadLine());
            this.promptMessage("\n");
        }

        private void printStats()
        {
            float totalMin = this.numberOfHours * 60;
            float goldPerMin = this.totalGold / totalMin;

            this.promptMessage("Gold: " + this.totalGold + "\nHours played: " + this.numberOfHours +
                "\nGold per min: " + goldPerMin + "\n");
        }

        static void Main(string[] args)
        {
            Program controller = new Program();

            controller.printWelcomeMessage();
            controller.promptMessage("Type the gold you've gathered: ");
            controller.getGold();
            controller.promptMessage("Type the number of hours you've spent gathering this gold: ");
            controller.getHours();
            controller.printStats();


        }
    }
}
