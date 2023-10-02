#include <stdio.h>

int main(void)
{
    int r;
    printf("Enter the number of rows (>= 3): ");
    scanf("%d", &r);

    int c;
    printf("Enter the number of columns (>= 3): ");
    scanf("%d", &c);

    // print first row

    // print c starts

    int x = 1;

    while (x <= c)
    {
        printf("* ");
        ++x;
    }

    printf("\n");

    /////////////////////////////////////////////////////////

    // print rows 2 to r - 1

    int i = 2;

    while (i <= r - 1)
    {
        // print 1 star

        printf("* ");

        ///////////////////////////////////////////////////

        // print c - 2 spaces

        int z = 1;

        while (z <= c - 2)
        {
            printf("  ");
            ++z;
        }

        /////////////////////////////////////////////////

        // print 1 star

        printf("* ");

        //////////////////////////////////////////////

        // print newline

        printf("\n");

        //////////////////////////////////////////

        ++i;
    }

    ////////////////////////////////////////////////////////

    // print last row

    // print c stars

    int y = 1;

    while (y <= c)
    {
        printf("* ");
        ++y;
    }

    printf("\n");

    return 0;
}

/*

Enter the number of rows (>= 3): 4
Enter the number of columns (>= 3): 5

* * * * *
*       *
*       *
* * * * *

11 12 13 14 15
21 22 23 24 25
31 32 33 34 35
41 42 43 44 45

*/


