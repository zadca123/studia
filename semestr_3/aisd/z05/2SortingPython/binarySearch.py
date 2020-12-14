def binarySearch( theValues, target ) :
    # Start with the entire sequence of elements.
    low = 0
    high = len(theValues) - 1
    # Repeatedly subdivide the sequence in half until the target is found.
    while low <= high :
        # Find the midpoint of the sequence.
        mid = (high + low) // 2
        if theValues[mid] == target :   # Does the midpoint contain the target?
            return True
        elif target < theValues[mid] :  # Or does the target precede the midpoint?
            high = mid - 1
        else :                          # Or does it follow the midpoint?
            low = mid + 1
    return False # If the sequence cannot be subdivided further, we're done.

a = [3,2,4,5,7]
b = binarySearch(a,5)
print(b)
