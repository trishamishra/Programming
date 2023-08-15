#include <stdio.h>

int main(void)
{
    int a;
    printf("Enter 5 integers: ");
    scanf("%d", &a);

    int greatest = a;

    scanf("%d", &a);

    if (greatest < a)
        greatest = a;

    scanf("%d", &a);

    if (greatest < a)
        greatest = a;

    scanf("%d", &a);

    if (greatest < a)
        greatest = a;

    scanf("%d", &a);

    if (greatest < a)
        greatest = a;

    printf("%d is the largest\n", greatest);

    return 0;
}



/*

Enter 5 integers: 3 1 2 0 3
3 is the largest

 */
