def insertion_sort(array):
    for i in range(1, len(array)):
        # Wartosc przy granicy
        value = array[i]
        j = i
        while j > 0 and array[j-1] > value:
            array[j] = array[j-1]
            j -= 1
        array[j] = value

arr = [7,4,8,3,2,1,5,6]
print(arr)
insertion_sort(arr)
print(arr)
