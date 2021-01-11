#include <iostream>
using namespace std;

void wypisz(int *tab, int n){
    for(int i =0; i < n; i++)
        cout << tab[i] << ", ";
    cout << endl;
}

void Merge(int A[], int p, int q, int r){
    int n1,n2,i,j,k;
    n1 = q - p + 1;
    n2 = r - q;
    int L[n1], R[n2];

    for(i = 0; i < n1; i++)
        L[i] = A[p+i];
    for(i = 0; i < n2; i++)
        R[i] = A[q+i+1];

    i = 0, j = 0;
    for(k = p; i < n1 && j < n2; k++){
        if(L[i] < R[j])
            A[k] = L[i++];
        else
            A[k] = R[j++];
    }

    while(i < n1){
        A[k++] = L[i++];
    }
    while(j < n2){
        A[k++] = R[j++];
    }


}
//This is Divide Part
//This part will Divide the A into Sub A and then will Merge them by calling Merge()
void MergeSort(int A[], int p, int r){
    int q;
    if(p < r){
        q = (p + r)/2;
        MergeSort(A,p, q);
        MergeSort(A, q+1, r);
        Merge(A, p, q, r);
    }
}

int main(){
    int A[]{3,4,5,2,1,6};
    int n = sizeof(A)/ sizeof(A[0]);

    wypisz(A, n);
    MergeSort(A, 0, n-1);
    wypisz(A, n);

    return 0;
}
