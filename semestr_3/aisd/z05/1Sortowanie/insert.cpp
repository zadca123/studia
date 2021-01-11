#include <iostream>
using namespace std;

// const int n = 8;
void insertSort(int *tab,int n){
    for(int i=1; i < n; i++){
        int j = i;
        int temp = tab[j];
        while((j>0) && (tab[j-1]>temp)){
            tab[j] = tab[j-1];
            j--;
        }
        tab[j] = temp;
    }
}

int main(){
    int arr[]{3,5,3,2,1,6,1,2};
    int arrSize = sizeof(arr)/sizeof(arr[0]);

    cout << "Before sort:\t";
    for (int i = 0; i < arrSize; i++)
        cout << arr[i] << ", ";

    insertSort(arr, arrSize);
    cout << "\nAfter sort:\t";
    for (int i = 0; i < arrSize; i++)
        cout << arr[i] << ", ";

    return 0;
}
