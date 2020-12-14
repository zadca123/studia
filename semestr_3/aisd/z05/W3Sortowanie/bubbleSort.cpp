#include <iostream>
using namespace std;

void bubbleSort(int arr[], int len){
    int tmp;
    for (int i = 1; i < len; i++)
        for (int j = len-1; j >= i; j--)
            if(arr[j] < arr[j-1]){
                tmp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = tmp;
            }
}

void bubbleSort2(int arr[], int len){
    int tmp;
    for (int i = 1; i < len; i++)
        for(int j = i; j < len; j++)
            if(arr[j-1] > arr[j]){
                tmp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = tmp;
            }
}

int main(){
    int arr[]{3,5,3,2,1,6,1,2};
    int arrSize = sizeof(arr)/sizeof(arr[0]);

    cout << "Before sort:\t";
    for (int i = 0; i < arrSize; i++)
        cout << arr[i] << ", ";

    bubbleSort(arr, arrSize);
    cout << "\nAfter sort:\t";
    for (int i = 0; i < arrSize; i++)
        cout << arr[i] << ", ";

    return 0;
}
