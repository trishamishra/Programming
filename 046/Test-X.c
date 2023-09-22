#include <stdio.h>

int main(void)
{
    int number;
    printf("Enter a positive integer: ");
    scanf("%d", &number);

    if (number == 1)
    {
        printf("Factors = 1\n");
    }

    else
    {
        printf("1");

        int i = 2;

        while (i < number)
        {
            if (number % i == 0)
            {
                printf(", %d", i);
            }

            ++i;
        }

        printf(" and %d\n", number);
    }

    return 0;
}

/*

1)
Enter a positive integer: 1
Factors = 1

2)
Enter a positive integer: 10
Factors = 1, 2, 5 and 10

3)
Enter a positive integer: 13
Factors = 1 and 13

*/
