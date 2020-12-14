#include <iostream>
#include <stdio.h>
using namespace std;

int StadDoWiecznosci(int n){
    if(n <= 1)
        return 1;
    else {
        if( (n%2) == 0 )
            return n * StadDoWiecznosci(n-2);
        else
            return n * StadDoWiecznosci(n-1);
    }
}

int N(int n, int p){
    if( n == 0 )
        return 1;
    else
        return N(n-1, N(n-p,p));
}

int main(){
    cout << "StadDoWiecznosci(5) = " << StadDoWiecznosci(5) << endl;
    cout << "N(5,5) = " << N(1,0) << endl;
}
