#include <iostream>
using namespace std;

void wypisz(int *tab, int n){
    for(int i =0; i < n; i++)
        cout << tab[i] << ", ";
    cout << endl;
}

void swap(int *a, int *b){
    int tmp = *a;
    *a = *b;
    *b = tmp;
}

int partition(int *A, int l, int r){
    int pivot = A[r];
    int i = l - 1;
    for(int j = l; j < r; j++)
        if( A[j] < pivot )
            swap(A[++i], A[j]);
            // i++;
    swap(A[i+1], A[r]);
    return i+1;
}

void quick_sort(int *A, int l, int r){
    if( l < r ){
        int pi = partition(A, l, r);
        quick_sort(A, l, pi-1);
        quick_sort(A, pi+1, r);
    }
}



int main(){
    int A[]{3,4,5,2,1,6,23,8,3,2,1,4,6,8,456,4568,67,84,56,465,874};
    int n = sizeof(A)/ sizeof(A[0]);
    wypisz(A, n);
    quick_sort(A, 0, n-1);
    wypisz(A, n);
    return 0;
}
