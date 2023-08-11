#include <stdio.h>

int main(void)
{
    int a, b;
    printf("Enter 2 integers: ");
    scanf("%d", &a);
    scanf("%d", &b);

    if (a > b)
    {
        printf("%d is the larger one\n", a);
    }

    else if (b > a)
    {
        printf("%d is the larger one\n", b);
    }

    else
    {
        printf("They are equal\n");
    }



    return 0;
}



/*

1)
Enter 2 integers: 5 10
10 is the larger one

2)
Enter 2 integers: 5 5
They are equal

 */
