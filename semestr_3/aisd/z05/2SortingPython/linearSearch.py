def linearSearch( theValues, target ) :
    n = len( theValues )
    for i in range( n ) :
        # If the target is in the ith element, return True
        if theValues[i] == target:
            return True
    return False # If not found, return False.

a = [3,2,4,5,7]
b = linearSearch(a,1)
print(b)
