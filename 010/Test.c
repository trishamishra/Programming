#include <stdio.h>

int main(void)
{
    int a;
    printf("Enter a year: ");
    scanf("%d", &a);

    if ((a % 4 == 0) && (a % 100 != 0))
        printf("%d is a leap year");

    else if ((a % 4 == 0) && (a % 100 == 0) && (a % 400 == 0))
        printf("%d is a leap year");

    else
        printf("%d is not a leap year");

    return 0;
}

/*

Enter a year: 1000
It is not a leap year

*/
