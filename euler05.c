const int divisors[] = {19,18,17,16,15,14,13,12,11};

int check(int n) {
    int i=0;
    for (i=0; i < 9; i++) {
        if (n % divisors[i] != 0) {
            return 0;
        }
    }
    return 1;
}

int find(int max) {
    int guess = max;
    while (1) {
        if (check(guess)) {
            break;
        }
        else {
            guess += 20;
        }
    }
    return guess;
}
