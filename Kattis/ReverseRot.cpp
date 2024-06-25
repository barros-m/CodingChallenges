/**
    Problem: https://open.kattis.com/contests/sza6pf/problems/reverserot
 */

#include <iostream>
#include <string>
using namespace std;

string chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";

int position(char letter)
{
    int l = chars.length();
    for (int i = 0; i < l; i++)
    {
        if (letter == chars[i])
        {
            return i;
        }
    }
    return -1;
}

char rotateLetter(char letter, int rot)
{
    char l = chars.length();
    return chars[((position(letter) + rot)%l)];
}


string encrypt(string text, int rot)
{
    int l = text.length();
    string result = "";
    for (int i = 0; i < l; i++)
    {
        result = rotateLetter(text[i], rot) + result;
    }

    return result;

}

int main()
{
    
    int rot = -1;
    string text;
    while (true) 
    {
        cin >> rot;
        if (rot == 0)
        {
            return 0;
        }
        cin >> text;
        cout << encrypt(text, rot) << endl;
        //cout << text;
    } 
    return 0;
}