#include <iostream>
#include <stdio.h>
#include <math.h>
#include <cmath>
using namespace std;

int fib(int n){
    if(n <= 0)
        return 0;
    else if(n == 1)
        return 1;
    return fib(n-1) + fib(n-2);
}

unsigned long int F(int n){
    if(n < 2)
        return n;
    return F(n-1) + F(n-2);
}

int fib_dynamic(int n){
    int f[2];
    f[0] = 0;
    f[1] = 1;

    cout << f[1] << endl;
    for (int i = 2; i < n; i++){
        f[i] = f[i-1] + f[n-2];
        cout << f[i] << endl;
    }

    return f[n];
}

int fib_tail(int n, int a = 0, int b = 1){
    if(n <= 0)
        return a;
    else if(n == 1)
        return b;
    return fib_tail(n-1, b, a+b);
}

int fib_golden(int n){
    double phi = (1 + pow(5, 0.5))/2;
    double psi = (1 - pow(5, 0.5))/2;
    return int( (pow(phi,n) - pow(psi,n)) / pow(5,0.5) );
}

int main(){
    int a = fib(10);
    int b = fib( 6);
    int c = fib(-2);
    cout<<a<<" "<<b<<" "<<c<<endl;

    a = F(10);
    b = F( 6);
    c = F(-2);
    cout<<a<<" "<<b<<" "<<c<<endl;

    // a = fib_dynamic(6);
    // b = fib_dynamic(2);
    // c = fib_dynamic(-2);
    // cout<<a<<" "<<b<<" "<<c<<endl;

    a = fib_tail(10);
    b = fib_tail( 6);
    c = fib_tail(-2);
    cout<<a<<" "<<b<<" "<<c<<endl;

    a = fib_golden(10);
    b = fib_golden( 6);
    c = fib_golden(-2);
    cout<<a<<" "<<b<<" "<<c<<endl;

    // getchar();
    return 0;
}
