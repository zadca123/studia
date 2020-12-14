#include <iostream>
#include<conio.h>
#include<graphics.h>
using namespace std;

// graphic anything dont work
const double alpha = 10;
void spirala(double lg, double x, double y){
    if(lg > 0){
        lineto(x+lg,y);
        lineto(x+lg,y+lg);
        lineto(x+alpha,y+lg);
        lineto(x+alpha,y+alpha);
        spirala(lg-2*alpha, x+alpha, y+alpha)
    }
}
int main(){
}
