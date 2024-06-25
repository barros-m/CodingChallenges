/**
 * 
 * Problem : https://open.kattis.com/contests/xyn2bc/problems/autori
 */

 import java.util.*;

 class c
 {
    public static void main (String [] args)
    {
       Scanner in = new Scanner (System.in);
 
       String name = in.nextLine();
       System.out.printf("%c", name.charAt(0));
       for (int i = 0, n = name.length() - 1; i < n; i++)
       {
          if (name.charAt(i) == '-')
          {
             System.out.printf("%c", name.charAt(i+1));
          }
       }
       System.out.println();
    }
 
 }