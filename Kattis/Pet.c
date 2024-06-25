/**
 * 
 * Problem: https://open.kattis.com/problems/pet
 *
 * ---- Results ----
 * Judgment: Accept
 * Test Cases: 7/7
 *
 */

#include <stdio.h>

int main () {
   int a, b, c, d;

   int max = 0;
   int maxi = 0;
   int total = 0;
   int i = 1;

   for (; i <= 5; i++) {
      scanf(" %d%d%d%d", &a, &b, &c, &d);
      total += a + b + c + d;

      if (total > max) {
     max = total;
     maxi = i;
      }

      total = 0;
   }

   printf("%d %d\n", maxi, max); 
   return 0;
}
