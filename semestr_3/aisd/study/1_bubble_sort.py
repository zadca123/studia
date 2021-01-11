def bubble_sort(tab):
    for i in range(len(tab)):
        for j in range(len(tab) - i - 1):
            if tab[j] > tab[j+1]:
                tmp = tab[j]
                tab[j] = tab[j+1]
                tab[j+1] = tmp

list = [3, 2, 4, 5, 1]
print(list)
bubble_sort(list)
print(list)
