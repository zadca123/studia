#include <iostream>
using namespace std;
// Implementacja rekurencyjna
int binarySearchRec(int arr[], int l, int r, int x) {
    if (r >= l) {
        int mid = l + (r - l) / 2;
        if (arr[mid] == x)
            return mid;
        if (arr[mid] > x)
            return binarySearchRec(arr, l, mid - 1, x);
        // Else
        return binarySearchRec(arr, mid + 1, r, x);
    }
    // We reach here when element is not present in array
    return -1;
}

// Implementacja iteracyjna
int binarySearchIter(int arr[], int l, int r, int x) {
    while (l <= r) {
        int m = l + (r - l) / 2;
        if (arr[m] == x)
            return m;
        if (arr[m] < x)
            l = m + 1;
        else
            r = m - 1;
    }
    // if we reach here, then element was not present
    return -1;
}

int main(){
    int arr[]{18,56,5,3,44,2};
    int n = sizeof(arr) / sizeof(arr[0]);
    // cout << n;
    cout << binarySearchRec(arr,0,n-1,5) << endl;
    cout <<binarySearchIter(arr,0,n-1,5) << endl;

    return 0;
}
