#include <stdio.h>

int main(void)
{
    int number;
    printf("Enter a positive integer: ");
    scanf("%d", &number);

    int sum = 0;
    int extracted_digit;
    // int extracted_digit = number % 10;
    // printf("%d ", extracted_digit);
    // number = number / 10;
    // int sum = extracted_digit;

    // while (number % 10 != number)

    while (number > 9)
    {
        extracted_digit = number % 10;
        printf("%d + ", extracted_digit);
        number = number / 10;
        sum = sum + extracted_digit;
    }

    // extracted_digit = number % 10;
    // printf("%d = %d\n", extracted_digit, (sum + extracted_digit));

    printf("%d = %d\n", number, sum + number);

    return 0;
}
// int extracted_digit = number % 10;
    // printf("%d ", extracted_digit);
    // number = number / 10;
    // int sum = extracted_digit;

    // while (number % 10 != number)


/*

Enter a positive integer: 1024
4 + 2 + 0 + 1 = 7

 */
