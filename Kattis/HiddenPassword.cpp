/**
 *
 * Problem: https://open.kattis.com/contests/hmrexo/problems/hidden
 *
 * ---- Results ----
 * Judgment: Accept
 * Test Cases: 32/32
 *
 */
//#include <bits/stdc++.h>
#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
using namespace std;

#define MEM(arr,val)memset((arr),(val), sizeof (arr))
#define PI (acos(0)*2.0)
#define FASTER ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ALL(v)v.begin(),v.end()
#define PB(v)push_back(v)

typedef long long ll;
typedef pair<int,int> ii;
typedef vector<int> vi;
typedef vector<ii> vii;

ll gcd(ll a,ll b){return b == 0 ? a : gcd(b,a%b);}
ll lcm(ll a,ll b){return a*(b/gcd(a,b));}

/**
 * __builtin_popcount(int d) // count bits
 * __builtin_popcountll(long long d)
 * strtol(s, &end, base); // convert base number
 */
//----------------------------------------------------------------------//


int main(){
    string pass;
    string message;
    cin >> pass;
    cin >> message;
    for (int i = 0; i < message.length(); i++) {
//        cout << "Loop";
        char a = message[i];
        string b = &a;
        //cout << a << endl;
        //cout << pass.find(b);
        if (pass.find(a) != string::npos) {
            //cout << "In if" << endl;
            char c = pass[0];
            string first = &c;
            //cout << first << endl;
            //cout << "First: " << first << "B: " << b << endl;
            if (a == c) {
               //cout << "In second if";
                //cout << pass.substr(1) << endl;
                pass = pass.substr(1);
            }
            else {
                cout << "FAIL";
                return 0;
            }

        }
    }
    if (pass == "") {
        cout << "PASS";
    }
    else {
        cout << "FAIL";
    }


    return 0;
}
