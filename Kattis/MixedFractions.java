/**
 *
 * Problem: https://open.kattis.com/contests/w5y2ty/problems/mixedfractions
 *  
 * ---- Results ----
 * Judgment: Accept
 * Test Cases: 6/6
 */

import java.util.Scanner;

public class MixedFractions
{
   public static void main(String [] args)
   {
      Scanner in = new Scanner (System.in);

      int nominator = 1;
      int flagNom = 1;
      int denominator = 1;
      int flagDen = 1;
      int mix = 1;


      do
      {
         nominator = in.nextInt();
         denominator = in.nextInt();
         flagNom = nominator;
         flagDen = denominator;

         if (flagDen == 0 && flagNom == 0)
         {
            return;
         }


         mix = nominator / denominator;
         nominator = nominator % denominator;
         System.out.println(mix + " " + nominator + " / " + denominator);
      } while (flagNom != 0 || flagDen != 0);

   }

}