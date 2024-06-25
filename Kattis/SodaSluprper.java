/** 
 *
 * Problem: https://open.kattis.com/problems/sodaslurper
 * 
 * ---- Results ----
 * Judgment: Accept
 * Test Cases: 15/15
 * 
 */

import java.util.Scanner;

public class SodaSluprper
{
   public static void main (String [] args)
   {
      Scanner in = new Scanner (System.in);

      int e = in.nextInt();
      int f = in.nextInt();
      int c = in.nextInt();

      int rn = 0;
      int tb = e+f;
      int r = 0;

      while ((tb) >= c)
      {
         rn = (int) (tb)/c;
         r += rn;

         f = (e+f)%c;
         e = rn;

         tb=e+f;
      }

      System.out.println(r);
   }
}