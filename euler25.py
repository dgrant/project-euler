a1=1
a2=1
count = 2
while len(str(a2))!=1000:
    new = a1+a2
    a1=a2
    a2=new
    count += 1
print count
