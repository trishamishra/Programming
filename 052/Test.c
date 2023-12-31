#include <stdio.h>

int main(void)
{
    int a, b ;
    printf("Enter lower and upper limits:");
    scanf("%d", &a);
    scanf("%d", &b);

    printf("\n");

    while (a <= b)
    {
        int j = 1;

        while (j < 10)
        {
            printf("%d x %d = %d\n", a, j, a * j);
            ++j;
        }

        printf("\n");
        ++a;
    }

    return 0;
}

/*

Note: Nested loops begins from this program.

1)
Enter lower and upper limits: 5 7

5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45

6 x 1 = 6
6 x 2 = 12
6 x 3 = 18
6 x 4 = 24
6 x 5 = 30
6 x 6 = 36
6 x 7 = 42
6 x 8 = 48
6 x 9 = 54

7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63

*/
