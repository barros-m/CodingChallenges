/**
 * Problem: https://open.kattis.com/contests/w5y2ty/problems/lineup
 * 
 */

import java.util.Scanner;

public class LineThemUp
{
   public static void main(String [] args)
   {
      Scanner in = new Scanner (System.in);

      // Number of entries
      int k = in.nextInt();

      String [] names = new String [k];

      for (int i = 0; i < k; i++)
      {
         names[i] = in.next();
      }

      int order = order(names);

      if (order == 1)
      {
         System.out.println("INCREASING");
      }
      else if (order == -1)
      {
         System.out.println("DECREASING");
      }
      else if (order == 0)
      {
            System.out.println("NEITHER");
      }
   }

   /*
      Return -1 if it is decreasing, 0 neither, 1 incresasing
   */
   public static int order(String [] names)
   {
      int length = names.length;
      boolean isIncreasing = false;
      boolean isDecreasing = false;

      int a = 0;
      int b = 0;
      int charN = 0;

      for (int i = 1; i < length; i++)
      {
         charN = 0;

         a = 0;
         b = 0;

         while(a == b)
         {
            a = (int) names[i-1].charAt(charN);
            b = (int) names[i].charAt(charN);
            charN++;
         }

         // If it is decrasing
         if (a > b)
         {
            //System.out.println("DEC");
            isDecreasing = true;
         }
         // If it is increasing
         if (a < b)
         {
            //System.out.println("INC");
            isIncreasing = true;
         }

      }

      if (isIncreasing && isDecreasing)
      {
         return 0;
      }

      if (isIncreasing)
      {
         return 1;
      }
      else
      {
         return -1;
      }
   }
}
