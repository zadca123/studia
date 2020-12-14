#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <vector>
using namespace std;

vector<int> zerowanie(vector<int> tab){
    for(int i = 0; i < int(tab.size()); i++)
        tab[i] = 0;
    return tab;
}

void zerowanie2(int n, int **tab){
    int i,j;
    i = 0;
    while(i < n){
        j = 0;
        while(j <= i){
            tab[i][j] = 0;
            j++;
        }
    }
}

void wypisz(vector<int> tab){
    for(int i = 0; i < int(tab.size()); i++)
        cout << tab[i] << ", ";
    cout << endl;
}

void wypiszArr(int **tab, int n1, int n2){
    for (int i = 0; i < n1; i++){
        for(int j = 0; j <n2 ;j++)
            cout << tab[i][j] << "," <<endl;
        cout << endl;
    }
}

int main()
{
    // vector<int> x{1,3,4,5};
    // wypisz(x);
    // x = zerowanie(x);
    // wypisz(x);
    int n = 3;
    // int** tab = new int*[n];
    int tab[n][n];
    zerowanie2(n,tab);
    // int size = sizeof(y)/sizeof(int);
    for (int i = 0; i < n; i++){
        for(int j = 0; j <n;j++)
            cout << tab[i][j] << ",\t";
        cout << endl;
    }
    return 0;
}
