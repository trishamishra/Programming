#include <stdio.h>

int main(void)
{
    int a, b, c;
    printf("Enter the side lengths: ");
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);

    if (((a + b) > c) && ((b + c) > a) && ((a + c) > b))
    {
        if ((a == b) && (a == c))
            printf("It is an equilateral triangle\n");

        else if ((a == b) || (a == c) || (b == c))
            printf("It is an isosceles triangle\n");

        else
            printf("It is a scalene triangle\n");
    }

    else
    {
        printf("It is an invalid triangle\n");
    }

    return 0;
}
/*

1)
Enter the side lengths: 4 10 7
It is a scalene triangle

2)
Enter the side lengths: 4 6 4
It is an isosceles triangle

3)
Enter the side lengths: 5 5 5
It is an equilateral triangle

4)
Enter the side lengths: 4 10 6
It is an invalid triangle

 */
