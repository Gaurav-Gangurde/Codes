#include <stdio.h>

int main() {
    char str[100];
    int i = 0, length = 0, flag = 1;

    printf("Enter string: ");
    scanf("%s", str);

    // Find length of string
    while(str[length] != '\0') {
        length++;
    }

    // Check palindrome
    for(i = 0; i < length/2; i++) {
        if(str[i] != str[length - i - 1]) {
            flag = 0;
            break;
        }
    }

    if(flag == 1)
        printf("It is a Palindrome");
    else
        printf("It is not a Palindrome");

    return 0;
}