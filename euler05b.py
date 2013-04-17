import time
from ctypes import *
startTime = time.time()
max=20

euler = CDLL('euler05.so')

print euler.find(max)
print "took=", time.time() - startTime
