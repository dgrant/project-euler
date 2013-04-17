from prime_util import getPrimes
from math import sqrt

num = 317584931803
primes = getPrimes(int(sqrt(num)))

for prime in reversed(primes):
    if num % prime == 0:
        break
print prime
