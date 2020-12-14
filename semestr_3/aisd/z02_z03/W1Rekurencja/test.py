import turtle

def drawLsystem(aTurtle, instructions, angle, distance):
    for cmd in instructions:
        if cmd == 'F' or cmd == 'G':
            aTurtle.forward(distance)
        elif cmd == '+':
            aTurtle.right(angle)
        elif cmd == '-':
            aTurtle.left(angle)

t = turtle.Turtle()
wn = turtle.Screen()
t.speed(1)
drawLsystem(t,'F+F',120,50)
wn.exitonclick()
