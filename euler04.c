#include <math.h>
#include <stdio.h>

#define BOOL int
#define TRUE 1
#define FALSE 0

BOOL isPalindrome1(int num) {
    int len = floor(log10(num)) + 1;
    char s[len];
    sprintf(s, "%d", num);

    int i=0;
    for (i=0; i<len/2; ++i) {
        if (s[i] != s[len-i-1]) {
            return FALSE;
        }
    }
    return TRUE;
}

BOOL isPalindrome2(int num) {
    int len;
    int mult;
    for (len=floor(log10(num))+1; len > 1; len-=2) {
        mult=pow(10,len-1);
        if (num / mult != num % 10) {
            return FALSE;
        }
        // Remove first digit of number
        num = num % mult;
        // Remove last digit of number
        num /= 10;
    }
    return TRUE;
}

int main(int argc, char* argv) {
    int i,j;
    unsigned int maxVal=0,mult;

    for (i=999; i >= 100; --i) {
        // start at 990 and only decrement by 11, because all palindromes are divisible by 11
        for (j=990; j >= 100; j-=11) {
            mult = i*j;
            if (mult > maxVal && isPalindrome2(mult)) {
                maxVal = mult;
            }
        }
    }
    printf("result=%d\n", maxVal);
    return;
}
