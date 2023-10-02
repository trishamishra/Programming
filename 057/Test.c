#include <stdio.h>

int main(void)
{
    int r;
    printf("Enter the number of rows (>= 4): ");
    scanf("%d", &r);

    // print first row

    // print r stars

    int x = 1;

    while (x <= r)
    {
        printf("* ");
        ++x;
    }

    // print newline

    printf("\n");

    //////////////////////////////////////////////////////////////////////////

    // print rows 2 to r - 1

    int current_row_number = 2;

    while (current_row_number <= r - 1)
    {
        // print ? spaces
        int spaces_before_asterisk = 1;

        while (spaces_before_asterisk < current_row_number)
        {
            printf("  ");
            ++spaces_before_asterisk;
        }

        // print 1 star
        printf("* ");

        ///////////////////////////////////////////////////////////////

        // print ? spaces
        int spaces_after_asterisk = 1;

        while (spaces_after_asterisk <= r - (current_row_number + 1))
        {
            printf("  ");
            ++spaces_after_asterisk;
        }

        // print 1 star
        printf("* ");

        //////////////////////////////////////////////////////////

        // print newline
        printf("\n");

        ///////////////////////////////////////////////////////

        ++current_row_number;
    }

    //////////////////////////////////////////////////////////////////////////

    // print last row

    // print r - 1 spaces

    int y = 1;

    while (y <= r - 1)
    {
        printf("  ");
        ++y;
    }

    // print 1 star

    printf("* ");

    // print newline

    printf("\n");

    return 0;
}

/*
Enter the number of rows (>= 4): 5

* * * * *
  *     *
    *   *
      * *
        *
11 12 13 14 15
21 22 23 24 25
31 32 33 34 35
41 42 43 44 45
51 52 53 54 55
*/
