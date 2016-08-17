prod=1
for i in xrange(1,101):
    prod *= i
print sum([int(x) for x in str(prod)])
