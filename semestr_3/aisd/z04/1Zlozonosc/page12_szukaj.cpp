#include <iostream>
#include <stdio.h>
using namespace std;

// Algorytmy, struktury danych i techniki programowania
const int n = 10;
int tab[n] = {1,2,3,2,-7,44,5,1,0,-3};

int szukaj(int tab[n], int x){
    int pos = 0;

    while((pos < n) && (tab[pos]!=x))
        pos++;

    if(pos < n)
        return pos;
    else
        return -1;
}

int main(){
    cout << szukaj (tab,7) << endl; //wynik = -1
    cout << szukaj (tab,5) << endl; //wynik = 6
}
