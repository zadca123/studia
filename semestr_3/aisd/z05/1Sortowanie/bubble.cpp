#include <iostream>
using namespace std;

void wypisz(int tab[], int n){
    for (int i =0; i < n; i++)
        cout << tab[i] << ", ";
    cout << endl;
}
// const int n = 8;
void bubble(int *tab, int n){
    for(int i=1; i < n; i++)
        for (int j = n-1 ; j>=i; j--){
            wypisz(tab,n);
            if(tab[j]<tab[j-1]){
                int tmp = tab[j-1];
                tab[j-1] = tab[j];
                tab[j] = tmp;
            }
        }
}

int main(){
    int arr[]{80, 7, 24, 16, 43, 91, 35, 2, 19, 72};
    // int arr[]{3,5,3,2,1,6,1,2};
    int arrSize = sizeof(arr)/sizeof(arr[0]);

    // cout << "Before sort:\t";
    // for (int i = 0; i < arrSize; i++)
    //     cout << arr[i] << ", ";

    bubble(arr, arrSize);
    // cout << "\nAfter sort:\t";
    // for (int i = 0; i < arrSize; i++)
    //     cout << arr[i] << ", ";

    return 0;
}
