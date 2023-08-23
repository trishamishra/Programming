#include <stdio.h>

int main(void)
{
    int a;
    printf("Enter an integer: ");
    scanf("%d", &a);
    printf("\n");

    int i = 1;

    while (i < 10)
    {
        printf("%d x %d = %d\n", a, i, a * i);
        i++;
    }

    return 0;
}

/*

Enter an integer: 13

13 x 1 = 13
13 x 2 = 26
13 x 3 = 39
...
13 x 9 = 117

 */
