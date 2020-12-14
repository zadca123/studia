#!/usr/bin/env python2
# -*- coding: utf-8 -*-
"""
Created on Tue Apr 21 18:30:00 2020

@author: radek
"""

def fib_tail(n, a = 0, b = 1): 
    if n == 0: 
        return a 
    if n == 1: 
        return b 
    #print("n=",n,"a=",a,"b=",b)
    return fib_tail(n - 1, b, a + b); 
  
def fib(n):
    return fib_tail(n,a=0,b=1)


n=7
print("fib("+str(n)+") = "+str(fib(n))) 