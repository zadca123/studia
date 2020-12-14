def rec_factorial(n):
    if(n <= 0):
        return 1
    return n * rec_factorial(n-1)

def iter_factorial(n):
    result = 1
    for i in range(1,n+1):
        result = result * i
    return result

def tail_factorial(n, accumulator = 1):
    if(n <= 0):
        return accumulator
    return tail_factorial(n-1, accumulator * n)

a = rec_factorial(10)
b = rec_factorial(0)
c = rec_factorial(-2)
print(a, b, c)

a = iter_factorial(10)
b = iter_factorial(0)
c = iter_factorial(-2)
print(a, b, c)

# a =rec_factorial(-1)
# import sys
# print(sys.getrecursionlimit()) #1000
# # Blokada by nie dopuścić by program wykonywał się w nieskończoność
