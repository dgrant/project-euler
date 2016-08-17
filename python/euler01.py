#!/usr/bin/env python3

def sumOfMultiples(max, multiple):
    n = max // multiple
    return multiple*n*(n+1) // 2

print(sumOfMultiples(999,3) + sumOfMultiples(999,5) - sumOfMultiples(999,15))

    

