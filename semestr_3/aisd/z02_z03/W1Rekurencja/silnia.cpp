#include <iostream>
using namespace std;

int rec_factorial(int n){
    if (n <= 0)
        return 1;
    return n * rec_factorial(n-1);
}

int iter_factorial(int n){
    int result = 1;
    for (int i = 1; i < n+1; i++)
        result = result * i;
    return result;
}

int tail_factorial(int n, int accumulator = 1){
    if(n <= 0)
        return accumulator;
    return tail_factorial(n-1, accumulator * n);
}

int main(){
    int a = rec_factorial(10);
    int b = rec_factorial(0);
    int c = rec_factorial(-2);
    //Rekursja
    cout<<a<<" "<<b<<" "<<c<<endl;

    a = iter_factorial(10);
    b = iter_factorial(0);
    c = iter_factorial(-2);
    //Iteracja
    cout<<a<<" "<<b<<" "<<c<<endl;

    a = tail_factorial(10,-2);
    b = tail_factorial(0, 3);
    c = tail_factorial(-2,5);
    //Iteracja
    cout<<a<<" "<<b<<" "<<c<<endl;
}
