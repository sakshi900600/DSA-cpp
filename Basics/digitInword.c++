#include <bits/stdc++.h>
using namespace std;

void printInWord(int n){
    switch(n){
        case 1: 
            cout<<"One" << " ";
            break;
        case 2: 
            cout<<"Two" << " ";
            break;
        case 3: 
            cout<<"Three" << " ";
            break;
        case 4: 
            cout<<"Four" << " ";
            break;
        case 5: 
            cout<<"Five" << " ";
            break;
        case 6: 
            cout<<"Six" << " ";
            break;
        case 7:
            cout<<"Seven" << " ";
            break;
        case 8:
            cout<<"Eight" << " ";
            break;
        case 9:
            cout<<"Nine" << " ";
            break;
    }
}

int main(){


    int n = 1234;

    // logic: first we will reverse the digit & then find out last digit & everytime print that last digit in word. 
    // basically we will use if-else or switch case to print digits from 0 to nine.

    // reverse
    string s2 = to_string(n);
    reverse(s2.begin(), s2.end());

    // convert back to int
    int revNum = stoi(s2);
    cout<< revNum;

    while(revNum > 0){
        int lastDigit = n % 10;
        printInWord(lastDigit);
        revNum = revNum/10;
    }


    return 0;
}
