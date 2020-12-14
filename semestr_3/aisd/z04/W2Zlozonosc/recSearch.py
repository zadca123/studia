import math
# Recursive function to search x in arr[l..r]
def recSearch(arr, l, r, x):
    if r < l:
        return -1
    if arr[l] == x:
        return l
    if arr[r] == x:
        return r
    return recSearch(arr, l+1, r-1, x)

def recSearch_iter(arr, l, r, x):
    while( l < r ):
        mid = int((l + r)/2)
        mid = math.floor((l + r)/2)
        # print(l,r, mid)
        if(arr[mid] == x):
            return mid
        elif(arr[mid] > x):
            l = mid - 1;
        else:
            l = mid + 1;
    return -1;


# Driver Code
arr = [12, 34, 54, 2, 3]
n = len(arr)
x = 3

index1 = recSearch(arr, 0, n-1, x)
if index1 != -1:
    print("Element", x,"is present at index %d" %(index1))
index2 = recSearch_iter(arr,0, n, x)
if index2 != -1:
    print("Element", x,"is present at index %d" %(index2))
