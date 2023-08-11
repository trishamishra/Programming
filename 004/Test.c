#include <stdio.h>

int main(void)
{
    int a;
    printf("Enter an integer: ");
    scanf("%d", &a);

    if (a > 0)
        printf("%d is positive\n", a);
    else if (a < 0)
        printf("%d is negative\n", a);
    else
        printf("%d is zero\n", a);

    return 0;
}



/*

1)
Enter an integer: 5
5 is positive

2)
Enter an integer: 0
0 is zero

3)
Enter an integer: -2
-2 is negative

*/
