#include <iostream>
using namespace std;

void insertSort(int arr[], int len){
    int pos;
    int value;
    for (int i = 1; i < len; i++){
        value = arr[i];
        pos = i;
        while(pos > 0 && value < arr[pos-1]){
            arr[pos] = arr[pos-1];
            arr[pos-1] = value;
            pos--;
            // arr[pos] = value;
        }
    }
}

int main(){
    int arr[]{3,5,3,2,1,6,1,2};
    int arrSize = sizeof(arr)/sizeof(arr[0]);

    cout << "Before sort:\t";
    for (int i = 0; i < arrSize; i++)
        cout << arr[i] << ", ";

    insertSort(arr, arrSize);
    cout << "\nAfter sort:\t";
    for (int i = 0; i < arrSize; i++)
        cout << arr[i] << ", ";

    return 0;
}
