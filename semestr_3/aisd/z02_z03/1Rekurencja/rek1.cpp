#include <iostream>
using namespace std;
const int n= 10;
int tab[n] = {1,2,3,2,-7,44,5,1,0,-3};

void szukaj(int tab[n], int left, int right, int x){
// left, right  = lewa i prawa granica obszaru poszukiwań
// tab = tablica
// x = wartość do odnalezienia
    if(left>right)
        cout << "Element " << x << " nie został odnaleziony\n";
    else{
        if(tab[left] == x)
            cout << "Znalazłem szukany element " << x << endl;
        else
            szukaj(tab,left+1,right,x);
    }
}

int main(){
    szukaj(tab,0,n-1,7);
    szukaj(tab,0,n-1,5);
}
