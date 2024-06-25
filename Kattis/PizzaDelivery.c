/**
 *
 * Problem: https://open.kattis.com/problems/pizza
 * 
 */

#include <stdio.h>
#include <stdlib.h>

int balanceCol(int row, int col, int arr[row][col]);
int colCost(int row, int col, int c, int arr[row][col]);
int balanceRow(int row, int col, int arr[row][col]);
int rowCost(int row, int col, int r, int arr[row][col]);
int totalCost(int row, int col, int arr[row][col]);
int realCost(int row, int col, int bR, int bC, int arr[row][col]);

int main () {
   int cases;
   scanf("%d", &cases);

   //int pz = 0;
   int row, col;
   int r = 0, c = 0;

   while (cases > 0) {
      cases--;
      scanf(" %d%d", &col, &row);
      int arr [row][col];
      for (r = 0; r < row; r++) {
     for (c = 0; c < col; c++) {
        scanf(" %d", &arr[r][c]);
     }
      }
      int bR = balanceRow(row, col, arr);
      int bC = balanceCol(row, col, arr);
      int total = totalCost(row, col, arr);
      realCost(row, col, bR, bC, arr);
   }
}

int totalCost(int row, int col, int arr[row][col]) {
   int r = 0;
   int c = 0;

   int total = 0;

   for (r = 0; r < row; r++) {
      for (c = 0; c < col; c++) {
     total += arr[r][c];
      }
   }
   return total;
}

int rowCost(int row, int col, int r, int arr[row][col]) {
   int total = 0;

   int i = 0;
   for (i = 0; i < col; i++) {
      total += arr[r][i];
   }

   return total;
}

int balanceRow(int row, int col, int arr[row][col]) {
   int tot = totalCost(row, col, arr);

   int rowC = 0;

   int i = 0;
   for (i = 0; i < row; i++) {
      rowC += rowCost(row, col, i, arr);
      if (rowC >= tot / 2) {
     return i;
      }
   }

   return -1;
}

int colCost(int row, int col, int c, int arr[row][col]) {
   int total = 0;

   int i = 0;
   for (i = 0; i < row; i++) {
      total += arr[i][c];
   }
   return total;
}

int balanceCol(int row, int col, int arr[row][col]) {
   int tot = totalCost(row, col, arr);

   int colC = 0;

   int i = 0;
   for (i = 0; i < col; i++) {
      colC += colCost(row, col, i, arr);
      if (colC >= tot / 2) {
     return i;
      }
   }
   return -1;
}

int realCost(int row, int col, int bR, int bC, int arr[row][col]) {
   int i = 0, j = 0;
   
   int mult = 0;
   long int total = 0;
   for (i = 0; i < row; i++) {
      for (j = 0; j < col; j++) {
     mult = abs(bR - i) + abs(bC - j);
     total += mult*arr[i][j];
      }
   }
   printf("%ld blocks\n", total);
   return total;
}