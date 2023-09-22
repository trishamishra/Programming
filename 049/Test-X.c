#include <stdio.h>
#include <math.h>

int main(void)
{
    int number;
    printf("Enter a positive integer: ");
    scanf("%d", &number);

    // int number_of_digits = (int) log10((double) number) + 1;

    int number_of_digits = 0;
    int temp1 = number;

    while (temp1 != 0)
    {
        temp1 = temp1 / 10;
        ++number_of_digits;
    }

    int result = 0;
    int temp2 = number;

    while (temp2 != 0)
    {
        int last_digit = temp2 % 10;
        result = result + (int) pow((double) last_digit, (double) number_of_digits);

        temp2 = temp2 / 10;
    }

    if (result == number)
        printf("%d is an Armstrong number\n", number);
    else
        printf("%d is not an Armstrong number\n", number);

    return 0;
}

/*

1)
Enter a positive integer: 1
1 is an armstrong number

2)
Enter a positive integer: 10
10 is not an armstrong number

3)
Enter a positive integer: 153
153 is an armstrong number

*/
