from math import sqrt

sum=1000

a=1
b=1

def f(a,b):
    return a + b + sqrt(a**2 + b**2)

done = False
for i in xrange(a,sum):
    for j in xrange(i+1,sum):
        result = f(i,j)
        if result > sum:
            break
        elif result == sum:
            a=i
            b=j
            break
    if result == sum:
        break

c=sqrt(a**2+b**2)
print "a=",a,"b=",b,"c=",c
print "product=",a*b*c
