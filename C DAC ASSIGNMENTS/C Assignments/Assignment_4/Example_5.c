#include <stdio.h>

int main() {
    int arr[100], size, i, element, position = -1;

    printf("Enter size: ");
    scanf("%d", &size);

    printf("Enter elements: ");
    for(i = 0; i < size; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter element to search: ");
    scanf("%d", &element);

    for(i = 0; i < size; i++) {
        if(arr[i] == element) {
            position = i + 1;   // position starts from 1
            break;
        }
    }

    if(position != -1)
        printf("Element found at position %d", position);
    else
        printf("Element not found");

    return 0;
}