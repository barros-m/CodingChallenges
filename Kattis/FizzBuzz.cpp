/**
 *
 * Problem: https://open.kattis.com/contests/ijjr5d/problems/fizzbuzz
 */

#include <iostream>

using namespace std;

int main() {
   int n, x, y;
   cin >> x >> y >> n;

   int isDiv = 0;
   int i = 1;
   while (i <= n) {
      if (i % x == 0) {
     cout << "Fizz";
     isDiv = 1;
      }
      if (i % y == 0) {
     cout << "Buzz";
     isDiv = 1;
      }
      if (isDiv == 0) {
     cout << i;
      }
      isDiv = 0;
      cout << endl;
      i++;
   }
   
   return 0;

}