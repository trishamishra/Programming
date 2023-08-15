#include <stdio.h>

int main(void)
{
    printf("* * * * * * * * * * * * * *\n");
    printf("* Choice   Operation      *\n");
    printf("*                         *\n");
    printf("* 1        Addition       *\n");
    printf("* 2        Subtraction    *\n");
    printf("* 3        Multiplication *\n");
    printf("* * * * * * * * * * * * * *\n");

    int a, b;
    printf("Enter 2 integers: ");
    scanf("%d", &a);
    scanf("%d", &b);

    int choice;
    printf("Enter your choice: ");
    scanf("%d", &choice);

    if (choice == 1)
        printf("%d + %d = %d\n", a, b, a + b);

    else if (choice == 2)
        printf("%d - %d = %d\n", a, b, a - b);

    else
        printf("%d * %d = %d\n", a, b, a * b);

    return 0;
}
