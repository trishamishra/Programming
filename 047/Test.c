#include <stdio.h>

int main(void)
{
    int number1, number2;
    printf("Enter 2 positive integers: ");
    scanf("%d", &number1);
    scanf("%d", &number2);

    int common_factor;
    int i = 1;

    while ((i <= number1) && (i <= number2))
    {
        if ((number1 % i == 0) && (number2 % i == 0))
        {
            common_factor = i;
        }

        ++i;
    }

    printf("HCF = %d\n", common_factor);

    return 0;
}

/*

1)
Enter 2 positive integers: 1 5
HCF = 1

2)
Enter 2 positive integers: 7 21
HCF = 7

*/
