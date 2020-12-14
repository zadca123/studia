#!/usr/bin/env python2
# -*- coding: utf-8 -*-
"""
Created on Tue Apr 21 17:41:25 2020

@author: radek
"""

#reurencyjna funkcja
def tail_factorial(n, accumulator=1):
  if n == 0: 
      return accumulator
  else: 
      return tail_factorial(n-1, accumulator * n)
  
#interfejs    
def factorial(n):
    return tail_factorial(n, accumulator=1)
    
    
#wywołanie
print("3!=",factorial(3))