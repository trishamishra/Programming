#include <stdio.h>

int main(void)
{
    int a;
    printf("Enter an integer: ");
    scanf("%d", &a);

    if (a % 2 == 0)
        printf("%d is even\n", a);

    else
        printf("%d is odd\n", a);

    return 0;
}

/*

Enter an integer: 4
4 is even

*/
