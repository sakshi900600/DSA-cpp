#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main(){

    string str = "Saksehi";
    int i=0, count=0;

    for(char ch: str){
        ch = tolower(ch);
    }

    // in java toLowerCase() converts whole string in lowercase 
    // but in c++ tolower() function converts only single char in lowercase so use loop to convert the whole string in lowercase.


    while(i < str.size()){
        char ch = str[i];
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            count++;
            cout<< ch << " ";
        }
        i++;
    }


    return 0;
}