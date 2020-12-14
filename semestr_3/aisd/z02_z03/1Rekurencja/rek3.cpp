#include <iostream>
using namespace std;

unsigned long int fib(int x){
    if(x < 2)
        return x;
    else
        return fib(x-1) + fib(x-2);
}

int main(){
    cout << "fib(7) = " << fib(7) << endl;
}
