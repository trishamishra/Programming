#include <stdio.h>

int main(void)
{
    int a;
    printf("Enter a positive integer: ");
    scanf("%d", &a);

    if ((a % 11 == 0) && (a % 5 == 0))
         printf("%d is divisible by both 5 and 11\n", a);

    else if (a % 5 == 0)
        printf("%d is divisible by 5\n", a);

    else if (a % 11 == 0)
        printf("%d is divisible by 11\n", a);

    else
        printf("%d is neither divisible by 5 nor by 11\n", a);

    return 0;
}

/*

1)
Enter a positive integer: 10
10 is divisible by 5

2)
Enter a positive integer: 22
22 is divisible by 11

3)
Enter a positive integer: 55
55 is divisible by both 5 and 11

4)
Enter a positive integer: 6
6 is neither divisible by 5 nor by 11

*/
