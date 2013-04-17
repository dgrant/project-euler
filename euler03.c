/*
 * Solution similar to one I saw online where he was incrementing the divisor
 * and dividing the number, no prime-checking involved.
 *
 * TODO: -improve further by jumping factors by 2 after factoring out 2 completely.
 *       -stop when divisor gets to sqrt(number)
 */
#include <stdio.h>

int largestPrimeFactor(long number) {
  int divisor=2;

  while (number > 1) {
    if (number % divisor == 0) {
      // When we get in here, divisor must be a prime, any non-prime
      // like 4, would have been exhausted by two divisions by 2 and
      // so number would no longer be divible by 4
      number /= divisor;
    } else {
      divisor++;
    }
  }
  return divisor;
}

int main(int argc, char** argv) {
  int result = largestPrimeFactor(600851475143);
  printf("answer=%d\n", result);
}
