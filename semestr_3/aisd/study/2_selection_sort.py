def selection_sort(array):
    for i in range(len(array)):
        # Index of the decimal with the smalest value
        min_index = i
        for j in range(i+1,len(array)):
            if array[min_index] > array[j]:
                min_index = j
        tmp = array[i]
        array[i] = array[min_index]
        array[min_index] = tmp

# def selection_sort2(array):
#     for i in range(len(array)):
#         min_value = array[i]
#         min_index = i
#         for j in range(i+1,len(array)):
#             if min_value > array[j]:
#                 min_value = array[j]
#                 min_index = j
#         tmp = array[i]
#         array[i] = min_value
#         array[min_index] = tmp
    
arr = [5,3,2,4,1,6]
print(arr)
selection_sort(arr)
print(arr)
