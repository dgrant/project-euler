mysum=0
i=1
j=1
val=0
while val < 4000000:
    mysum += val
    old_val = val
    i = old_val + j
    j = old_val + i
    val = i + j
print mysum
