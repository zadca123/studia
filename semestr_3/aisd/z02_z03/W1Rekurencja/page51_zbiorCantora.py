# # przeczycać życiorys Cantora
WIDTH = 81
HEIGHT = 5

# Zmiany
# przekonwertowanie kodu z python2 na python3+
# zmiana xrange na range
# przekonwertowanie zmiennej seg z float na int
lines = []
def cantor(start, n, index):
    seg = n / 3
    seg = int(seg)
    if seg == 0:
        return None
    for it in range(HEIGHT-index):
        i = index + it
        for jt in range(seg):
            j = start + seg + jt
            pos = i * WIDTH + j
            # print(lines)
            # print(pos)
            lines[pos] = " "
    cantor(start            , seg, index + 1)
    cantor(start + seg * 2  , seg, index + 1)
    return None

lines = ["*"] * (WIDTH*HEIGHT)
cantor(0, WIDTH, 1)

for i in range(HEIGHT):
    beg = WIDTH * i
    print("".join(lines[beg: beg+WIDTH]))
