import math

def divide(array):
    # mid = int(len(array)/2)
    mid = math.ceil(len(array)/2)
    return array[:mid], array[mid:]

def merge(a, b):
    result = []
    while len(a) > 0 and len(b) > 0:
        if(a[0] <= b[0]):
            result.append(a[0])
            del a[0]
        else:
            result.append(b[0])
            del b[0]
    while len(a) > 0:
        result.append(a[0])
        del a[0]
    while len(b) > 0:
        result.append(b[0])
        del b[0]
    return result

# merge sort
def conquer(array):
    if len(array) <= 1:
        return array
    left, right = divide(array)
    print(left, right)
    L = conquer(left)
    R = conquer(right)
    return merge(L, R)

arr = [3,2,1,6,4,7,5]
# merge_sort(arr,0,0)
print(arr)
print(conquer(arr))
