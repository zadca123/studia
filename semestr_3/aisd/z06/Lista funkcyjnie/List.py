# None=None
#
def nullP( ls ):
    if (ls == None):
        return(True)
    else:
        return(False)

# Tworzy parę / węzeł
def cons(a,b):
    return([a,b])

# Zwraca pierwszy element pary / węzła
def car(ls):
    return(ls[0])

#Zwraca drugi element pary
def cdr(ls):
    return(ls[1])

# Zwraca długość listy
def Lenght(ls,n=0):
    if(nullP(ls)):
        return(n)
    else:
        return(Lenght(cdr(ls),n+1))

# Służy do odwzorowania funkcji na liste
def Map(f, ls):
    print(ls)
    if (ls != None):
        return( cons(f(car(ls)), Map(f, cdr(ls))) )
    else:
        return(None)

# Podwaja wartość
def f(x):
    return(2*x)

l=cons(1, cons(2, cons(3, None)))
# print(car(l))
# print(cdr(l))
# print(car(cdr(l)))
# print(cdr(cdr(l)))
# print(Lenght(l))

print(Map(f,l))
