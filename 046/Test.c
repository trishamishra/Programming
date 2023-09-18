#include <stdio.h>

int main(void)
{
    int number;
    printf("Enter a positive integer: ");
    scanf("%d", &number);

    if (number == 1)
    {
        printf("Factors = %d\n", number);
    }

    else
    {
            int i = 1;

            if (number % i == 0)
            {
                while(i < number)
                {
                    printf( "%d, ", i);
                    ++i;
                }
                printf(" and %d", i)

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
