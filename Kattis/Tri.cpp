/**
 * ProblemL https://open.kattis.com/contests/ijjr5d/problems/tri
 *
 */

#include <iostream>

using namespace std;

int main() {
   int a, b, c;

   cin >> a >> b >> c;

   if (a + b == c) {
      cout << a << "+" << b << "=" << c << endl;
   }
   else if (a - b == c) {
      cout << a << "-" << b << "=" << c << endl;
   }
   else if (a * b == c) {
      cout << a << "*" << b << "=" << c << endl;
   }
   else if (a / b == c) {
      cout << a << "/" << b << "=" << c << endl;
   }
   else if (b + c == a) {
      cout << a << "=" << b << "+" << c << endl;
   }
   else if (b - c == a) {
      cout << a << "=" << b << "-" << c << endl;
   }
   else if (b * c == a) {
      cout << a << "=" << b << "*" << c << endl;
   }
   else if (b / c == a) {
      cout << a << "=" << b << "/" << c << endl;
   }
   return 0;
}