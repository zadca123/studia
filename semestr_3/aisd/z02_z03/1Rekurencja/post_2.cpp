#include <iostream>
using namespace std;
void post_dw(unsigned long int n){
    if(n != 0){
        post_dw(n/2);
        cout << n%2 << endl;
    }
}
int main(){
    post_dw(60);
}
