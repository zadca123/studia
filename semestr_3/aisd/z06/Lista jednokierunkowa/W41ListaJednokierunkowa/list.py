class ListNode:
    def __init__( self, data ) :
        self.data = data
        self.next = None

    def push(self, value):
        newNode = ListNode(value)
        newNode.next = self
        self = newNode
        return newNode
        # traversal(newNode)
        # return newNode
    def delNode(self):
        del(self)

# wypisz
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
a.push(44)
traversal(a)
a.delNode()
traversal(a)

# print(unorderedSearch(a, 3))
