def quick_sort(A, l, r):
    if l < r:
        pi = partition(A, l, r)
        quick_sort(A, l, pi-1)
        quick_sort(A, pi+1, r)

def partition(A, l, r):
    pivot = A[r]
    i = l-1
    for j in range(l, r):
        if A[j] < pivot:
            i += 1
            A[i], A[j] = A[j], A[i]
    A[i+1], A[r] = A[r], A[i+1]
    return i+1



A = [8,3,7,4,1,2,6,5]
n = len(A) - 1
print(A)
quick_sort(A, 0, n)
print(A)
