#include <iostream>
using namespace std;

// const int n = 8;
void swap(int* a, int* b){
    int t = *a;
    *a = *b;
    *b = t;
}

void QuickSort(int *tab, int left, int right){
    if(left < right){
        int m = left;
        QuickSort(tab, left, m-1);
        QuickSort(tab, m+1, right);
    }
}

void qsort(int *tab, int left, int right){
    if(left < right){
        int m = left;
        for(int i = left+1; i <=right; i++)
            if(tab[i] < tab[left])
                swap(tab[++m], tab[i]);
        qsort(tab, left, m-1);
        qsort(tab, m+1, right);
    }
}

int main(){
    int arr[]{3,5,3,2,1,6,1,2};
    int arrSize = sizeof(arr)/sizeof(arr[0]);

    cout << "Before sort:\t";
    for (int i = 0; i < arrSize; i++)
        cout << arr[i] << ", ";

    qsort(arr, 0, arrSize-1);
    cout << "\nAfter sort:\t";
    for (int i = 0; i < arrSize; i++)
        cout << arr[i] << ", ";

    return 0;
}
