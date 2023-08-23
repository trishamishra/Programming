#include <stdio.h>

int main(void)
{
    int number;
    printf("Enter a positive integer: ");
    scanf("%d", &number);

    int remainder = number % 10;
    printf("%d ", remainder);
    number = number / 10;
    int sum = remainder;

    while (number != 0)
    {
        remainder = number % 10;
        printf("+ %d ", remainder);
        number = number / 10;
        sum = sum + remainder;
    }

    printf("= %d\n", sum);

    return 0;
}

/*

Enter a positive integer: 1024
4 + 2 + 0 + 1 = 7

 */
