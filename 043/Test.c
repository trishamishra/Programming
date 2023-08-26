/*

Enter a non-negative integer: 1234

| 0 | 0 |
| 1 | 1 |
| 2 | 1 |
| 3 | 1 |
| 4 | 1 |
| 5 | 0 |
| 6 | 0 |
| 7 | 0 |
| 8 | 0 |
| 9 | 0 |

Note: Solve this problem using if-else in one language and using switch in the
      other language.

*/

#include <stdio.h>
#include <math.h>

int main(void)
{
    int number;
    printf("Enter a positive integer: ");
    scanf("%d", &number);
    printf("\n");

    // int digits = 0;

    // while (number != 0)
    // {
    //     number = number / 10;
    //     ++digits;
    // }

    int digits = (int) log10((double) number) + 1;
    int divisor = (int) pow(10.0, (double) (digits - 1));

    int c0 = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0;
    int c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0;

    while (divisor > 0)
    {
        int first_digit = number / divisor;

        if (first_digit == 0)
            ++c0;
        else if (first_digit == 1)
            ++c1;
        else if (first_digit == 2)
            ++c2;
        else if (first_digit == 3)
            ++c3;
        else if (first_digit == 4)
            ++c4;
        else if (first_digit == 5)
            ++c5;
        else if (first_digit == 6)
            ++c6;
        else if (first_digit == 7)
            ++c7;
        else if (first_digit == 8)
            ++c8;
        else
            ++c9;

        number = number % divisor;
        divisor = divisor / 10;
    }

    printf("| 0 | %d |\n", c0);
    printf("| 1 | %d |\n", c1);
    printf("| 2 | %d |\n", c2);
    printf("| 3 | %d |\n", c3);
    printf("| 4 | %d |\n", c4);
    printf("| 5 | %d |\n", c5);
    printf("| 6 | %d |\n", c6);
    printf("| 7 | %d |\n", c7);
    printf("| 8 | %d |\n", c8);
    printf("| 9 | %d |\n", c9);

    return 0;
}
