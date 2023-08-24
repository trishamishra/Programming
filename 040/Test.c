#include <stdio.h>
#include <math.h>

int main(void)
{
    int number;
    printf("Enter a positive integer: ");
    scanf("%d", &number);

    // int digits = 0;

    // while (number != 0)
    // {
    //     number = number / 10;
    //     ++digits;
    // }

    int digits = (int) log10((double) number) + 1;
    int divisor = (int) pow(10.0, (double) (digits - 1));

    int sum = 0;

    while (divisor >= 10)
    {
        int extracted_digit = number / divisor;
        sum = sum + extracted_digit;
        printf("%d + ", extracted_digit);
        number = number % divisor;
        divisor = divisor / 10;
    }

    // int extracted_digit = number / divisor;
    // printf("%d = %d\n", extracted_digit, sum + extracted_digit);

    printf("%d = %d\n", number, sum + number);

    return 0;
}

/*

Enter a positive integer: 1024
1 + 0 + 2 + 4 = 7

Note: Don't reverse the integer.

 */
