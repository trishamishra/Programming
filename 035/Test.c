#include <stdio.h>

int main(void)
{
    int ll, ul ;
    printf("Enter lower and upper limits: ");
    scanf("%d", &ll);
    scanf("%d", &ul);

    int s = 0;

    while (ll < ul)
    {
        printf("%d + ", ll);
        s = s + ll;
        ll++;
    }

    printf("%d = %d\n", ll, s + ll);

    return 0;
}

/*

Enter lower and upper limits: 7 15
7 + 8 + 9 + 10 + 11 + 12 + 13 + 14 + 15 = 99

 */
