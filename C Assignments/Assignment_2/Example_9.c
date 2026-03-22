#include <stdio.h>

int main() {
    double salary, tax = 0;

    printf("Enter annual salary: ");
    scanf("%lf", &salary);

    if (salary <= 250000) {
        tax = 0;
    }
    else if (salary <= 500000) {
        tax = salary * 0.05;
    }
    else if (salary <= 1000000) {
        tax = salary * 0.20;
    }
    else {
        tax = salary * 0.30;
    }

    printf("Income Tax = %.2lf\n", tax);

    return 0;
}