#include <stdio.h>

int main(void)
{
    double b;
    printf("Enter the base: ");
    scanf("%lf", &b);

    int e;
    printf("Enter the integral exponent: ");
    scanf("%d", &e);

    printf("\n");

    if ((b == 0.0) && (e == 0))
    {
        printf("0 ^ 0 is undefined\n");
    }

    // else if (((b > 0.0) || (b < 0.0)) && (e == 0))
    // else if ((b != 0.0) && (e == 0))
    else if (e == 0)
    {
        printf("%g ^ 0 = 1\n", b);
    }

    else if ((b == 0.0) && (e < 0))
    {
        printf("Dividing by 0 is undefined\n");
    }

    else if (e < 0)
    {
        printf("%g ^ %d = ", b, e);

        double result = 1.0;

        while (e < 0)
        {
            result = result * b;
            ++e;
        }

        printf("%g\n", 1 / result);
    }

    else if ((b == 0.0) && (e > 0))
    {
        printf("0 ^ %d = 0\n", e);
    }

    else // if (e > 0)
    {
        printf("%g ^ %d = ", b, e);

        double result = 1.0;

        while (e > 0)
        {
            result = result * b;
            --e;
        }

        printf("%g\n", result);
    }

    return 0;
}

/*

Note: Try using %g with printf() to print double values.

1)
Enter the base: 1.2
Enter the integral exponent: 3

1.2 ^ 3 = 1.728

2)
Enter the base: -2.5
Enter the integral exponent: -2

-2.5 ^ -2 = 0.16

3)
Enter the base: 7
Enter the integral exponent: 0

7 ^ 0 = 1

4)
Enter the base: 0
Enter the integral exponent: 4

0 ^ 4 = 0

5)
Enter the base: 0
Enter the integral exponent: 0

0 ^ 0 is undefined

6)
Enter the base: 0
Enter the integral exponent: -3

Dividing by 0 is undefined

*/

/*

b e

0 0
0 +
0 -
+ 0
+ +
+ -
- 0
- +
- -

*/
