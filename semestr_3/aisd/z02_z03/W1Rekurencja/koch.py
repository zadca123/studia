import turtle

def koch(t, order, size):
    if order == 0:
        # The base case is just a straight line
        t.forward(size)
    else:
        koch(t, order-1, size/3) # Go 1/3 of the way
        t.left(60)
        koch(t, order-1, size/3)
        t.right(120)
        koch(t, order-1, size/3)
        t.left(60)
        koch(t, order-1, size/3)

def koch_better(t, order, size):
    if order == 0:
        t.forward(size)
    else:
        for angle in [60, -120, 60, 0]:
            koch(t, order-1, size/3)
            t.left(angle)

t = turtle.Turtle() # Create the turtle
wn = turtle.Screen()
# koch(t, 2, 200)
koch_better(t, 2, 200)
wn.exitonclick()
