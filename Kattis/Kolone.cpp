/**
 * 
 * Problem: https://open.kattis.com/contests/trknex/problems/kolone
 *
 * ---- Results ----
 * Judgment: Accept
 * Test Cases: 13/13
 */

#include <iostream>
#include <string.h>
#include <stdio.h>

using namespace std;

int main()
{
   int n1;
   int n2;

   scanf("%d %d", &n1, &n2);

   int totalAnts = n1 + n2;
   char ants [totalAnts];
   int toRight [totalAnts];
   for (int i = n1-1; i >= 0; i--)
   {
      cin >> ants[i];
      toRight[i] = 1;
   }
   for (int i = n1; i < totalAnts; i++)
   {
      cin >> ants[i];
      toRight[i] = 0;
   }

   int jumps = 0;
   cin >> jumps;

   for (int i = 0; i < jumps; i++)
   {
      for (int j = 0; j < totalAnts-1; j++)
      {
         if (toRight[j] == 1 && toRight[j + 1] == 0)
         {
            swap(toRight[j], toRight[j + 1]);
            swap(ants[j], ants[j + 1]);
            j++;
         }
      }
   }

   // Print
   for (int i = 0; i < totalAnts; i++)
   {
      cout << ants[i];
   }
}

// Swap two elements
void swap (int &a, int &b)
{
   int temp = a;
   a = b;
   a = temp;
}