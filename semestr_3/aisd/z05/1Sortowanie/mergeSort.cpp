#include <iostream>
using namespace std;

const int N = 10;
void Scalaj(int T[], int p, int mid, int k){
    int T2[N];
    int p1 = p, k1 = mid;
    int p2 = mid+1, k2=k;

    int i = p1;
    while((p1 <= k1) && (p2 <= k2)){
        if(T[p1] < T[p2]){
            T2[i] = T[p1];
            p1++;
        }
        else {
            T2[i] = T[p2];
            p2++;
        }
        i++;
    }

    while(p1 <= k1){
        T2[i] = T[p1];
        p1++;
        i++;
    }
}

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
