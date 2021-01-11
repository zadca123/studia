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

void heapify(int *A, int n, int i){
    int largest = i;
    int l = 2 * i + 1;
    int r = 2 * i + 2;
    if(l < n && A[largest] < A[l])
        largest = l;
    if(r < n && A[largest] < A[r])
        largest = r;
    if(largest != i){
        swap(A[i], A[largest]);
        heapify(A, n, largest);
    }
}

void heap_sort(int *A, int n){
    int i;
    for(i = n/2-1; i > -1; i--)
        heapify(A, n, i);
    for(i = n-1; i > 0; i--){
        swap(A[i], A[0]);
        heapify(A, i, 0);
    }
}



int main(){
    int A[]{3,4,5,2,1,6,23,8,3,2,1,4,6,8,456,4568,67,84,56,465,874};
    int n = sizeof(A)/ sizeof(A[0]);
    wypisz(A, n);
    heap_sort(A, n);
    wypisz(A, n);
    return 0;
}
