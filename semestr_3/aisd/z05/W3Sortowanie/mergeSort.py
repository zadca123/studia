def merge(a, b):
    out = []
    while (len(a) > 0 and len(b) > 0):
        if (a[0] <= b[0]):
            out.append(a[0])
            del a[0]
        else:
            out.append(b[0])
            del b[0]
    while (len(a) > 0):
        out.append(a[0])
        del a[0]
    while (len(b) > 0):
        out.append(b[0])
        del b[0]
    return out

def half(arr):
    mid = int(len(arr) / 2)
    return arr[:mid], arr[mid:]

def mergesort(arr):
    if (len(arr) <= 1):
        return arr
    left, right = half(arr)
    L = mergesort(left)
    R = mergesort(right)
    return merge(L, R)

a =[3,2,5,4]
b =[4,1,3,7]
c = merge(a,b)
print(c)
print(mergesort(c))
