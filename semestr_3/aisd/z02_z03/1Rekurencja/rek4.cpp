#include <iostream>
using namespace std;

unsigned long int MacCarthy(int x){
    if(x > 100)
        return (x-10);
    else
        return MacCarthy( MacCarthy(x+11) );
}

int main(){
    cout << "MacCarthy(5) = " << MacCarthy(5) << endl;
    cout << "MacCarthy(146) = " << MacCarthy(146) << endl;
}
