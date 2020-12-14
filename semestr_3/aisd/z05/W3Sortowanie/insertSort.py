def insertSort( theSeq ):
    n = len(theSeq)
    for i in range(1, n):
        value = theSeq[i]
        pos = i
        while(pos>0 and value < theSeq[pos-1]):
            theSeq[pos] = theSeq[pos-1]
            theSeq[pos-1] = value   #czytelniejsze
            pos -= 1
            # theSeq[pos] = value

a = [3,5,2,1,4]
print("before insertSort:\t", a)
insertSort(a)
print("after insertSort:\t", a)
