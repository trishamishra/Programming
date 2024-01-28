#include <stdio.h>

int main(void)
{
    int r;
    printf("Enter the number of rows (>= 3): ");
    scanf("%d", &r);

    int c;
    printf("Enter the number of columns (>= 3): ");
    scanf("%d", &c);

    int star = 1;

    while (star <= c)
    {
        printf("* ");
        ++star;
    }

    printf("\n");

    //////////////////////////////////////////////////////////////////////

    int i = 2;

    while (i <= r - 1)
    {
        printf("* ");

        int j =1;

        while ( j <= c-2)
        {
            printf("  ");
            ++j;
        }
        printf("* ");

        printf("\n");

        ++i;

    }
    ////////////////////////////////////////////////////////////////////
    star    = 1;

    while (star <= c)
    {
        printf("* ");
        ++star;
    }
    printf("\n");



    return 0;
}

/*

Enter the number of rows (>= 3): 10
Enter the number of columns (>= 3): 5

* * * * *
*       *
*       *
*       *
*       *
*       *
*       *
*       *
*       *
* * * * *

11 12 13 14 15
21 22 23 24 25
31 32 33 34 35
41 42 43 44 45

*/


