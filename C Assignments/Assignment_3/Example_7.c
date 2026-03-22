#include <stdio.h>

// Function to calculate power
int power(int base, int exp) {
    int result = 1;

    for(int i = 1; i <= exp; i++) {
        result = result * base;
    }

    return result;
}

int main() {
    int base, exponent, result;

    printf("Enter base: ");
    scanf("%d", &base);

    printf("Enter exponent: ");
    scanf("%d", &exponent);

    result = power(base, exponent);

    printf("Result = %d\n", result);

    return 0;
}