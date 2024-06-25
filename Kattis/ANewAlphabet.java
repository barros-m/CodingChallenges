/**
 *
 * Problem: https://open.kattis.com/contests/w5y2ty/problems/anewalphabet
 * 
 * ---- Results ----
 * Judgment: Accept
 * Test Cases: 7/7
 *  
 */

import java.util.Scanner;
import java.util.*;

public class ANewAlphabet
{
   public static void main(String [] args)
   {
      Scanner in = new Scanner (System.in);

      String abc = in.nextLine();

      abc = abc.toUpperCase();

      System.out.println(convertWord(abc));
   }

   public static String convertWord (String word)
   {
      String finalWord = "";
      for (int i = 0, n = word.length(); i < n; i++)
      {
         finalWord += convertChar(word.charAt(i));
      }
      return finalWord;
   }

   public static String convertChar(char letter)
   {
      //letter = letter.toupper();
      String same = "";
      same += letter;

      switch (letter)
      {
         case 'A':
            return "@";
         case 'B':
            return "8";
         case 'C':
            return "(";
         case 'D':
            return "|)";
         case 'E':
            return "3";
         case 'F':
            return "#";
         case 'G':
            return "6";
         case 'H':
            return "[-]";
         case 'I':
            return "|";
         case 'J':
            return "_|";
         case 'K':
            return "|<";
         case 'L':
            return "1";
         case 'M':
            return "[]\\/[]";
         case 'N':
            return "[]\\[]";
         case 'O':
            return "0";
         case 'P':
            return "|D";
         case 'Q':
            return "(,)";
         case 'R':
            return "|Z";
         case 'S':
            return "$";
         case 'T':
            return "']['";
         case 'U':
            return "|_|";
         case 'V':
            return "\\/";
         case 'W':
            return "\\/\\/";
         case 'X':
            return "}{";
         case 'Y':
            return "`/";
         case 'Z':
            return "2";
         default:
            return same;
      }
   }
}