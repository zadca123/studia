# Sorts a sequence in ascending order using the bubble sort algorithm.
def bubbleSort( theSeq ):
    n = len( theSeq )
    # Perform n-1 bubble operations on the sequence
    for i in range( n - 1 ) :
        # Bubble the largest item to the end.
        for j in range( i , n - 1 ) :
            if theSeq[j] > theSeq[j + 1] :
                # swap the j and j+1 items.
                tmp = theSeq[j]
                theSeq[j] = theSeq[j + 1]
                theSeq[j + 1] = tmp

a = [3,2,4,5,7]
print(a)
bubbleSort(a)
print(a)
