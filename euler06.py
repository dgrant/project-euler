a=[i for i in xrange(1,101)]
sum=0
for i,val1 in enumerate(a):
    for j,val2 in enumerate(a[i+1:]):
        sum += val1 * val2
print sum*2
