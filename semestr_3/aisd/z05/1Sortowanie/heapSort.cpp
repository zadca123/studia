#include <iostream>
using namespace std;

// void swap(int* a, int* b){
//     int t = *a;
//     *a = *b;
//     *b = t;
// }

void przywroc(int T[], int k, int n){
    int i,j;
    i = T[k-1];
    while(k <= n/2){
        j = 2*k;
        if((i < n) && (T[j-1] < T[j]))  j++;
        if( i >= T[j-1])
            break;
        else {
            T[k-1] = T[j-1];
            k = j;
        }
    }
    T[k-1] = i;
}

void heapSort(int T[], int n){
    int k, temp;
    for (k = n/2; k > 0; k--)
        przywroc(T, k, n);

    do{
        temp = T[0];
        T[0] = T[n-1];
        T[n-1] = temp;
        n--;
        przywroc(T,1,n);
    }while(n > 1);
}

int main(){
    int arr[]{3,5,3,2,1,6,1,2};
    int arrSize = sizeof(arr)/sizeof(arr[0]);

    cout << "Before sort:\t";
    for (int i = 0; i < arrSize; i++)
        cout << arr[i] << ", ";

    heapSort(arr, arrSize-1);
    cout << "\nAfter sort:\t";
    for (int i = 0; i < arrSize; i++)
        cout << arr[i] << ", ";

    return 0;
}
