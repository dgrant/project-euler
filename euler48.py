sum=0
max=1000
for i in xrange(1,max+1):
    sum += i**i
print str(sum)[-10:]
