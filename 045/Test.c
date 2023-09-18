#include <stdio.h>

int main(void)
{
    int number;
    printf("Enter a positive integer: ");
    scanf("%d", &number);

    if (number == 1)
    {
        printf("%d! = %d\n", number, number);
    }

    else
    {
        printf("%d! = ", number);

        int result = number;

        while (number > 1)
        {
            printf("%d x ", number);
            --number;
            result = result * number;
        }

        printf("1 = %d\n",result);
    }

    return 0;
}

/*

1)
Enter a positive integer: 1
1! = 1

2)
Enter a positive integer: 5
5! = 5 x 4 x 3 x 2 x 1 = 120

*/
