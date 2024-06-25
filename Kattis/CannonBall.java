/**
 * 
 * Problem : https://open.kattis.com/problems/humancannonball2
 *
 */


 import java.util.*;

 class cannonball
 {
    public static void main (String [] args)
    {
       int n;
       double v, theta, x, h1, h2;
       String line;
 
       Scanner in = new Scanner (System.in);
 
       n = in.nextInt();
       while (n > 0)
       {
          n--;
          v = in.nextDouble();
          theta = in.nextDouble();
          x = in.nextDouble();
          h1 = in.nextDouble();
          h2 = in.nextDouble();
          if (isSafe(v, theta, x, h1, h2))
          {
             System.out.println("Safe");
          }
          else
          {
             System.out.println("Not Safe");
          }
       }
    }
 
    static double safetyMargin = 1.0;
    static double gravity = 9.81;
    public static boolean isSafe(double v, double the, double x, double h1, double h2)
    {
       double y;
       double theta = Math.toRadians(the);
       double t = x / (v * Math.cos(theta));
 
       y = (v * (t) * Math.sin(theta)) - ((gravity/2) * Math.pow(t, 2));
       boolean isSafe = true;
 
       if (!((y - h1) >= safetyMargin))
       {
          
          isSafe = false;
       }
 
       if (!((h2 - y) >= safetyMargin))
       {
 
          isSafe = false;
       }
       return isSafe;
    }
 }