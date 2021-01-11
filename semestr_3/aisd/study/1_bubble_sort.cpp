#include <iostream>
#include <vector>
using namespace std;

void wypisz(int *tab, int n){
    for(int i =0; i < n; i++)
        cout << tab[i] << ", ";
    cout << endl;
}

void bubble_sort(int *tab, int n){
    int i, j, tmp;
    for(i = 0; i < n; i++)
        for(j = 0; j < n - i - 1; j++)
            if(tab[j] > tab[j+1]){
                // zamien(&tab[j], &tab[j+1]);
                tmp = tab[j];
                tab[j] = tab[j+1];
                tab[j+1] = tmp;
        }
}

int main(){
    int arr[]{3,4,5,2,1};
    int arrSize = sizeof(arr)/ sizeof(arr[0]);
    wypisz(arr, arrSize);

    bubble_sort(arr,arrSize);
    wypisz(arr, arrSize);
    return 0;
}
