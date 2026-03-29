#include <stdio.h>

// Function to reverse number
int reverseNumber(int n) {
    int reversed = 0;

    while (n != 0) {
        reversed = reversed * 10 + n % 10;
        n = n / 10;
    }

    return reversed;
}

int main() {
    int num, result;

    printf("Enter number: ");
    scanf("%d", &num);

    result = reverseNumber(num);

    printf("Reversed number = %d\n", result);

    return 0;
}