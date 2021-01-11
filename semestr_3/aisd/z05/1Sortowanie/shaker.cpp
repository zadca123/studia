#include <iostream>
using namespace std;

// const int n = 8;
void swap(int* a, int* b){
    int t = *a;
    *a = *b;
    *b = t;
}
void shakerSort(int *tab, int n){
    int left = 1, right = n-1, k=n-1;

    do{
        for (int j = right; j >= left; j--)
            if(tab[j-1] > tab[j]){
                swap(tab[j-1], tab[j]);
                k = j;
            }
        left = k+1;

        for (int j = left; j <= right; j++)
            if(tab[j-1] > tab[j]){
                swap(tab[j-1], tab[j]);
                k = j;
            }
        right=k-1;

    }while(left <= right);
}

int main(){
    int arr[]{3,5,3,2,1,6,1,2};
    int arrSize = sizeof(arr)/sizeof(arr[0]);

    cout << "Before sort:\t";
    for (int i = 0; i < arrSize; i++)
        cout << arr[i] << ", ";

    shakerSort(arr, arrSize);
    cout << "\nAfter sort:\t";
    for (int i = 0; i < arrSize; i++)
        cout << arr[i] << ", ";

    return 0;
}
