Null=None

def nullP( ls ):
    if (ls == Null):
        return(True)
    else:
        return(False)

def cons(a,b):
    return([a,b])
    
def car(ls):
    return(ls[0])

def cdr(ls):
    return(ls[1])
        
def Lenght(ls,n=0):
    if(nullP(ls)):
        return(n)
    else:
        return(Lenght(cdr(ls),n+1))
        
    
l=cons(1, cons(2, cons(3, Null)))

print(car(l))
print(cdr(l))
print(car(cdr(l)))
print(cdr(cdr(l)))
print(Lenght(l))


def Map(f, ls):
    print(ls)
    if (ls != Null):
        return( cons(f(car(ls)), Map(f, cdr(ls))) )
    else:
        return(Null)

def f(x):
    return(2*x)
    
print(Map(f,l))