# MathAPI
Math isn't that hard!


This API is intended to be an easy way
to do maths!

# Installation
[![](https://jitpack.io/v/Will0mane/MathAPI.svg)](https://jitpack.io/#Will0mane/MathAPI)


All you need to use is inside the MathUtils class.
There you can find all the methods currently available.

# Multiples

Let's say I want to do a simple addition: 14+56+43.
I can use the addMultiple(double, double...) method in MathUtils
to solve my problem easily.
So I can call addMultiple(14, 56, 43) which will give me 113 which is
right.

Also note that the first argument is the initial value while the
others you add after are the steps you want to follow.
So addMultiple(14 (initial value), 56 (first addition), 43 (second addition) ... if you want you can add more).
The method will then execute 14 + 56 which is 70 and then 70 + 43 which is 113 (The solution).

This is valid for all the methods included which have the word 'Multiple' in them.

# Root

With MathUtils you can also take the root of a number with a specified index.
For example let's say I want to get the 3√729, I can use the root(double, double) method.
I will run root(729 (base), 3 (index)) to get the root.

# Expressions 

There is also a way to automatically solve already written expressions 
using the expression(ExpressionBuilder) method.
Let's say I want to solve 4x + 3.

## Authors

- [Will0mane](https://www.github.com/Will0mane)
