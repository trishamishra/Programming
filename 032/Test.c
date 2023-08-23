#include <stdio.h>

int main(void)
{
    int ll, ul;
    printf("Enter lower and upper limits: ");
    scanf("%d", &ll);
    scanf("%d", &ul);

    if (ll % 2 != 0)
        ll++;

    if (ul % 2 != 0)
        ul--;

    if (ul == ll)
    {
        printf("%d\n", ul);
    }

    else
    {
        while (ll <= (ul - 4))
        {
            printf("%d, ", ll);
            ll = ll + 2;
        }

        printf("%d and %d\n", ll, ll + 2);
    }

    return 0;
}

/*

Enter lower and upper limits: 7 25
Even integers are 8, 10, 12, 14, 16, 18, 20, 22 and 24

*/
