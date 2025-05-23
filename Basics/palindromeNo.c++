#include <iostream>
#include <algorithm>
#include <bits/stdc++.h>
using namespace std;

int main(){

    int number = 12321;

    // reverse the original no then check if both is same or not.
    // first way use while n>0 wala fun to reverse then check
    // second way is to converst this no into string then reverse it using builtin method and then typecast again in int. 


    // The reverse() function modifies the string in place and doesn't return anything, so you can't assign its result to s2.
    // string s1 = to_string(number);
    // string s2 = reverse(s1.begin(), s1.end());

    // the correct way
    string s1 = to_string(number);
    string s2 = s1;
    reverse(s2.begin(), s2.end());

    


    return 0;
}
