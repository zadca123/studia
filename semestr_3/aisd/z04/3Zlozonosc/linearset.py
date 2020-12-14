class Set :
    def __init__( self ):
        self._theElements = list()
    def __len__( self ):
        return len( self._theElements )
    def __contains__( self, element ):
        return element in self._theElements
    def add( self, element ):
        if element not in self :
            self._theElements.append( element )
    def remove( self, element ):
        assert element in self, "The element must be in the set."
        self._theElements.remove( item )

    def __eq__( self, setB ):
        if len( self ) != len( setB ) :
            return False
        else :
            return self.isSubsetOf( setB )

    def isSubsetOf( self, setB ):
        for element in self :
            if element not in setB :
                return False
        return True

    def union( self, setB ):
        newSet = Set()
        newSet._theElements.extend( self._theElements )
        for element in setB :
            if element not in self :
                newSet._theElements.append( element )
        return newSet

    def slice(self,theList, first, last):
        newSet = Set()
        i = 0
        for element in theList:
            if(first <= i < last):
                print("czesc")
                print(element)
                newSet._theElements.append(element)
            i+=1
        return newSet


x = Set()
x.add(1)
x.add(2)
x.add(3)
x.add(4)
print(x._theElements)
y = Set()
x = [2,3,4,5,6,7,8]
y.slice(x,0,2)
print(y._theElements)

# first = 2
# last = 10
# for i in range(first, last):
#     print(i)
