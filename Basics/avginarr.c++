#include <iostream>
using namespace std;

int main(){

    int arr[] = {2,3,5};
    int n = sizeof(arr)/ sizeof(arr[0]);
    int sum = 0;
    for(int i=0; i<n; i++){
        sum += arr[i];
    }

    float avg = (float) sum/n;
    cout<< "Average: " << avg << endl;

    return 0;
}