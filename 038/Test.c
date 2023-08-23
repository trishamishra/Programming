#include <stdio.h>

int main(void)
{
    int a;
    printf("Enter a positive integer: ");
    scanf("%d", &a);
    printf("%d has ", a);

    int digit = 0;

    while (a != 0)
    {
        a = a / 10;
        ++digit;
    }

    printf("%d digits\n", digit);

    return 0;
}

/*

Enter a positive integer: 1024
1024 has 4 digits

 */
