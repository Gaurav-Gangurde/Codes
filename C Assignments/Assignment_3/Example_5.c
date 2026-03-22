#include <stdio.h>

// Function to check prime
int isPrime(int n) {
    if (n <= 1)
        return 0;

    for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0)
            return 0;
    }

    return 1;
}

int main() {
    int num;

    printf("Enter number: ");
    scanf("%d", &num);

    if (isPrime(num))
        printf("%d is Prime\n", num);
    else
        printf("%d is Not Prime\n", num);

    return 0;
}