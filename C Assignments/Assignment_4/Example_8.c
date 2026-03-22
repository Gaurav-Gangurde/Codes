#include <stdio.h>

int main() {
    char str[100];
    int i = 0, length = 0;

    printf("Enter string: ");
    scanf("%s", str);

    // Find length of string
    while(str[i] != '\0') {
        length++;
        i++;
    }

    printf("Reversed string: ");

    // Print string in reverse
    for(i = length - 1; i >= 0; i--) {
        printf("%c", str[i]);
    }

    return 0;
}