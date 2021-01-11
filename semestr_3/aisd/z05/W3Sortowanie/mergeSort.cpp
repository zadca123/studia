#include <iostream>
using namespace std;
const int N = 10;
int T1[N] = {4, 6, 4, 12, -3, 6, -6, 1, 8, 50};
int T2[N];  // Tablica pomocnicza

void merge(int left, int mid, int right) {
    int i,j,k;
    for (i=left; i<=right; i++)
        T2[i]=T1[i];
    i=left; j=mid+1; k=left;
    while (i<=mid && j<=right) {
        if (T2[i]<T2[j])
            T1[k++]=T2[i++];
        else
            T1[k++]=T2[j++];
    }
    while (i<=mid)
        T1[k++]=T2[i++];
}

void mergeSort(int left, int right) {
    int mid;
    if (left<right) {
        mid=(left+right)/2;
        mergeSort(left, mid);
        mergeSort(mid+1, right);
        merge(left, mid, right);
    }
}
int main() {
    int i, x;
    cout << "Przed sortowaniem:\n";
    for(i=0; i<N; i++) cout << T1[i] << " "; cout << endl;
    mergeSort(0, N-1);
    cout << "Po sortowaniu:\n";
    for(i=0; i<N; i++)  cout << T1[i] << " "; cout << endl;
    return 0;
}
