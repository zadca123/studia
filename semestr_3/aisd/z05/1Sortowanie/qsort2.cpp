#include <iostream>
using namespace std;

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

int comp(const void *x, const void *y){
    int xx = *(int*)x;
    int yy = *(int*)y;
    if(xx < yy)
        return -1;
    if(xx == yy)
        return 0;
    else {
        return 1;
    }
}
const int n = 12;
int tab[n] = {40,29,2,1,6,18,20,32,34,39,23,41};

int main(){
    // int arr[]{3,5,3,2,1,6,1,2};
    // int arrSize = sizeof(arr)/sizeof(arr[0]);

    // cout << "Before sort:\t";
    // for (int i = 0; i < n; i++)
    //     cout << arr[i] << ", ";

    // qsort(arr, 0, arrSize-1);
    // cout << "\nAfter sort:\t";
    // for (int i = 0; i < arrSize; i++)
    //     cout << arr[i] << ", ";

    cout << "Before sort:\t";
    for (int i = 0; i < n; i++)
        cout << tab[i] << ", ";

    qsort(tab, n, sizeof(int), comp);
    cout << "\nAfter sort:\t";
    for (int i = 0; i < n; i++)
        cout << tab[i] << ", ";

    return 0;
}
