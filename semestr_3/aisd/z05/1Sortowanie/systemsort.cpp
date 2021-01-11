#include <string>
#include <iostream>
#include <fstream>
using namespace std;

int main(){
    ifstream plik_W1 ("./input1.txt");
    ifstream plik_W2 ("./input2.txt");
    ofstream plik_WYJ ("./output.txt");

    string s;
    while(getline(plik_W1, s))
        plik_WYJ << s << endl;
    while(getline(plik_W2, s))
        plik_WYJ << s << endl;
    plik_WYJ.close();

    // system("sort output.txt /O output.txt"); //check sort command for linux filesystem
    system("sort output.txt -o output.txt");
}
