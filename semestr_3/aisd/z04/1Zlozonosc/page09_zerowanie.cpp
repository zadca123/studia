#include <iostream>
#include <stdio.h>
#include <stdlib.h>
using namespace std;

// int n = 3;
// void wypelnij(int tab[][n], int len){
//     for(int i=0; i<len; i++){
//         for(int j=0; j < n ; j++){
//             tab[i][j] = 1;
//             cout << tab[i][j] << ", ";
//         }
//         cout << endl;

//     }
// }
// int n = 3;
// int tab[n][n];
// void zerowanie(int tab[n][n]){
//     int i, j;
//     i = 0;
//     while(i < n){
//         j = 0;
//         while(j <= i){
//             tab[i][j] = 0;
//             j = j+1;
//         }
//         i = i+1;
//     }
// }
//
// int main(){
//     int n = 3;
//     int tab[n][n];
//     cout << tab[0][0] << endl;
//     wypelnij(tab);
//     cout << tab[0][0] << endl;
//     return 0;
// }
int **foo(int n,int m)
{
	int **tab = malloc(n*sizeof(int*));
	for(int i=0;i<n;i++)
		*(tab+i) = malloc(m*sizeof(int));
	return tab;
}

int main()
{
	// printf("%d\n",sizeof(int));
	// printf("%d\n",sizeof(int*));
	int **tablica = foo(3,4);

	for(int i=0;i<3;i++)
		for(int j=0;j<4;j++)
		{
			printf("[%d %d] = %d",i,j,*(*(tablica)+i)+j);
			printf("%p\n",*(tablica+i)+j);
		}


	return 0;
}
