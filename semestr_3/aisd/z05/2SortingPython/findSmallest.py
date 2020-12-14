def findSmallest( theValues ):
    n = len( theValues )
    # Assume the first item is the smallest value.
    smallest = theValues[0]
    # Determine if any other item in the sequence is smaller.
    for i in range( 1, n ) :
        if theValues[i] < smallest : # zmiana nazwy zmiennej z theList na theValues
            smallest = theValues[i]
    return smallest
        # Return the smallest found.


a = [3,2,4,5,7]
b = findSmallest(a)
print(b)
