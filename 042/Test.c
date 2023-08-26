/*

1)
Enter a positive integer: 1234
After swapping first and last digits, 4231

2)
Enter a positive integer: 1230
After swapping first and last digits, 231

*/

#include <stdio.h>
#include <math.h>

int main(void)
{
    int number;
    printf("Enter a positive integer: ");
    scanf("%d", &number);

    int digits = (int) log10((double) number) + 1;
    int divisor = (int) pow(10.0, (double) (digits - 1));

    int first_digit = number / divisor;
    int last_digit = number % 10;

    int temp1_number = number % divisor;
    int temp2_number = last_digit * divisor + temp1_number;
    int temp3_number = temp2_number / 10;

    int new_number = temp3_number * 10 + first_digit;

    printf("After swapping first and last digits, %d\n", new_number);

    return 0;
}
