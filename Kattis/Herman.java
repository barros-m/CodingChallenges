/**
 * 
 * Problem : https://open.kattis.com/contests/xyn2bc/problems/herman
 * 
 */

 import java.util.*;

 class h
 {
    public static void main (String [] args)
    {
       Scanner in = new Scanner (System.in);
       double PI = Math.PI;
       double r = in.nextDouble();
 
       System.out.printf("%.6f\n", r*r*PI);
       System.out.printf("%.6f\n", 4*r*r/2);
    }
 }