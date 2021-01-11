#include <iostream>
#include <vector>
using namespace std;

void wypisz(int *tab, int n){
    for(int i =0; i < n; i++)
        cout << tab[i] << ", ";
    cout << endl;
}

void insertion_sort(int *tab, int n){
    int i, j, value;
    for(i = 1; i < n; i++){
        value = tab[i];
        j = i;
        while(j>0 && tab[j-1] > value){
            tab[j] = tab[j-1];
            j -= 1;
        }
        tab[j] = value;
    }
}

int main(){
    int arr[]{3,4,5,2,1};
    int arrSize = sizeof(arr)/ sizeof(arr[0]);

    wypisz(arr, arrSize);
    insertion_sort(arr,arrSize);
    wypisz(arr, arrSize);

    return 0;
}
