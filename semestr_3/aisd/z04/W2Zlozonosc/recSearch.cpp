#include <iostream>
#include <stdio.h>
using namespace std;

// Recursive function to search x in arr[l..r]
int recSearch(int arr[],int l,int r, int x){
    if(r < l)
        return -1;
    if(arr[l] == x)
        return l;
    if(arr[r] == x)
        return r;
    return recSearch(arr, l+1, r-1, x);
}

int recSearch_iter(int arr[], int l, int r, int x){
    int mid;
    while( l < r ){
        mid = (l + r)/2;
        if(arr[mid] == x)
            return mid;
        else if(arr[mid] > x)
            l = mid - 1;
        else
            l = mid + 1;
    }
    return -1;
}

int main(){
	int arr[] = {12, 34, 54, 2, 3};
	int arrSize = sizeof(arr)/sizeof(arr[0]);
	int x = 2;
	int index1 = recSearch(arr,0, arrSize-1, x);
	int index2 = recSearch_iter(arr,0, arrSize, x);
	cout << "Element " << x << " is present at index " << index1 << endl;
	cout << "Element " << x << " is present at index " << index2 << endl;

    return 0;
}
