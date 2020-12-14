#!/usr/bin/env python2
# -*- coding: utf-8 -*-
"""
Created on Tue Apr 21 21:14:20 2020

@author: radek
"""
import turtle


def koch(t, order, size):
    if order == 0:
        t.forward(size)
    else:
        for angle in [60, -120, 60, 0]:
           koch(t, order-1, size/3)
           t.left(angle)



           
t = turtle.Turtle()            # create the turtle
wn = turtle.Screen()

koch(t, 3, 200)

wn.exitonclick()