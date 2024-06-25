/**
 *
 * Problem: https://open.kattis.com/problems/tarifa
 *
 * ---- Results ----
 * Judgment: Accept
 * Test Cases: 13/13
 *
 */

#include <stdio.h>

int main (void) {
   int dataPMonth;
   scanf("%d", &dataPMonth);

   int time;
   scanf("%d", &time);

   int i = 0;
   
   int temp;
   int total = 0;

   while (i < time) {
      scanf("%d", &temp);
      total += temp;
      i++;
   }

   temp = (time + 1) * dataPMonth;

   printf("%d\n", temp - total); 

   return 0;
}
