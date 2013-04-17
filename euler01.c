#include <stdio.h>

int sumOfMultiples(max, multiple) {
    int n = max/multiple;
    return multiple*n*(n+1)/2;
}

int main(int argc, char** argv) {
    int sum = sumOfMultiples(999,3) + sumOfMultiples(999,5) - sumOfMultiples(999,15);
    printf("sum=%d\n", sum);
}
