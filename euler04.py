import sys

def isPalindrome(num):
    s = str(num)
    rev = "".join([x for x in reversed(s)])
    if s == rev:
        return True

max=0
for a in xrange(999,99,-1):
    for b in xrange(990,99,-11):
        prod=a*b
        if prod > max and isPalindrome(prod):
            max = prod
print max
