#include <stdio.h>

// Function to calculate factorial
long long factorial(int n) {
    long long fact = 1;
    for(int i = 1; i <= n; i++) {
        fact = fact * i;
    }
    return fact;
}

int main() {
    int num;
    long long result;

    printf("Enter number: ");
    scanf("%d", &num);

    result = factorial(num);

    printf("Factorial = %lld\n", result);

    return 0;
}