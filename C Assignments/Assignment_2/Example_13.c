#include <stdio.h>

int main() {
    int choice;

    printf("1. Even or Odd\n");
    printf("2. Greatest of Two Numbers\n");
    printf("3. Grade Calculator\n");
    printf("4. Exit\n");

    printf("Enter your choice: ");
    scanf("%d", &choice);

    switch(choice) {

        case 1: {
            int num;
            printf("Enter number: ");
            scanf("%d", &num);

            if (num % 2 == 0)
                printf("Number is Even.\n");
            else
                printf("Number is Odd.\n");
            break;
        }

        case 2: {
            int a, b;
            printf("Enter two numbers: ");
            scanf("%d %d", &a, &b);

            if (a > b)
                printf("%d is the greatest number.\n", a);
            else if (b > a)
                printf("%d is the greatest number.\n", b);
            else
                printf("Both numbers are equal.\n");
            break;
        }

        case 3: {
            int marks;
            printf("Enter marks: ");
            scanf("%d", &marks);

            if (marks >= 90)
                printf("Grade: A\n");
            else if (marks >= 75)
                printf("Grade: B\n");
            else if (marks >= 60)
                printf("Grade: C\n");
            else if (marks >= 40)
                printf("Grade: D\n");
            else
                printf("Fail\n");
            break;
        }

        case 4:
            printf("Exiting program...\n");
            break;

        default:
            printf("Invalid choice.\n");
    }

    return 0;
}