def numDivisors(num):
    return _numDivisors(num)

cdef _numDivisors(int num):
    cdef int total
    cdef int test
    total = 1
    test = num/2
    while test > 0:
        if num % test == 0:
            total = total + 1
        test = test - 1
    return total
