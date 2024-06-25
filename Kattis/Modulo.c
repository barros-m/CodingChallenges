/**
 *
 * Problem: https://open.kattis.com/problems/modulo
 *
 * ---- Results ----
 * Judgment: Accept
 * Test Cases: 13/13
 * 
 */

#include <stdio.h>

void initialize(int mod [], int numbers [], int size);
int search (int number [], int size, int value);

int main() {
   int size = 10;
   int mod [size];
   int numbers [size];
   int modulos = 42;

   initialize(mod, numbers, size);

   int i = 0;
   int j = 0;

   int temp;
   for (; i < size; i++) {
      scanf(" %d", &temp);
      temp = temp % modulos;
      

      // If i do not find...
      if (search(numbers, size, temp) == 0) {
     numbers[j] = temp;
     j++;
      }

   }
   printf("%d\n", j);
}


void initialize(int mod [], int numbers [], int size) {

   int i = 0;
   for (; i < size; i++) {
      mod[i] = -1;
      numbers[i] = -1;
   }

   return;
}

int search (int number [], int size, int value) {
   
   int i = 0;
   for(; i < size; i++) {
      if (number[i] == value) {
     return 1;
      }
   }

   return 0;
}