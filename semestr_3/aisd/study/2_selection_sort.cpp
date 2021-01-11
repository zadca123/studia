#include <iostream>
#include <vector>
using namespace std;

void wypisz(int *tab, int n){
    for(int i =0; i < n; i++)
        cout << tab[i] << ", ";
    cout << endl;
}

void selection_sort(int *tab, int n){
    int i, j, tmp, min_index;
    for(i = 0; i < n; i++){
        min_index = i;
        for(j = i+1; j < n; j++)
            if(tab[min_index] > tab[j])
                min_index = j;
        tmp = tab[i];
        tab[i] = tab[min_index];
        tab[min_index] = tmp;
    }
}

int main(){
    int arr[]{3,4,5,2,1};
    int arrSize = sizeof(arr)/ sizeof(arr[0]);
    wypisz(arr, arrSize);

    selection_sort(arr, arrSize);
    wypisz(arr, arrSize);
    return 0;
}
