import time

def triangle(max):
    count=1
    sum = 1
    while count < max:
        yield sum
        count += 1
        sum += count

def numDivisors(num):
    upperLimit = num/2+1
    test=2
    total=2
    while test < upperLimit:
        if num % test == 0:
            total += 2
            upperLimit = num/test
            #if we just found a perfect square, don't count divisor twice
            if upperLimit == test:
                total -= 1
        test += 1
    return total

startTime=time.time()
for x in triangle(100000):
    num = numDivisors(x)
    if num > 500:
        print x, "has over 500 divisors"
        break
print "took", time.time() - startTime
