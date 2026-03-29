#include <stdio.h>

// Function to print multiplication table
void printTable(int n) {
    for(int i = 1; i <= 10; i++) {
        printf("%d x %d = %d\n", n, i, n * i);
    }
}

int main() {
    int num;

    printf("Enter number: ");
    scanf("%d", &num);

    printTable(num);

    return 0;
}