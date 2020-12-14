#include <iostream>
using namespace std;
int szukaj_rec(int *tab, int x, int left, int right){
    if(left>right)
        return -1;
    else {
        int mid = (left + right)/2;
        if(tab[mid] == x)
            return mid;
        else {
            if(x < tab[mid])
                return szukaj_rec(tab, x, left, mid-1);
            else
                return szukaj_rec(tab, x, mid+1, right);
        }
    }
}
int main(){
    int x = 5;
    int tab[8] = {1,2,3,4,5,6,7,8};
    cout << "Szukana liczba " << x << " kryje się pod indexem " << szukaj_rec(tab, x, 0, 7) << endl;

}
