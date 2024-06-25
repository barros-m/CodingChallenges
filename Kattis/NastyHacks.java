/**
 * Problem: https://open.kattis.com/problems/nastyhacks
 * 
 */

import java.util.*;

class s
{
   public static void main (String [] args)
   {
      Scanner in = new Scanner (System.in);

      int cases = in.nextInt();
      while (cases > 0)
      {
         cases--;
         int a = in.nextInt();
         int b = in.nextInt();
         int c = in.nextInt();


         if (a < b - c)
         {
            System.out.println("advertise");
         }
         else if (a == b - c)
         {
            System.out.println("does not matter");
         }
         else if (a > b - c)
         {
            System.out.println("do not advertise");
         }
      }

   }

}