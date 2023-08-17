#include <stdio.h>
#include <math.h>

int main(void)
{
    double a, b, c;
    printf("Enter the values of a , b and c: ");
    scanf("%lf", &a);
    scanf("%lf", &b);
    scanf("%lf", &c);

    double d = (b * b) - (4 * a * c);

    if (d < 0)
    {
        printf("The roots are imaginary.");
    }

    else
    {
        double x = (-b + sqrt(d)) / (2 * a);
        double y = (-b - sqrt(d)) / (2 * a);

        printf("The roots are %f and %f\n", x, y);

        return 0;
    }
}

/*

1)
a x^2 + b x + c = 0

Enter the values of a, b and c: 1 -2 1
The roots are 1.000000 and 1.000000

2)
a x^2 + b x + c = 0

Enter the values of a, b and c: 3 2 1
The roots are imaginary

*/

/*

With scanf(), %lf is for double values.
With print(), %f is for double values.
Just like char is promoted to int, float is promoted to double.

*/

/*

For int, / gives the quotient and % gives the remainder.
For double, / gives the answer with decimal places, and % doesn't exist.

*/
