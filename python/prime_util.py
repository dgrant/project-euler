from math import sqrt

def getPrimes(limit):
    """ 
    Returns all prime numbers below limit
    """ 
    a = range(2,int(sqrt(limit)+1))
    isPrime = [True]*limit
    for n in a:
        if isPrime[n]:
            # for all primes, each multiple of prime from prime*prime to the end must not be prime
            for i in xrange(n*n, limit, n): 
                isPrime[i] = False
    primes = [i for i in xrange(2,len(isPrime)) if isPrime[i]]
    return primes
