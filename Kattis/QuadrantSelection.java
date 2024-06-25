/** 
 *
 * Problem: https://open.kattis.com/problems/quadrant 
 * 
 */

import java.util.*;

class s
{
   public static void main (String [] args)
   {
      Scanner in = new Scanner (System.in);

      int x = in.nextInt();
      int y = in.nextInt();

      int quad = 1;

      if (x > 0 && y > 0)
      {
         quad = 1;
      }
      else if (x < 0 && y > 0)
      {
         quad = 2;
      }
      else if (x < 0 && y < 0)
      {
         quad = 3;
      }
      else if ( x > 0 && y < 0)
      {
         quad = 4;
      }
      System.out.println(quad);
   }

}