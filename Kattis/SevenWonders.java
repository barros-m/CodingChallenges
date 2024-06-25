/** 
 * Problem: https://open.kattis.com/contests/w5y2ty/problems/sevenwonders
 * 
 */

import java.util.Scanner;

public class SevenWonders
{
   public static void main(String [] args)
   {
      Scanner in = new Scanner (System.in);
      String cards = in.next();

      System.out.println(points(cards));

   }

   public static int points(String cards)
   {
      int numT = 0;
      int numC = 0;
      int numG = 0;

      boolean hasT = false;
      boolean hasC = false;
      boolean hasG = false;

      int length = cards.length();

      // int extraPoints = 0;

      for (int i = 0; i < length; i++)
      {
         if (cards.charAt(i) == 'T')
         {
            numT++;
            hasT = true;
         }
         if (cards.charAt(i) == 'C')
         {
            numC++;
            hasC = true;
         }
         if (cards.charAt(i) == 'G')
         {
            numG++;
            hasG = true;
         }
         // if (numC == numT && numT == numG)
         // {
         //    hasT = false;
         //    hasC = false;
         //    hasG = false;
         //    extraPoints++;
         // }
      }

      int points = (int)(Math.pow(numT, 2) + Math.pow(numC, 2) + Math.pow(numG, 2));

      int currMin = 0;
      // If you have all types of card
      if (hasG && hasC && hasT)
      {
         currMin = numT;
         // get the one that you have the least
         if (currMin > numG)
         {
            currMin = numG;
         }
         if (currMin > numC)
         {
            currMin = numC;
         }

      }

      points = points + currMin*7;


      return points;
   }

   // // get the number of cards that you have less of this type
   // // e.g. TTTCCGG. return 2, because you have 2 C's
   // public static int getMin(String cards)
   // {
   //
   // }
}
