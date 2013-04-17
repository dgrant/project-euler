#include <stdio.h>

int main(int argc, char** argv) {
  int i=1;
  int j=1;
  int val=0;
  int sum=0;

  while (val < 4000000) {
    sum += val;
    int temp = val;
    i = temp + j;
    j = temp + i;
    val = i + j;
  }

  printf("sum=%d\n", sum);
}
