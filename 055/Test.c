#include <stdio.h>

int main(void)
{
    int r;
    printf("Enter the number of rows: ");
    scanf("%d", &r);

    int i = 1;

    while (i <= r)
    {
        int c = 1;

        while(c <= i-1)
        {
            printf("  ");
            ++c;
        }

        int star = 1;

        while(star <= (r * 2) - (2 * i) + 1)
        {
            printf("* ");
            ++star;
        }

        // int kushu = 1;

        // while (kushu <= i - 1)
        // {
        //     printf("  ");
        //     ++kushu;
        // }

        printf("\n");

        ++i;
    }
}
/*

Enter the number of rows: 5

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

11 12 13 14 15 16 17 18 19
21 22 23 24 25 26 27 28 29
31 32 33 34 35 36 37 38 39
41 42 43 44 45 46 47 48 49
51 52 53 54 55 56 57 58 59

Enter the number of rows: 3

* * * * *
  * * *
    *

11 12 13 14 15
21 22 23 24 25
31 32 33 34 35

*/








