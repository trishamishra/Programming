#include <stdio.h>

int main(void)
{
    int number;
    printf("Enter a positive integer: ");
    scanf("%d", &number);

    if (number == 1)
    {
        printf("1 is neither prime nor composite.\n");
    }

    else
    {
        int i = 2;
        int number_of_factors = 1;

        while (i <= number)
        {
            if (number % i == 0)
                ++number_of_factors;

            ++i;
        }

        if (number_of_factors > 2)
            printf("%d is composite\n", number);
        else
            printf("%d is prime\n", number);
    }

    return 0;
}

/*

1)
Enter a positive integer: 1
1 is neither prime nor composite

2)
Enter a positive integer: 10
10 is composite

3)
Enter a positive integer: 13
13 is prime

*/
