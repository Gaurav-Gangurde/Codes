#include <stdio.h>

int main() {
    char ch;

    printf("Enter a character: ");
    scanf(" %c", &ch);   // Space before %c to avoid newline issue

    if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
        ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
        printf("It is a Vowel.\n");
    } else {
        printf("It is a Consonant.\n");
    }

    return 0;
}