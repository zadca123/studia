import math

def fib(n):
    if(n <= 0):
        return 0
    elif(n == 1):
        return 1
    return fib(n-1) + fib(n-2);

def dynamic_fib(n):
    f = []
    f.append(0)
    f.append(1)
    for i in range(2, n+1):
        f.append(f[i-1] + f[i-2])
    return f[n]

def tail_fib(n, a = 0, b = 1):
    if(n <= 0):
        return a;
    elif(n == 1):
        return b;#
    # print("n=",n,"a=",a,"b=",b)
    return tail_fib(n-1, b, a + b)

# import math
def fib_golden(n):
    phi = (1 + math.sqrt(5))/2
    psi = (1 - math.sqrt(5))/2
    return int((phi**n - psi**n)/ math.sqrt(5))

# -----------------------------------------------------------------------------
# -----------------------------------------------------------------------------
a = fib(10);
b = fib( 6);
c = fib(-2);
print(a, b, c)

a = dynamic_fib(10);
b = dynamic_fib( 6);
c = dynamic_fib(-2);
print(a, b, c)

a = tail_fib(10);
b = tail_fib( 6);
c = tail_fib(-2);
print(a, b, c)

a = fib_golden(10);
b = fib_golden( 6);
c = fib_golden(-2);
print(a, b, c)
