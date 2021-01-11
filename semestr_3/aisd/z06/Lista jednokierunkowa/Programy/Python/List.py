class ListNode:
    def __init__( self, data ) :
        self.data = data
        self.next = None
        
def traversal( head ):
    curNode = head
    while curNode is not None :
        print(curNode.data)
        curNode = curNode.next

def unorderedSearch( head, target ):
    curNode = head
    while curNode is not None and curNode.data != target :
        curNode= curNode.next
    return curNode is not None




a=ListNode(11)
a.next=ListNode(2)
a.next.next = ListNode(5)


traversal(a)

print(unorderedSearch(a, 2))
