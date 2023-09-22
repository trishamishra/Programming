#include <stdio.h>

int main(void)
{
    int number1, number2;
    printf("Enter 2 positive integers: ");
    scanf("%d", &number1);
    scanf("%d", &number2);

    if (number1 > number2)
    {
        int lcm = number1;

        while ((lcm % number1 != 0) || (lcm % number2 != 0))
        {
            ++lcm;
        }

        printf("LCM = %d\n", lcm);
    }

    else if (number2 > number1)
    {
        int lcm = number2;

        while ((lcm % number1 != 0) || (lcm % number2 != 0))
        {
            ++lcm;
        }

        printf("LCM = %d\n", lcm);
    }

    else
    {
        printf("LCM = %d\n", number1);
    }

    // int number;
    // printf("Enter a positive integer: ");
    // scanf("%d", &number);

    // int starting_point;
    // printf("Enter starting point: ");
    // scanf("%d", &starting_point);

    // while (starting_point % number != 0)
    // {
    //     ++starting_point;
    // }

    // printf("HCF is: %d", starting_point);

    return 0;
}



/*

Enter a positive integer: 13
Enter starting point: 50
The next multiple is 52

Enter a positive integer: 20
Enter starting point: 40
The next multiple is 40

*/

/*

1)
Enter 2 positive integers: 1 5
LCM = 5

2)
Enter 2 positive integers: 7 8
LCM = 56

*/
