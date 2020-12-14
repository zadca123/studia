#include <iostream>
using namespace std;

int ndw(int a, int b){
    if(b==0)
        return a;
    else
        return ndw(b, a%b); //modulo
}


int main(){
    cout << "ndw(12,3) = " << ndw(12,3) << endl;
    cout << "ndw(24,30) = " << ndw(24,30) << endl;
    cout << "ndw(5,6) = " << ndw(5,7) << endl;
    cout << "ndw(54,69) = " << ndw(54,69) << endl;
}
