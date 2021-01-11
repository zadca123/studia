def make_queue():
    queue = []

    def length():
        return len(queue)
    
    def show():
        for name in queue: print("waiting customer: {}".format(name))
    
    def add(name):
        queue.insert(0, name)

    def next():
        return queue.pop()

    return add, next, show, length


q1_add, q1_next, q1_show, q1_length = make_queue()
q2_add, q2_next, q2_show, q2_length = make_queue()
q1_add('Spearing'); q1_add('Fangohr'); q1_add('Takeda')
q2_add('John'); q2_add('Peter')
print("{} customers in queue1:".format(q1_length())); q1_show()
print("{} customers in queue2:".format(q2_length())); q2_show()