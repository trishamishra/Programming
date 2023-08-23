#include <stdio.h>

int main(void)
{
    int ul,ll;
    printf("Enter upper and lower limit: ");
    scanf("%d", &ul);
    scanf("%d", &ll);

    if (ul == ll)
    {
        printf("%d ", ul);
    }

    else
    {
        while (ul >= (ll + 2))
        {
            printf("%d, ", ul);
            ul--;
        }

        printf("%d and %d", ul, ul - 1);
    }

    return 0;
}

/*

Enter upper and lower limit: 20 15
20, 19, 18, 17, 16 and 15

 */
