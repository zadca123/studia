import turtle

def draw_triangle(points, color, t):
    t.fillcolor(color)
    t.up()
    t.goto(points[0][0],points[0][1])
    t.down()
    t.begin_fill()
    t.goto(points[1][0], points[1][1])
    t.goto(points[2][0], points[2][1])
    t.goto(points[0][0], points[0][1])
    t.end_fill()

def get_mid(p1, p2):
    return ((p1[0] + p2[0]) / 2, (p1[1] + p2[1]) / 2)

def sierpinski(points, degree, t):
    color_map = ['blue', 'red', 'green', 'white', 'yellow','violet','orange']
    draw_triangle(points, color_map[degree], t)
    if degree > 0:
        sierpinski([points[0], get_mid(points[0], points[1]),
                    get_mid(points[0], points[2])],degree-1, t)
        sierpinski([points[1],get_mid(points[0], points[1]),
                    get_mid(points[1], points[2])],degree-1, t)
        sierpinski([points[2],get_mid(points[2], points[1]),
                    get_mid(points[0], points[2])], degree-1, t)

def main():
    t = turtle.Turtle()
    my_win = turtle.Screen()
    # my_points = [[-100, -50], [0, 100], [100, -50]]
    my_points = [[0,0], [100, 0], [50, 100]]
    # my_points = [[0,0], [100, 0], [100, 100],[0,100]]
    sierpinski(my_points, 3, t)
    my_win.exitonclick()

main()
# x = get_mid([0,0], [0,10])
# # x = draw_triangle()
# print(x)
