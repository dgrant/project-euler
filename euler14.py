import time

def next(n):
    if n%2 == 0:
        return n/2
    else:
        return 3*n+1

startTime = time.time()

table={}
startingValue=999999
max=0
for n0 in xrange(startingValue,1,-1):
    n=n0
    sequence = [n0]
    count = 1
    while n != 1:
        n = next(n)
        tableValue=0
        sequence.append(n)
        try:
            tableValue=table[n]
            count += tableValue
            break
        except:
            count += 1

#    print "sequence=",sequence,"is",count,"long"
    for i,x in enumerate(sequence):
        table[x] = count-i
#    print "table=",table

    if count > max:
        max = count
        maxStartingValue = n0
print "table=",table
print maxStartingValue,"produced the longest chain"
print "took", time.time() - startTime
