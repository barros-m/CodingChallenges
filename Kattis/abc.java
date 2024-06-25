/**
 *
 * Problem: https://open.kattis.com/problems/abc
 *
 * ---- Results ----
 * Judgment: Accept
 * Test Cases: 12/12
 * 
 */

// Use Scanner class
import java.util.Scanner;
import java.util.Arrays;

public class abc
{
   public static void main(String [] args)
   {
      Scanner in = new Scanner (System.in);

      int [] nums = new int [3];

      int first = in.nextInt();
      nums[0] = first;
      int second = in.nextInt();
      nums[1] = second;
      int third = in.nextInt();
      nums[2] = third;


      String str = in.next();

      System.out.println(order(str, nums));
   }

   public static String order(String str, int [] nums)
   {
      int length = str.length();
      String order = "";

      int [] h = new int [3];


      for (int i = 0; i < length; i++)
      {
         h[i] = (int) str.charAt(i) - 65;
      }

      Arrays.sort(nums);

      for (int i = 0; i < length; i++)
      {
         if (i != length-1)
         {
            order += (nums[h[i]] + " ");
         }
         else
         {
            order += nums[h[i]];
         }
      }
      return order;
   }
}