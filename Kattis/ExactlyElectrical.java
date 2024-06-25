/**
 * 
 * Problem : https://open.kattis.com/problems/exactlyeletrical
 * 
 */

 import java.util.*;

 class Electrical
 {
    public static void main(String [] args)
    {
       int x0, y0;
       int x1, y1;
       int fuel;
 
       Scanner in = new Scanner (System.in);
 
       x0 = in.nextInt();
       y0 = in.nextInt();
       x1 = in.nextInt();
       y1 = in.nextInt();
       fuel = in.nextInt();
 
       if (isEnough(x0, y0, x1, y1, fuel))
       {
          System.out.println("Y");
       }
       else
       {
          System.out.println("N");
       }
    }
 
    public static boolean isEnough(int x0, int y0, int x1, int y1, int fuel)
    {
       int distance = 0;
       distance = Math.abs(y0 - y1) + Math.abs(x0 - x1);
       int fakeDistance = (fuel - distance);
       if (fakeDistance >= 0 && fakeDistance % 2 == 0)
       {
          return true;
       }
       else
       {
          return false;
       }
    }
 }
 