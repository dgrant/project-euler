spiralSize = 1001
sum=1
period=2
dimension=2
count=0
n=1
while dimension < spiralSize:
    n += period
    sum += n
    count += 1
    if count == 4:
        count = 0
        period += 2
        dimension += 2
print sum
