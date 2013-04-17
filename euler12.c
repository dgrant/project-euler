#include <stdio.h>

int numDivisors(int num) {
	int total = 1;
	int test;
	for (test = 1; test <= num/2; test++) {
		if ((num % test) == 0) {
			total = total + 1;
		}
		// If amount remaining that we need is greater than the number we are testing, give up
		if ((500-total) > (num/2 - test)) {
			break;
		}

	}
	return total;
}

int main() {
	int count = 1;
	int sum = 1;
	int numDiv;
	while (1) {
		if (sum > 500 && sum % 2 == 0) {
			numDiv = numDivisors(sum);
			if (numDiv > 400) {
				printf("count=%d\n", count);
				printf("num=%d, numDiv=%d\n", sum, numDiv);
				break;
			}
		}
		count = count + 1;
		sum = sum + count;
	}
}
