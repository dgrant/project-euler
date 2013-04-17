#Find the 10001st prime
import time

from prime_util import getPrimes

if __name__ == "__main__":
    whichPrime = 10001
    limit = 1000000
    startTime = time.time()
    primes = getPrimes(limit)
    print primes[whichPrime]
    print "took=", time.time() - startTime
