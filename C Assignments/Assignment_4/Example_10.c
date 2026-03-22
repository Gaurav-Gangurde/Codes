#include <stdio.h>

int main() {
    char str1[100], str2[100];
    int i = 0, j = 0;

    printf("Enter first string: ");
    scanf("%s", str1);

    printf("Enter second string: ");
    scanf("%s", str2);

    // Move to end of first string
    while(str1[i] != '\0') {
        i++;
    }

    // Copy second string into first string
    while(str2[j] != '\0') {
        str1[i] = str2[j];
        i++;
        j++;
    }

    str1[i] = '\0';  // End the concatenated string

    printf("Concatenated string: %s", str1);

    return 0;
}